package com.rharj.myapplication.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.rharj.myapplication.R;
import com.rharj.myapplication.model.competition_response.CompetitionResponse;

import java.util.List;

/**
 * Created by rharj on 2/9/2018.
 */

public class LeagueAdapter extends RecyclerView.Adapter<LeagueAdapter.LeagueHolder> {

    private List<CompetitionResponse> competitionResponses;


    public LeagueAdapter(List<CompetitionResponse> competitionResponse) {
        this.competitionResponses = competitionResponse;
    }

    public void setFilms(List<CompetitionResponse> competitionResponse) {
        this.competitionResponses = competitionResponse;
        notifyDataSetChanged();
    }

    @Override
    public LeagueHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_film, parent, false);
        return new LeagueHolder(view);
    }

    @Override
    public void onBindViewHolder(LeagueHolder holder, int position) {
        CompetitionResponse competitionResponse = competitionResponses.get(position);
        holder.competitionResponse = competitionResponse;
        holder.title.setText(competitionResponse.getCaption());
    }

    @Override
    public int getItemCount() {
        if (competitionResponses == null) {
            return 0;
        } else {
            return competitionResponses.size();
        }
    }

    static class LeagueHolder extends RecyclerView.ViewHolder {

        CompetitionResponse competitionResponse;
        TextView title;

        LeagueHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.league_name);
            /*itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onFilmClickListener.onFilmClick(film);
                }
            });*/
        }
    }
}
