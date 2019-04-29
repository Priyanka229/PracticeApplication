package com.example.practiceapplication.lifecycle;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import com.example.practiceapplication.R;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        System.out.println("Activity2 onCreate");

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.activity_2_frame_layout, new Fragment2())
//                .addToBackStack(null)
                .commit();


    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("Activity2 onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("Activity2 onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("Activity2 onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("Activity2 onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("Activity2 onDestroy");
    }
}
