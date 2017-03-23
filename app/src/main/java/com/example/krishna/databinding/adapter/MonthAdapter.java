package com.example.krishna.databinding.adapter;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.krishna.databinding.BR;
import com.example.krishna.databinding.R;
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
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item_month, parent, false);
        return new ViewHolder(DataBindingUtil.bind(view));
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

    static class ViewHolder extends RecyclerView.ViewHolder {
        private final ViewDataBinding viewDataBinding;

        ViewHolder(ViewDataBinding viewDataBinding) {
            super(viewDataBinding.getRoot());
            this.viewDataBinding = viewDataBinding;
        }

        void bind(MonthlyData data) {
            viewDataBinding.setVariable(BR.monthlyData, data);
            viewDataBinding.executePendingBindings();
        }
    }
}
