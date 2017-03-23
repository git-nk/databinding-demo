package com.example.krishna.databinding.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.krishna.databinding.databinding.RowItemMonthBinding;
import com.example.krishna.databinding.model.MonthlyData;

import java.util.ArrayList;

/**
 * Created by krishna on March 23, 2017
 */

public class MonthAdapter extends RecyclerView.Adapter<MonthAdapter.ViewHolder> {
    private ArrayList<MonthlyData> monthlyDataArrayList;

    public MonthAdapter(ArrayList<MonthlyData> monthlyDataArrayList) {
        this.monthlyDataArrayList = monthlyDataArrayList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        RowItemMonthBinding viewDataBinding = RowItemMonthBinding.inflate(inflater, parent, false);
        return new ViewHolder(viewDataBinding);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        MonthlyData monthlyData = monthlyDataArrayList.get(position);
        holder.bind(monthlyData);
    }

    @Override
    public int getItemCount() {
        return monthlyDataArrayList == null ? 0 : monthlyDataArrayList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private final RowItemMonthBinding viewDataBinding;

        ViewHolder(RowItemMonthBinding viewDataBinding) {
            super(viewDataBinding.getRoot());
            this.viewDataBinding = viewDataBinding;
        }

        void bind(MonthlyData data) {
            viewDataBinding.setMonthlyData(data);
            viewDataBinding.executePendingBindings();
        }
    }
}
