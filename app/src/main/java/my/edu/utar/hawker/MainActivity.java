package my.edu.utar.hawker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import my.edu.utar.hawker.DAO.SQLiteAdapter;

public class MainActivity extends AppCompatActivity {
    private SQLiteAdapter mySQLiteAdapter;
    private static boolean firstrun = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Redirect the page
        CardView hawkersCardView = findViewById(R.id.hawkersCardView);
        hawkersCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ShowhawkerList.class);
                startActivity(intent);
            }
        });
        CardView searchCardView = findViewById(R.id.searchCardView);
        searchCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Search.class);
                startActivity(intent);
            }
        });


    }
}