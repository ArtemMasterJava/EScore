package com.anohin.artem.retrofitdemo.Model;

/**
 * Created by Artem on 06.05.2016.
 */
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Team1 {

    @SerializedName("score")
    @Expose
    public String score;
    @SerializedName("logo_url")
    @Expose
    public String logoUrl;
    @SerializedName("team_name")
    @Expose
    public String teamName;
    @SerializedName("team_id")
    @Expose
    public String teamId;
    @SerializedName("country_code")
    @Expose
    public String countryCode;
    @SerializedName("team_tag")
    @Expose
    public String teamTag;

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getTeamTag() {
        return teamTag;
    }

    public void setTeamTag(String teamTag) {
        this.teamTag = teamTag;
    }
}