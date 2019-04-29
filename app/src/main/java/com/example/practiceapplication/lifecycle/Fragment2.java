package com.example.practiceapplication.lifecycle;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.practiceapplication.R;

public class Fragment2 extends Fragment {

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        System.out.println("Fragment2 onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("Fragment2 onCreate");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        System.out.println("Fragment2 onCreateView");
        return inflater.inflate(R.layout.fragment_2, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        System.out.println("Fragment2 onViewCreated");

        TextView textView = view.findViewById(R.id.fragment2_text);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (getActivity() != null) {
                    getActivity().finish();
                }
            }
        });
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        System.out.println("Fragment2 onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        System.out.println("Fragment2 onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        System.out.println("Fragment2 onResume");
    }

    @Override
    public void onPause() {

        System.out.println("Fragment2 onPause");
        super.onPause();
    }

    @Override
    public void onStop() {
        super.onStop();

        System.out.println("Fragment2 onStop");
    }

    @Override
    public void onDestroyView() {
        System.out.println("Fragment2 onDestroyView");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {

        System.out.println("Fragment2 onDestroy");
        super.onDestroy();
    }

    @Override
    public void onDetach() {

        System.out.println("Fragment2 onDetach");
        super.onDetach();
    }
}
