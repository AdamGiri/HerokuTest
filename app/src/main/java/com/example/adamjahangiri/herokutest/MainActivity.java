package com.example.adamjahangiri.herokutest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParseUser;
import com.parse.SaveCallback;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ParseUser user = new ParseUser();
        user.setUsername("Adam");
        user.setPassword("Jahangiri");
        user.saveInBackground(new SaveCallback() {
            @Override
            public void done(ParseException e){
                if (e!=null) {
                    e.printStackTrace();
                } else {
                    Log.i("User","User saved successfully");
                }

            }
        });
    }
}
