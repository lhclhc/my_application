package com.example.hp.text2android.fragment;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hp.text2android.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class OtherRightFragment extends Fragment {


    public OtherRightFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      return  inflater.inflate(R.layout.fragment_other_right, container, false);

    }

}
