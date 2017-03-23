package com.example.krishna.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.example.krishna.databinding.databinding.ActivityMainBinding;
import com.example.krishna.databinding.model.Login;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private Login login = new Login();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setLogin(login);
    }

    public void doLogin(View view) {
        Log.d(TAG, login.getUsername());
        Log.d(TAG, login.getPassword());
    }
}
