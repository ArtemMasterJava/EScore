package com.anohin.artem.retrofitdemo.Model;

/**
 * Created by Artem on 06.05.2016.
 */

        import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class League {

    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("slug")
    @Expose
    public String slug;
    @SerializedName("image_url")
    @Expose
    public String imageUrl;
    @SerializedName("id")
    @Expose
    public String id;
    @SerializedName("has_ticket")
    @Expose
    public String hasTicket;
    @SerializedName("itemdef")
    @Expose
    public String itemdef;
    @SerializedName("league_id")
    @Expose
    public String leagueId;
    @SerializedName("active")
    @Expose
    public String active;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHasTicket() {
        return hasTicket;
    }

    public void setHasTicket(String hasTicket) {
        this.hasTicket = hasTicket;
    }

    public String getItemdef() {
        return itemdef;
    }

    public void setItemdef(String itemdef) {
        this.itemdef = itemdef;
    }

    public String getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(String leagueId) {
        this.leagueId = leagueId;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }
}