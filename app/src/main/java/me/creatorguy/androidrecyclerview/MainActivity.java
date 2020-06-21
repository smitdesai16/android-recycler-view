package me.creatorguy.androidrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rvMain = findViewById(R.id.rvMain);
        AppAdapter appAdapter = new AppAdapter(this, AppData.get());
        rvMain.setAdapter(appAdapter);

        LinearLayoutManager linearLayoutManagerVertical = new LinearLayoutManager(this);
        linearLayoutManagerVertical.setOrientation(LinearLayoutManager.VERTICAL);
        rvMain.setLayoutManager(linearLayoutManagerVertical);

        /*
        LinearLayoutManager linearLayoutManagerHorizontal = new LinearLayoutManager(this);
        linearLayoutManagerHorizontal.setOrientation(LinearLayoutManager.HORIZONTAL);
        rvMain.setLayoutManager(linearLayoutManagerHorizontal);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        rvMain.setLayoutManager(gridLayoutManager);

        StaggeredGridLayoutManager staggeredGridLayoutManagerVERTICAL = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        rvMain.setLayoutManager(staggeredGridLayoutManagerVERTICAL);

        StaggeredGridLayoutManager staggeredGridLayoutManagerHORIZONTAL = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.HORIZONTAL);
        rvMain.setLayoutManager(staggeredGridLayoutManagerHORIZONTAL);
        */
    }
}