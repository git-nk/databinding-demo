package com.example.krishna.databinding;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.krishna.databinding.adapter.MonthAdapter;
import com.example.krishna.databinding.model.MonthlyData;

import java.util.ArrayList;

public class MonthsActivity extends AppCompatActivity {
    private static final String TAG = "MonthsActivity";
    private final String[] name = {
            "January", "February", "March", "April", "May", "June", "July", "August", "September",
            "October", "November", "December"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_months);

        prepareData();
    }

    public void prepareData() {
        ArrayList<MonthlyData> monthlyDataArrayList = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            MonthlyData monthlyData = new MonthlyData();
            monthlyData.setName(name[i]);
            Log.d(TAG, "img url: " + monthlyData.getImage());
            monthlyDataArrayList.add(monthlyData);
        }

        MonthAdapter monthAdapter = new MonthAdapter(monthlyDataArrayList);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(monthAdapter);

    }
}
