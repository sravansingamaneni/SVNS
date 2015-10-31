package com.vnrapplications.svna.two;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ViewFlipper;

import com.vnrapplications.svna.R;

/**
 * Created by apple on 8/15/2015.
 */
public class QuoteFragment extends android.support.v4.app.Fragment {

    public static QuoteFragment newInstance() {
        QuoteFragment fragment = new QuoteFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.quote_view, container, false);
        return view;
    }
}
