package com.rharj.myapplication.interfaces.leagues;

import com.rharj.myapplication.model.competition_response.CompetitionResponse;

import java.util.List;

/**
 * Created by rharj on 2/9/2018.
 */

public interface LeagueContract {
    interface MainView{

        void showingLoading();
        void hideLoading();
        void showMessage(String message);
        void showAllLeagues(List<CompetitionResponse> leaguesList);
    }

    interface HomePresenter {
        void getAllLeagues();
       // void onFilmItemClicked(CompetitionResponse competitionResponse);
    }
}
