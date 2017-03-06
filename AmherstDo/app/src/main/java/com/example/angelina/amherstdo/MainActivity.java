package com.example.angelina.amherstdo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            populateUsersList();


        }

        private void populateUsersList() {
            // Construct the data source
            ArrayList<User> arrayOfUsers = User.getUsers();
            ListView listView = (ListView) findViewById(R.id.lvUsers);
            // Create the adapter to convert the array to views
            CustomUsersAdapter adapter = new CustomUsersAdapter(this, arrayOfUsers);
            // Attach the adapter to a ListView

            listView.setAdapter(adapter);

        }




    @Override
    public void onClick(View v) {
    TextView title= (TextView)findViewById(R.id.tvTitle);




        if (((CheckBox)v).isChecked()) {
            title.setTextColor(0xffcccccc);



        } else {
            title.setTextColor(0xFF00FF00);



        }
    }
}






