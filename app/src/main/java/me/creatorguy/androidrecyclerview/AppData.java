package me.creatorguy.androidrecyclerview;

import java.util.ArrayList;

public class AppData {
    public static ArrayList<App> get() {
        ArrayList<App> apps = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            App app = new App();
            app.setName("Application name " + i);
            app.setDescription("Application description " + i);
            apps.add(app);
        }
        return apps;
    }
}
