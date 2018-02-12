package com.rharj.myapplication.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.rharj.myapplication.R;
import com.rharj.myapplication.Utils.Util;
import com.rharj.myapplication.adapter.LeagueAdapter;
import com.rharj.myapplication.interfaces.leagues.LeagueContract;
import com.rharj.myapplication.interfaces.leagues.LeaguePresenter;
import com.rharj.myapplication.model.competition_response.CompetitionResponse;

import java.util.List;

public class MainActivity extends AppCompatActivity implements LeagueContract.MainView {

    RecyclerView recyclerView;
    LeagueAdapter leagueAdapter;
    LeagueContract.HomePresenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        leagueAdapter = new LeagueAdapter(null);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(leagueAdapter);

        presenter = new LeaguePresenter(this);
        presenter.getAllLeagues();
    }

    @Override
    public void showingLoading() {
        Util.showProgressDialog(MainActivity.this,"please wait...",false,false);
    }

    @Override
    public void hideLoading() {
        Util.hideProgressDialog(MainActivity.this);
    }

    @Override
    public void showMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showAllLeagues(List<CompetitionResponse> leaguesList) {
        leagueAdapter.setFilms(leaguesList);
    }
}
