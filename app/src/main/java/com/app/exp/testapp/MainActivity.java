package com.app.exp.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements MessageSender.MessageCallback{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void onSendButtonClicked(String message) {
        MessageReceiver receiverFragment = (MessageReceiver)
                getSupportFragmentManager().findFragmentById(R.id.container_receiver);
        if (receiverFragment != null) {
            // If article frag is available, we're in two-pane layout...

            // Call a method in the ArticleFragment to update its content
            receiverFragment.updateMessage(message);
        } else {
            Toast.makeText(this, "null", Toast.LENGTH_SHORT).show();
        }

    }
}
