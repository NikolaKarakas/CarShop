package com.example.carshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.firebase.client.Firebase;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private Button mSendData;
    private Button bAdminScreen;
   // private Firebase mRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Firebase.setAndroidContext(this);


       // mRef = new Firebase("https://carshop-a9d4b.firebaseio.com/");
        mSendData = (Button) findViewById(R.id.sendData);
        bAdminScreen = (Button) findViewById(R.id.adminButton);

        bAdminScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Main2Activity.class));
            }
        });
        /*mSendData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Firebase mRefChild = mRef.child("Name");

                mRefChild.setValue("Nikola");

            }
        });*/
    }


}
