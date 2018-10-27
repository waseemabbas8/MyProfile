package com.thetasolutions.myprofile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Student student;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bundle bundle=new Bundle();
        student.setRollNo(1025);
        String userName=getIntent().getStringExtra("UserName");
        Toast.makeText(this, ""+userName, Toast.LENGTH_SHORT).show();
    }
}
