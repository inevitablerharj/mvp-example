package com.rharj.myapplication.interfaces;

import com.rharj.myapplication.Utils.UrlConstant;
import com.rharj.myapplication.model.competition_response.CompetitionResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by rharj on 2/9/2018.
 */

public interface FootballApi {

    @GET(UrlConstant.GET_ALL_COMPETITIONS)
    Call<List<CompetitionResponse>> getAllCompetitions();

   // @GET(UrlConstant.GET_LEAGUE_COMPETITION)
}
