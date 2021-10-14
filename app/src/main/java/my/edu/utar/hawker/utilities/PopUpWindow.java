package my.edu.utar.hawker.utilities;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import my.edu.utar.hawker.R;
import my.edu.utar.hawker.model.Hawker;

public class PopUpWindow {
    Dialog dialog;
    Context context;
    Hawker hawker;

    public PopUpWindow(Context context, Hawker hawker) {
        this.context = context;
        this.hawker = hawker;
    }

    public void createWindow() {

        //Create Dialog and put view inside it
        View view = LayoutInflater.from(context).inflate(R.layout.activity_pop_acitivity, null);
        dialog = new Dialog(context);
        dialog.setContentView(view);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();

        //Modify the view content
        ImageView imageView = view.findViewById(R.id.popUpImageView);
        TextView closeButton = view.findViewById(R.id.popUpCloseTextView);
        TextView name = (TextView) view.findViewById(R.id.popUpNameTextView);
        TextView address = (TextView) view.findViewById(R.id.popUpAddressTextView);
        TextView descripion = (TextView) view.findViewById(R.id.popUpDescriptionTextView);
        TextView phone = (TextView) view.findViewById(R.id.popUpPhoneTextView);
        TextView opening = (TextView) view.findViewById(R.id.popUpOpeningTextView);
        TextView recommends = (TextView) view.findViewById(R.id.popUpRecommendsTextView);
        TextView favorites = (TextView) view.findViewById(R.id.popUpFavoritesTextView);
        TextView userReview = (TextView) view.findViewById(R.id.popUpReviewsTextView);

        int id = context.getResources().getIdentifier(hawker.getPictureName(), "drawable", context.getPackageName());
        imageView.setImageResource(id);
        name.setText(hawker.getName());
        address.setText(hawker.getAddress());
        descripion.setText(hawker.getDescription());
        phone.setText(hawker.getPhone());
        opening.setText(hawker.getPreviousWeekOpeningHours());
        recommends.setText(Integer.toString(hawker.getRecommends()));
        favorites.setText(Integer.toString(hawker.getFavourites()));
        userReview.setText(hawker.getUserReview());


        //close button function
        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });


    }
}
