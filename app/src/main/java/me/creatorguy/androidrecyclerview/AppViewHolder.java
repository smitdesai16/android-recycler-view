package me.creatorguy.androidrecyclerview;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class AppViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    TextView tvListAppTitle, tvListAppSubTitle;
    CardView cvApp;
    int position;
    App app;
    Context context;

    public AppViewHolder(@NonNull View itemView) {
        super(itemView);
        tvListAppTitle = itemView.findViewById(R.id.tvListAppTitle);
        tvListAppSubTitle = itemView.findViewById(R.id.tvListAppSubTitle);
        cvApp = itemView.findViewById(R.id.cvApp);
    }

    public void setData(App app, int position) {
        this.tvListAppTitle.setText(app.getName());
        this.tvListAppSubTitle.setText(app.getDescription());
        this.position = position;
        this.app = app;
    }

    public void setListeners(Context context) {
        this.context = context;
        cvApp.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.cvApp:
                Toast.makeText(this.context, "Clicked " + position, Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
