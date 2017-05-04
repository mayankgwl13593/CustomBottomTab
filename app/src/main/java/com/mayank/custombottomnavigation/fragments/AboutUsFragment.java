package com.mayank.custombottomnavigation.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mayank.custombottomnavigation.R;

/**
 * Created by Mayank.gupta on 5/4/2017.
 */

public class AboutUsFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View contentView = inflater.inflate(R.layout.fragment_aboutus, null, false);
        return contentView;
    }
}