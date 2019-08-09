package com.hargun.c0752452_mad3125_midterm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;

import java.util.ArrayList;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        private RecyclerView recyclerView;
        private MoviesAdapter mAdapter;
        DataStore mDataStore;
        private List<FlightRow> flightRowList = new ArrayList<>();
        public static ArrayList<SpaceXFlight> staticSpaceXFlightList;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            mDataStore = new DataStore(WelcomeActivity.this);
            mDataStore.processJSON();
            WelcomeActivity.staticSpaceXFlightList = mDataStore.mSpaceXFlightList;
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_welcome);
            recyclerView = findViewById(R.id.recycler_view);
            mAdapter = new MoviesAdapter(WelcomeActivity.this,flightRowList,WelcomeActivity.this);
            String size= String.valueOf(flightRowList.size());
            Log.d("Sizeeeeeeeeeeeeeez",size);
            RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
            recyclerView.setLayoutManager(mLayoutManager);
            recyclerView.setItemAnimator(new DefaultItemAnimator());
            recyclerView.setAdapter(mAdapter);
            prepareFlightListData();
        }
        private void prepareFlightListData()
        {
            for(SpaceXFlight flight : mDataStore.mSpaceXFlightList)
            {
                FlightRow flightRow = new FlightRow(flight.getLinks().getMission_patch_small(),flight.getMission_name(),flight.getLaunch_year());
                flightRowList.add(flightRow);
            }
            mAdapter.notifyDataSetChanged();
        }
        @Override
        public void onNoteClick(int position) {
            Intent intent = new Intent(WelcomeActivity.this, DetailActivity.class);
            intent.putExtra("Position",position);
            intent.putExtra("Image", (Parcelable) flightRowList);
            startActivity(intent);
        }
    }
}
