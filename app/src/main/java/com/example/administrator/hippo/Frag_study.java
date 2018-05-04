package com.example.administrator.hippo;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by jimz on 2018/3/13.
 */

public class Frag_study extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View frag_study=inflater.inflate(R.layout.study,container,false);

        return frag_study;
    }
}
