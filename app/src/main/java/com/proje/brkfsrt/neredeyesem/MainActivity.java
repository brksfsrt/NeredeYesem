package com.proje.brkfsrt.neredeyesem;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.NeredeYesem.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendMessage(View view){
        Intent intent = new Intent(this,DisplayRestaurantActivity.class);
        EditText editText=  (EditText)findViewById(R.id.radiusText);
        String radius_message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,radius_message);
        startActivity(intent);
    }
}
