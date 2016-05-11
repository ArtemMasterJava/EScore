package com.anohin.artem.retrofitdemo.Model;

/**
 * Created by Artem on 06.05.2016.
 */
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Match {

    @SerializedName("comment")
    @Expose
    public String comment;
    @SerializedName("team2")
    @Expose
    public Team2 team2;
    @SerializedName("viewers")
    @Expose
    public Viewers viewers;
    @SerializedName("link")
    @Expose
    public String link;
    @SerializedName("timediff")
    @Expose
    public String timediff;
    @SerializedName("status")
    @Expose
    public String status;
    @SerializedName("series_type")
    @Expose
    public Integer seriesType;
    @SerializedName("starttime_unix")
    @Expose
    public String starttimeUnix;
    @SerializedName("league")
    @Expose
    public League league;
    @SerializedName("team1")
    @Expose
    public Team1 team1;
    @SerializedName("starttime")
    @Expose
    public String starttime;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Team2 getTeam2() {
        return team2;
    }

    public void setTeam2(Team2 team2) {
        this.team2 = team2;
    }

    public Viewers getViewers() {
        return viewers;
    }

    public void setViewers(Viewers viewers) {
        this.viewers = viewers;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getTimediff() {
        return timediff;
    }

    public void setTimediff(String timediff) {
        this.timediff = timediff;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getSeriesType() {
        return seriesType;
    }

    public void setSeriesType(Integer seriesType) {
        this.seriesType = seriesType;
    }

    public String getStarttimeUnix() {
        return starttimeUnix;
    }

    public void setStarttimeUnix(String starttimeUnix) {
        this.starttimeUnix = starttimeUnix;
    }

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }

    public Team1 getTeam1() {
        return team1;
    }

    public void setTeam1(Team1 team1) {
        this.team1 = team1;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }
}