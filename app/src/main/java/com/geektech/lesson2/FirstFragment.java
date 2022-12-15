package com.geektech.lesson2;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class FirstFragment extends Fragment {
    private TextView textView;
    private Integer numOne, numTwo;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        textView = requireActivity().findViewById(R.id.tv_null);
        Button btnMinus = requireActivity().findViewById(R.id.btn_minus);
        Button btnPlus = requireActivity().findViewById(R.id.btn_plus);
        btnPlus.setOnClickListener(view1 -> {
            numOne = Integer.valueOf(textView.getText().toString());
            numTwo = numOne+1;
            textView.setText(numTwo.toString());
        });
        btnMinus.setOnClickListener(view12 -> {
            numOne = Integer.valueOf(textView.getText().toString());
            numTwo = numOne-1;
            textView.setText(numTwo.toString());
        });

        }
}
