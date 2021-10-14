package my.edu.utar.hawker;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import my.edu.utar.hawker.DAO.SQLiteAdapter;
import my.edu.utar.hawker.model.Hawker;
import my.edu.utar.hawker.utilities.CustomAdapter;

public class Search extends AppCompatActivity {
    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        list = findViewById(R.id.seachListView);


        //Set the action bar
        View actionBar = getLayoutInflater().inflate(R.layout.action_bar, null);
        TextView actionBarName = (TextView) actionBar.findViewById(R.id.nameBar);
        actionBarName.setText("Search by Name");
        this.getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setCustomView(actionBar);
        getSupportActionBar().setElevation(0);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#FFBB86FC")));
        EditText nameSearch = (EditText) findViewById(R.id.editTextSearch);

        Button buttonSearch = (Button) findViewById(R.id.searchButton);

        buttonSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText nameSearch = (EditText) findViewById(R.id.editTextSearch);
                deployListView(nameSearch.getText().toString());
                //nameSearch.setText("");
            }
        });

        nameSearch.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if ((event != null && (event.getKeyCode() == KeyEvent.KEYCODE_ENTER)) || (actionId == EditorInfo.IME_ACTION_DONE)) {
                    //do what you want on the press of 'done'
                    deployListView(nameSearch.getText().toString());
                    //nameSearch.setText("");
                }
                return false;
            }
        });
    }

    public void deployListView(String name) {
        SQLiteAdapter mySQLiteAdapter = new SQLiteAdapter(this);
        mySQLiteAdapter.openToRead();
        ArrayList<Hawker> hawkerList;

        hawkerList = mySQLiteAdapter.querySearchName(name);
        if (hawkerList.size() == 0) {
            Toast toast = Toast.makeText(this, "No Record Found", Toast.LENGTH_SHORT);

            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

        mySQLiteAdapter.close();

        CustomAdapter customAdapter = new CustomAdapter(this, hawkerList);
        list.setAdapter(customAdapter);
    }
}