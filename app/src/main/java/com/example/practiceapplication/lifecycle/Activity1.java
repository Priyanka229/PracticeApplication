package com.example.practiceapplication.lifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.example.practiceapplication.R;

public class Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        System.out.println("Activity1 onCreate");

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.activity_1_frame_layout, new Fragment1())
//                .addToBackStack(null)
                .commit();

        findViewById(R.id.bt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager()
                        .beginTransaction()
                        .addToBackStack(null)
                        .add(R.id.activity_1_frame_layout, new Fragment2())
                        .commit();

//                startActivity(new Intent(Activity1.this, Activity2.class));
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("Activity1 onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("Activity1 onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("Activity1 onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("Activity1 onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("Activity1 onDestroy");
    }
}
