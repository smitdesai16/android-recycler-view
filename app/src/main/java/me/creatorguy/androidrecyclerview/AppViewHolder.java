package me.creatorguy.androidrecyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AppViewHolder extends RecyclerView.ViewHolder {
    TextView tvListAppTitle, tvListAppSubTitle;
    int position;
    App app;

    public AppViewHolder(@NonNull View itemView) {
        super(itemView);
        tvListAppTitle = itemView.findViewById(R.id.tvListAppTitle);
        tvListAppSubTitle = itemView.findViewById(R.id.tvListAppSubTitle);
    }

    public void setData(App app, int position) {
        this.tvListAppTitle.setText(app.getName());
        this.tvListAppSubTitle.setText(app.getDescription());
        this.position = position;
        this.app = app;
    }
}
