package com.rharj.myapplication.interfaces.leagues;

import com.rharj.myapplication.Utils.NetworkClient;
import com.rharj.myapplication.interfaces.FootballApi;
import com.rharj.myapplication.model.competition_response.CompetitionResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by rharj on 2/9/2018.
 */

public class LeaguePresenter implements LeagueContract.HomePresenter {

    private LeagueContract.MainView view;
    private FootballApi clients;


    public LeaguePresenter(LeagueContract.MainView view){

        this.view = view;
        clients = NetworkClient.getFootBallApi();
    }


    @Override
    public void getAllLeagues() {
        view.showingLoading();
        clients.getAllCompetitions().enqueue(new Callback<List<CompetitionResponse>>() {
            @Override
            public void onResponse(Call<List<CompetitionResponse>> call, Response<List<CompetitionResponse>> response) {
                view.showAllLeagues(response.body());
                view.hideLoading();
            }

            @Override
            public void onFailure(Call<List<CompetitionResponse>> call, Throwable t) {
                view.showMessage(t.getMessage());
                view.hideLoading();
            }
        });
    }
}
