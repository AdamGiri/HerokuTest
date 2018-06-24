package com.example.adamjahangiri.herokutest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParseUser;
import com.parse.SaveCallback;
import com.parse.SignUpCallback;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ParseUser user = new ParseUser();
        user.setUsername("Adam");
        user.setPassword("Jahangiri");
        user.signUpInBackground(new SignUpCallback() {
            @Override
            public void done(ParseException e) {
                if (e==null)
                    user.saveInBackground(new SaveCallback() {
                        @Override
                        public void done(ParseException e){
                            if (e!=null) {
                                Log.i("Giri","user not saved");
                                e.printStackTrace();
                            } else {
                                Log.i("Giri","User saved successfully");
                            }

                        }
                    });
                else
                    Log.i("Giri","user not signed up");
                    e.printStackTrace();
            }
        });

    }
}
