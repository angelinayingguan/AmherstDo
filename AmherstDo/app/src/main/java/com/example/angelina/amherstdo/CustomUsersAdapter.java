package com.example.angelina.amherstdo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomUsersAdapter extends ArrayAdapter<User> {
    public CustomUsersAdapter(Context context, ArrayList<User> users) {
        super(context, 0, users);

     }

     @Override
     public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        User user = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
           convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_user, parent, false);
        }
        // Lookup view for data population
        final TextView tvTitle = (TextView) convertView.findViewById(R.id.tvTitle);
        final TextView tvEvent = (TextView) convertView.findViewById(R.id.tvDescription);
         final TextView tvPriority = (TextView) convertView.findViewById(R.id.tvPriority);
         CheckBox tvCheck = (CheckBox) convertView.findViewById(R.id.CheckBox01);
         // Populate the data into the template view using the data object
        tvTitle.setText(user.title);
        tvEvent.setText(user.description);
         tvCheck.setChecked(user.isSelected());
        tvCheck.setTag(user);
         tvPriority.setText(user.priority);


tvCheck.setOnClickListener(new View.OnClickListener()
{
    @Override
    public void onClick(View v) {

        if (((CheckBox) v).isChecked()) {
            tvTitle.setTextColor(0xffcccccc);



        } else {
            tvTitle.setTextColor(0xFF00FF00);



        }
    }}

);
    // Return the completed view to render on screen
        return convertView;
    }




}
