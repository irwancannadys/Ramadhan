package com.domikado.ramadhan.adapter;
// Created by irwancannady (irwancannady@gmail.com) on 3/31/17 at 3:54 PM.

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.domikado.ramadhan.R;
import com.domikado.ramadhan.model.ModelNotes;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AdapterList extends RecyclerView.Adapter<AdapterList.ViewHolder> {

    List<ModelNotes> modelNotes;

    @Override
    public AdapterList.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(AdapterList.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return modelNotes.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.title)
        TextView txtTitle;
        @BindView(R.id.content)
        TextView txtContent;
        @BindView(R.id.loc_date)
        TextView txtlocdate;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
