package me.creatorguy.androidrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AppAdapter extends RecyclerView.Adapter<AppViewHolder> {

    private List<App> apps;
    private LayoutInflater layoutInflater;

    public AppAdapter(Context context, List<App> apps) {
        this.apps = apps;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public AppViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.list_app, parent, false);
        return new AppViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AppViewHolder holder, int position) {
        App app = apps.get(position);
        holder.setData(app, position);
    }

    @Override
    public int getItemCount() {
        return apps.size();
    }
}
