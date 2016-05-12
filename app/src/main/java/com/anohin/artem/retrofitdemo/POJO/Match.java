
package com.anohin.artem.retrofitdemo.POJO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import javax.validation.Valid;

@Generated("org.jsonschema2pojo")
public class Match {

    @SerializedName("starttime_unix")
    @Expose
    private String starttimeUnix;
    @SerializedName("series_type")
    @Expose
    private Integer seriesType;
    @SerializedName("starttime")
    @Expose
    private String starttime;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("timediff")
    @Expose
    private String timediff;
    @SerializedName("viewers")
    @Expose
    @Valid
    private Viewers viewers;
    @SerializedName("team2")
    @Expose
    @Valid
    private Team2 team2;
    @SerializedName("league")
    @Expose
    @Valid
    private League league;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("comment")
    @Expose
    private String comment;
    @SerializedName("team1")
    @Expose
    @Valid
    private Team1 team1;

    /**
     * 
     * @return
     *     The starttimeUnix
     */
    public String getStarttimeUnix() {
        return starttimeUnix;
    }

    /**
     * 
     * @param starttimeUnix
     *     The starttime_unix
     */
    public void setStarttimeUnix(String starttimeUnix) {
        this.starttimeUnix = starttimeUnix;
    }

    /**
     * 
     * @return
     *     The seriesType
     */
    public Integer getSeriesType() {
        return seriesType;
    }

    /**
     * 
     * @param seriesType
     *     The series_type
     */
    public void setSeriesType(Integer seriesType) {
        this.seriesType = seriesType;
    }

    /**
     * 
     * @return
     *     The starttime
     */
    public String getStarttime() {
        return starttime;
    }

    /**
     * 
     * @param starttime
     *     The starttime
     */
    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    /**
     * 
     * @return
     *     The status
     */
    public String getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 
     * @return
     *     The timediff
     */
    public String getTimediff() {
        return timediff;
    }

    /**
     * 
     * @param timediff
     *     The timediff
     */
    public void setTimediff(String timediff) {
        this.timediff = timediff;
    }

    /**
     * 
     * @return
     *     The viewers
     */
    public Viewers getViewers() {
        return viewers;
    }

    /**
     * 
     * @param viewers
     *     The viewers
     */
    public void setViewers(Viewers viewers) {
        this.viewers = viewers;
    }

    /**
     * 
     * @return
     *     The team2
     */
    public Team2 getTeam2() {
        return team2;
    }

    /**
     * 
     * @param team2
     *     The team2
     */
    public void setTeam2(Team2 team2) {
        this.team2 = team2;
    }

    /**
     * 
     * @return
     *     The league
     */
    public League getLeague() {
        return league;
    }

    /**
     * 
     * @param league
     *     The league
     */
    public void setLeague(League league) {
        this.league = league;
    }

    /**
     * 
     * @return
     *     The link
     */
    public String getLink() {
        return link;
    }

    /**
     * 
     * @param link
     *     The link
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     * 
     * @return
     *     The comment
     */
    public String getComment() {
        return comment;
    }

    /**
     * 
     * @param comment
     *     The comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * 
     * @return
     *     The team1
     */
    public Team1 getTeam1() {
        return team1;
    }

    /**
     * 
     * @param team1
     *     The team1
     */
    public void setTeam1(Team1 team1) {
        this.team1 = team1;
    }

}
