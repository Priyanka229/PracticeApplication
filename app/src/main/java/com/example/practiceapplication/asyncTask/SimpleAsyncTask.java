package com.example.practiceapplication.asyncTask;

import android.os.AsyncTask;
import android.widget.TextView;

import java.lang.ref.WeakReference;

public class SimpleAsyncTask extends AsyncTask <Void, Void, String> {

    private WeakReference<TextView> mTextView;

    SimpleAsyncTask(TextView tv) {
        mTextView = new WeakReference<>(tv);
    }

    @Override
    protected String doInBackground(Void... voids) {
        return null;
    }
}
