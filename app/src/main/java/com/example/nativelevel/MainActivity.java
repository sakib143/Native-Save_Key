package com.example.nativelevel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static {
        System.loadLibrary("keys");
    }

    public native String getNativeKey1();
    public native String getNativeKey2();

    private TextView tvKeys;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvKeys = findViewById(R.id.tvKeys);

        String key1 = new String(Base64.decode(getNativeKey1(),Base64.DEFAULT));
        String key2 = new String(Base64.decode(getNativeKey2(),Base64.DEFAULT));

        tvKeys.setText(key1 +"\n\n" + key2);

        Log.e("=>"," key one   " + key1);
        Log.e("=>"," key two   " + key2);


    }
}
