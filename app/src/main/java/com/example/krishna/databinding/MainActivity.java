package com.example.krishna.databinding;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.krishna.databinding.databinding.ActivityMainBinding;
import com.example.krishna.databinding.model.Login;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private Login login = new Login();
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setLogin(login);
        binding.setActivity(this);
    }

    public void doLogin() {
        Log.d(TAG, login.getUsername());
        Log.d(TAG, login.getPassword());
        binding.setLogin(login);

        if (login.getUsername().equalsIgnoreCase("movetonext")) {
            startActivity(new Intent(this, MonthsActivity.class));
        } else if (login.getUsername().equalsIgnoreCase("hide")) {
            login.getShow().set(View.GONE);
        } else {
            login.getShow().set(View.VISIBLE);
        }
    }

    public void showToast() {
        Toast.makeText(this, "Provide all details please...", Toast.LENGTH_SHORT).show();
    }
}
