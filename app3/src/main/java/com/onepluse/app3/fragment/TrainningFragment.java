package com.onepluse.app3.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.onepluse.app3.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TrainningFragment extends Fragment {


    public TrainningFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tranning, container, false);
    }

}
