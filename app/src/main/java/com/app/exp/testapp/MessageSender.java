package com.app.exp.testapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by exp on 5/16/2017.
 */

public class MessageSender extends Fragment {
    MessageCallback mCallback;
    @BindView(R.id.send)
    Button send;
    @BindView(R.id.bodytosend)
    EditText bodytosend;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.message_sender, container, false);
        ButterKnife.bind(this,view);
        return view;
    }

    @OnClick(R.id.send)
    public void one(View view) {
        Toast.makeText(getActivity(), "Click", Toast.LENGTH_SHORT).show();
        mCallback.onSendButtonClicked(bodytosend.getText().toString());
    }
    interface MessageCallback {
        void onSendButtonClicked(String message);
    }
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        // This makes sure that the container activity has implemented
        // the callback interface. If not, it throws an exception
        try {
            mCallback = (MessageCallback) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnHeadlineSelectedListener");
        }
    }

}
