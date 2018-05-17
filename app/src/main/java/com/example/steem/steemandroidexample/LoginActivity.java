package com.example.steem.steemandroidexample;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        if(getIntent()!=null) {
            Uri uri = getIntent().getData();
            if (uri != null) {
                Log.d("MainAtv-receivedata", uri.toString());
                Log.d("MainAtv-access_token", uri.getQueryParameter("access_token"));

                TextView textView = findViewById(R.id.id_text);
                textView.setText("Hello " + uri.getQueryParameter("username"));
            }
        }
    }
}
