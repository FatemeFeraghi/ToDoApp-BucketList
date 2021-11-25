package com.fateme.fatemebucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class PlacesToGoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_to_go);
        setupList();
    }

    private void setupList() {
        BucketListEntry[] placesToGo = {
                new BucketListEntry("Germany","Visit Munich, Medieval Rothenburg and Imperial city Museum",R.drawable.germany,5),
                new BucketListEntry("Switzerland","Travel to mountains of Alps and visit the beautiful villages and enjoy music festivals.",R.drawable.switzerland,4.7f),
                new BucketListEntry("Spain","Visit museums and festivals and try local cuisines.",R.drawable.spain,4),
                new BucketListEntry("France","Visit Musée de Louvre, Arc de Triomphe and explore amazing architecture of Paris.",R.drawable.paris,4.5f),
                new BucketListEntry("Italy","Have a ride through canals of Venice, try new foods and enjoy nature.",R.drawable.italy,3.5f),
        };

        RecyclerView recyclerView = findViewById(R.id.recycler_view_places_to_go);
        BucketListEntryAdapter adapter = new BucketListEntryAdapter(placesToGo);
        recyclerView.setAdapter(adapter);
    }
}