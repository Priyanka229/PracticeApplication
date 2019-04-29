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

public class Fragment1 extends Fragment {

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        System.out.println("Fragment1 onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("Fragment1 onCreate");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        System.out.println("Fragment1 onCreateView");
        return inflater.inflate(R.layout.fragment_1, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        System.out.println("Fragment1 onViewCreated");

        TextView textView = view.findViewById(R.id.fragment1_text);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(getActivity(), Activity2.class);
//                startActivity(intent);
                getActivity().getSupportFragmentManager()
                        .beginTransaction()
                        .addToBackStack(null)
                        .add(R.id.activity_1_frame_layout, new Fragment2())
                        .commit();
            }
        });
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        System.out.println("Fragment1 onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        System.out.println("Fragment1 onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        System.out.println("Fragment1 onResume");
    }

    @Override
    public void onPause() {

        System.out.println("Fragment1 onPause");
        super.onPause();
    }

    @Override
    public void onStop() {
        super.onStop();

        System.out.println("Fragment1 onStop");
    }

    @Override
    public void onDestroyView() {
        System.out.println("Fragment1 onDestroyView");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {

        System.out.println("Fragment1 onDestroy");
        super.onDestroy();
    }

    @Override
    public void onDetach() {

        System.out.println("Fragment1 onDetach");
        super.onDetach();
    }
}
