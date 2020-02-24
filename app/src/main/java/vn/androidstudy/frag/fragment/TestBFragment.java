package vn.androidstudy.frag.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import vn.androidstudy.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TestBFragment extends BaseFragment {


    public TestBFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_test_b, container, false);
    }

}
