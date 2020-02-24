package vn.androidstudy.frag.fragment;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import vn.androidstudy.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BaseFragment extends Fragment {


    public BaseFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.i("BASELOG", "onAttach: " + getClass().getName());
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("BASELOG", "onCreate: " + getClass().getName());
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.i("BASELOG", "onViewCreated: " + getClass().getName());
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.i("BASELOG", "onCreateView: " + getClass().getName());
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i("BASELOG", "onActivityCreated: " + getClass().getName());
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("BASELOG", "onStart: " + getClass().getName());
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("BASELOG", "onResume: " + getClass().getName());
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("BASELOG", "onPause: " + getClass().getName());
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("BASELOG", "onStop: " + getClass().getName());
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i("BASELOG", "onDestroyView: " + getClass().getName());
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("BASELOG", "onDestroy: " + getClass().getName());
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i("BASELOG", "onDetach: " + getClass().getName());
    }


}
