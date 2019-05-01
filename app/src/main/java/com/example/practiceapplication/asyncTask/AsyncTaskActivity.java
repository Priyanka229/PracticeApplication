package com.example.practiceapplication.asyncTask;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import com.example.practiceapplication.R;

public class AsyncTaskActivity extends AppCompatActivity {

    private TextView mTextView;
    private static final String TEXT_STATE = "currentText";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.async_task);

        mTextView = findViewById(R.id.textView1);

        if(savedInstanceState!=null){
            mTextView.setText(savedInstanceState.getString(TEXT_STATE));
        }
    }

    public void startTask(View view) {
        // Put a message in the text view
        mTextView.setText("Napping...");

        // Start the AsyncTask.
        new SimpleAsyncTask(mTextView).execute();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        // Save the state of the TextView
        outState.putString(TEXT_STATE,
                mTextView.getText().toString());
    }
}
