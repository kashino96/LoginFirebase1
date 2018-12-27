package com.kevinintriagomora.firebase1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {
    public static final String user = "names";
    TextView textViewUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        textViewUser = (TextView)findViewById(R.id.tv_user);
        String user = getIntent().getStringExtra("names");
        textViewUser.setText("¡Bienvenido "+ user +"!");

    }
}
