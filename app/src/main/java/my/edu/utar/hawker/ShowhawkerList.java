package my.edu.utar.hawker;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import my.edu.utar.hawker.DAO.SQLiteAdapter;
import my.edu.utar.hawker.model.Hawker;
import my.edu.utar.hawker.utilities.CustomAdapter;

public class ShowhawkerList extends AppCompatActivity {
    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showhawker_list);
        list = findViewById(R.id.simpleListView);

        //Set the action bar

        View actionBar = getLayoutInflater().inflate(R.layout.action_bar, null);
        TextView actionBarName = (TextView) actionBar.findViewById(R.id.nameBar);
        actionBarName.setText("Hawkers");
        this.getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setCustomView(actionBar);
        getSupportActionBar().setElevation(0);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#FFBB86FC")));


        //DeployList
        deployListView(false, false);

        //Set sort button function
        Button buttonCommend = (Button) findViewById(R.id.sortByCommend);
        buttonCommend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                deployListView(true, false);
            }
        });

        Button buttonName = (Button) findViewById(R.id.sortByName);
        buttonName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                deployListView(false, true);
            }
        });


    }

    public void deployListView(boolean commend, boolean name) {
        SQLiteAdapter mySQLiteAdapter = new SQLiteAdapter(this);
        mySQLiteAdapter.openToRead();
        ArrayList<Hawker> hawkerList;

        if (commend) {
            hawkerList = mySQLiteAdapter.querySortByRecommend();
        } else if (name) {
            hawkerList = mySQLiteAdapter.querySortByName();
        } else
            hawkerList = mySQLiteAdapter.queryAll();

        mySQLiteAdapter.close();

        CustomAdapter customAdapter = new CustomAdapter(this, hawkerList);
        list.setAdapter(customAdapter);
    }
}