package com.anohin.artem.retrofitdemo.Model;

/**
 * Created by Artem on 06.05.2016.
 */
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Model {

    @SerializedName("matches")
    @Expose
    public List<Match> matches = new ArrayList<Match>();
    @SerializedName("timestamp")
    @Expose
    public Integer timestamp;

    public List<Match> getMatches() {
        return matches;
    }

    public void setMatches(List<Match> matches) {
        this.matches = matches;
    }

    public Integer getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }
}