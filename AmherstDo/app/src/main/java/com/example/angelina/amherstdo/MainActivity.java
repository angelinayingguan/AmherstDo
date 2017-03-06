package com.example.angelina.amherstdo;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            //populateUsersList();
            FragmentManager fm = getSupportFragmentManager();
            if (fm.findFragmentById(R.id.eFragment) == null) {
                fm.beginTransaction().add((int) R.id.eFragment, new EventFragment()).commit();
            }


        }

        /*private void populateUsersList() {
            // Construct the data source
            ArrayList<User> arrayOfUsers = User.getUsers();
            ListView listView = (ListView) findViewById(R.id.lvUsers);
            // Create the adapter to convert the array to views
            CustomUsersAdapter adapter = new CustomUsersAdapter(this, arrayOfUsers);
            // Attach the adapter to a ListView

            listView.setAdapter(adapter);

        }*/


   //EditText searchevent;
    //Button searchb;


/*    public void onSearch(View v) {
        TextView title= (TextView)findViewById(R.id.tvTitle);
        searchevent = (EditText) findViewById(R.id.search);
        String str = searchevent.getText().toString();
        Intent i = new Intent(MainActivity.this, Search.class);
        startActivity(i);
        //Toast.makeText(getApplicationContext(), "clicked.", Toast.LENGTH_SHORT).show();
        //if (str.equals(title.toString())){
       //     Toast.makeText(getApplicationContext(), "found title.", Toast.LENGTH_LONG).show();
       // }
    }
    public void clear(View v){

        Toast.makeText(getApplicationContext(), "clear.", Toast.LENGTH_LONG).show();
    }*/



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






