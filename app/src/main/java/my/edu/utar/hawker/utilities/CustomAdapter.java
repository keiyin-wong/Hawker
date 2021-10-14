package my.edu.utar.hawker.utilities;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import my.edu.utar.hawker.R;
import my.edu.utar.hawker.model.Hawker;

public class CustomAdapter extends BaseAdapter {
    Context context;
    ArrayList<Hawker> hawkerList;

    public CustomAdapter(Context context, ArrayList<Hawker> hawkerList) {
        this.context = context;
        this.hawkerList = hawkerList;
    }

    @Override
    public int getCount() {
        return hawkerList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(context).inflate(R.layout.listview_row, null);

        TextView hawkerName = (TextView) view.findViewById(R.id.text1);
        ImageView hawkerImg = (ImageView) view.findViewById(R.id.icon);
        TextView recommnedCount = (TextView) view.findViewById(R.id.recommendCount);
        TextView favoriteCount = (TextView) view.findViewById(R.id.favoriteCount);
        ImageButton recommendButton = (ImageButton) view.findViewById(R.id.recommendIcon);
        ImageButton favorite = (ImageButton) view.findViewById(R.id.favoriteIcon);


        //Set onClickfunction for recommend and favorite button
        recommendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(context, "Recommend " + hawkerList.get(i).getName(), Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
            }
        });
        favorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(context, "Favor " + hawkerList.get(i).getName(), Toast.LENGTH_SHORT);

                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
            }
        });

        //Set onClickfunction for image pop up window
        hawkerImg.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                PopUpWindow popUpWindow = new PopUpWindow(context, hawkerList.get(i));
                popUpWindow.createWindow();
            }
        });

        //Set hawker name and image
        hawkerName.setText(hawkerList.get(i).getName());
        recommnedCount.setText(Integer.toString(hawkerList.get(i).getRecommends()));
        favoriteCount.setText(Integer.toString(hawkerList.get(i).getFavourites()));
        int id = context.getResources().getIdentifier(hawkerList.get(i).getPictureName(), "drawable", context.getPackageName());
        hawkerImg.setImageResource(id);

        return view;
    }

}
