package com.example.practiceapplication.asyncTask;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import com.example.practiceapplication.R;

public class AsyncTaskActivity extends AppCompatActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.async_task);
    }

    public void startTask(View view) {
        // Put a message in the text view
        mTextView.setText("Napping...");

        // Start the AsyncTask.
        new SimpleAsyncTask(mTextView).execute();
    }
}
