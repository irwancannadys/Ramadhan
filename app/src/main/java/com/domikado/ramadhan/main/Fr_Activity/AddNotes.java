package com.domikado.ramadhan.main.Fr_Activity;
// Created by irwancannady (irwancannady@gmail.com) on 3/31/17 at 3:40 PM.

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.domikado.ramadhan.R;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public class AddNotes extends Fragment{

    Unbinder unbinder;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.create_notes, container, false);
        unbinder = ButterKnife.bind(getContext(), view);

        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
