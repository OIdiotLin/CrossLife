package com.oidiotlin.classmanager.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.oidiotlin.classmanager.R;

/**
 * Created by OIdiot on 2016/12/21.
 * Project: ClassManager
 */

public class RandPickFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_randpick, null);
    }
}
