package com.internalpositioning.find3.find3app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.internalpositioning.find3.find3app.MapTouchView;

public class DisplayMapActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE1 = "com.example.myfirstapp.MESSAGE1";
    public static final String EXTRA_MESSAGE2 = "com.example.myfirstapp.MESSAGE2";

    MapTouchView mView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.sample_map_touch_view);

        mView = (MapTouchView) findViewById(R.id.mView);
    }

    /** Called when the user taps the buttonReturn button */
    public void sendLocation(View view) {
        Intent intent = new Intent();

        String locationXmessage = mView.getLx();
        String locationYmessage = mView.getLy();
        // Send location x, y
        //if (mView.mTouches.size() > 0) {
            /*locationXmessage = String.valueOf(mView.mTouches.valueAt(0).x);
            locationYmessage = String.valueOf(mView.mTouches.valueAt(0).y);
        } else {*/
         //   locationXmessage = "Fuck";
         //   locationYmessage = "You";
        //}
        intent.putExtra(EXTRA_MESSAGE1, locationXmessage);
        intent.putExtra(EXTRA_MESSAGE2, locationYmessage);
        setResult(MainActivity.RESULT_OK, intent);
        finish();
    }
}
