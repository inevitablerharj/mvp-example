package com.rharj.myapplication.model.competition_response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by rharj on 2/9/2018.
 */

public class Links {

    @SerializedName("self")
    @Expose
    private Self self;
    @SerializedName("teams")
    @Expose
    private Teams teams;
    @SerializedName("fixtures")
    @Expose
    private Fixtures fixtures;
    @SerializedName("leagueTable")
    @Expose
    private LeagueTable leagueTable;

    public Self getSelf() {
        return self;
    }

    public void setSelf(Self self) {
        this.self = self;
    }

    public Teams getTeams() {
        return teams;
    }

    public void setTeams(Teams teams) {
        this.teams = teams;
    }

    public Fixtures getFixtures() {
        return fixtures;
    }

    public void setFixtures(Fixtures fixtures) {
        this.fixtures = fixtures;
    }

    public LeagueTable getLeagueTable() {
        return leagueTable;
    }

    public void setLeagueTable(LeagueTable leagueTable) {
        this.leagueTable = leagueTable;
    }
}
