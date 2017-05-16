package com.app.exp.testapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by exp on 5/16/2017.
 */

public class MessageReceiver extends Fragment {
    @BindView(R.id.receiver)
    TextView receiver;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.message_receiver, container, false);
        ButterKnife.bind(this,view);
        return view;
    }
}
