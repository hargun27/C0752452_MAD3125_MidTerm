package com.hargun.c0752452_mad3125_midterm.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;

import com.hargun.c0752452_mad3125_midterm.Models.Storage;

import com.hargun.c0752452_mad3125_midterm.Models.Row;
import com.hargun.c0752452_mad3125_midterm.Models.SpaceXFlight;
import com.hargun.c0752452_mad3125_midterm.Controller.MoviesAdapter;
import com.hargun.c0752452_mad3125_midterm.R;

import java.util.ArrayList;
import java.util.List;

public class WelcomeActivity extends AppCompatActivity implements MoviesAdapter.onMovieListener {


    private RecyclerView recyclerView;
    private MoviesAdapter mAdapter;
    Storage mDataStore;
    private List<Row> flightRowList = new ArrayList<>();
    public static ArrayList<SpaceXFlight> staticSpaceXFlightList;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            mDataStore = new Storage(WelcomeActivity.this);
            mDataStore.processJSON();
            WelcomeActivity.staticSpaceXFlightList = mDataStore.mSpaceXFlightList;
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_welcome);
            recyclerView = findViewById(R.id.recycler_view);

            mAdapter = new MoviesAdapter(WelcomeActivity.this, flightRowList, (MoviesAdapter.onMovieListener) WelcomeActivity.this);
            String size = String.valueOf(flightRowList.size());
            RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
            recyclerView.setLayoutManager(mLayoutManager);
            recyclerView.setItemAnimator(new DefaultItemAnimator());
            recyclerView.setAdapter(mAdapter);

            for(SpaceXFlight flight : mDataStore.mSpaceXFlightList)
            {
                Row flightRow = new Row(flight.getLinks().getMission_patch_small(),flight.getMission_name(),flight.getLaunch_year());
                flightRowList.add(flightRow);
            }
            mAdapter.notifyDataSetChanged();
        }

    @Override
    public void onNoteClick(int position) {
        Intent intent = new Intent(WelcomeActivity.this, DetailActivity.class);
        intent.putExtra("Position",position);
        startActivity(intent);

    }
}

          /* for(SpaceXFlight flight : mDataStore.mSpaceXFlightList)
            {
                Row flightRow = new Row(flight.getLinks().getMission_patch_small(),flight.getMission_name(),flight.getLaunch_year());
                flightRowList.add(flightRow);
            }
            mAdapter.notifyDataSetChanged();        }


            @Override
            public void onNoteClick ( int position){
                Intent intent = new Intent(WelcomeActivity.this, DetailActivity.class);
                intent.putExtra("Position", position);
                intent.putExtra("Image", (Parcelable) flightRowList);
                startActivity(intent);
            }}
        }*/
