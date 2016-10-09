package com.example.shivaprakashys.heavenly_kerala;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by ShivaprakashY.S on 08-10-2016.
 */
public class thirdFragment extends Fragment {
    View myView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView= inflater.inflate(R.layout.adventure,container,false);
        return myView;
    }
}
