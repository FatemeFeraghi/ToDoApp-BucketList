package com.fateme.fatemebucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ThingsToDoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things_to_do);
        setupList();
    }

    private void setupList() {
        BucketListEntry[] thingsToDo = {
                new BucketListEntry("Photography","Doing photography to capture amazing nature of Canada.",R.drawable.photography,5),
                new BucketListEntry("Road trip across Canada","Travel by car to Europe and go through the adventure!",R.drawable.trip,4.7f),
                new BucketListEntry("Hiking","Hiking and exploring the nature, following the path into the deep forest!",R.drawable.hiking,4),
                new BucketListEntry("Air Balloons","Big hot air balloon over a beautiful landscape above the mountains.",R.drawable.ballons,4.5f),
                new BucketListEntry("Skiing","Running downhill on slopes!",R.drawable.ski,3.5f),
        };

        RecyclerView recyclerView = findViewById(R.id.recycler_view_things_to_do);
        BucketListEntryAdapter adapter = new BucketListEntryAdapter(thingsToDo);
        recyclerView.setAdapter(adapter);
    }
}