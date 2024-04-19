package com.example.networking;

import java.util.ArrayList;
import java.util.Arrays;

@SuppressWarnings("WeakerAccess")
public class RecyclerViewItem {

    private String title;

    public RecyclerViewItem(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    ArrayList<RecyclerViewItem> items = new ArrayList<>(Arrays.asList(
            new RecyclerViewItem("Matterhorn"),
            new RecyclerViewItem("Mont Blanc"),
            new RecyclerViewItem("Denali")
    ));
}
