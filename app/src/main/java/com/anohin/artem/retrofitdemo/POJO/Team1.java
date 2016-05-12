
package com.anohin.artem.retrofitdemo.POJO;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Team1 {

    @SerializedName("team_id")
    @Expose
    private String teamId;
    @SerializedName("team_name")
    @Expose
    private String teamName;
    @SerializedName("team_tag")
    @Expose
    private String teamTag;
    @SerializedName("score")
    @Expose
    private String score;
    @SerializedName("country_code")
    @Expose
    private String countryCode;
    @SerializedName("logo_url")
    @Expose
    private String logoUrl;

    /**
     * 
     * @return
     *     The teamId
     */
    public String getTeamId() {
        return teamId;
    }

    /**
     * 
     * @param teamId
     *     The team_id
     */
    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    /**
     * 
     * @return
     *     The teamName
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * 
     * @param teamName
     *     The team_name
     */
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    /**
     * 
     * @return
     *     The teamTag
     */
    public String getTeamTag() {
        return teamTag;
    }

    /**
     * 
     * @param teamTag
     *     The team_tag
     */
    public void setTeamTag(String teamTag) {
        this.teamTag = teamTag;
    }

    /**
     * 
     * @return
     *     The score
     */
    public String getScore() {
        return score;
    }

    /**
     * 
     * @param score
     *     The score
     */
    public void setScore(String score) {
        this.score = score;
    }

    /**
     * 
     * @return
     *     The countryCode
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * 
     * @param countryCode
     *     The country_code
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * 
     * @return
     *     The logoUrl
     */
    public String getLogoUrl() {
        return logoUrl;
    }

    /**
     * 
     * @param logoUrl
     *     The logo_url
     */
    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

}
