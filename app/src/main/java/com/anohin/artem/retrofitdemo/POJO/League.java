
package com.anohin.artem.retrofitdemo.POJO;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class League {

    @SerializedName("active")
    @Expose
    private String active;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("itemdef")
    @Expose
    private String itemdef;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("league_id")
    @Expose
    private String leagueId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("has_ticket")
    @Expose
    private String hasTicket;
    @SerializedName("image_url")
    @Expose
    private String imageUrl;

    /**
     * 
     * @return
     *     The active
     */
    public String getActive() {
        return active;
    }

    /**
     * 
     * @param active
     *     The active
     */
    public void setActive(String active) {
        this.active = active;
    }

    /**
     * 
     * @return
     *     The slug
     */
    public String getSlug() {
        return slug;
    }

    /**
     * 
     * @param slug
     *     The slug
     */
    public void setSlug(String slug) {
        this.slug = slug;
    }

    /**
     * 
     * @return
     *     The itemdef
     */
    public String getItemdef() {
        return itemdef;
    }

    /**
     * 
     * @param itemdef
     *     The itemdef
     */
    public void setItemdef(String itemdef) {
        this.itemdef = itemdef;
    }

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The leagueId
     */
    public String getLeagueId() {
        return leagueId;
    }

    /**
     * 
     * @param leagueId
     *     The league_id
     */
    public void setLeagueId(String leagueId) {
        this.leagueId = leagueId;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The hasTicket
     */
    public String getHasTicket() {
        return hasTicket;
    }

    /**
     * 
     * @param hasTicket
     *     The has_ticket
     */
    public void setHasTicket(String hasTicket) {
        this.hasTicket = hasTicket;
    }

    /**
     * 
     * @return
     *     The imageUrl
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * 
     * @param imageUrl
     *     The image_url
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

}
