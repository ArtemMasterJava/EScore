
package com.anohin.artem.retrofitdemo.POJO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;
import javax.validation.Valid;

@Generated("org.jsonschema2pojo")
public class Model {

    @SerializedName("matches")
    @Expose
    @Valid
    private List<Match> matches = new ArrayList<Match>();
    @SerializedName("timestamp")
    @Expose
    private Integer timestamp;

    /**
     * 
     * @return
     *     The matches
     */
    public List<Match> getMatches() {
        return matches;
    }

    /**
     * 
     * @param matches
     *     The matches
     */
    public void setMatches(List<Match> matches) {
        this.matches = matches;
    }

    /**
     * 
     * @return
     *     The timestamp
     */
    public Integer getTimestamp() {
        return timestamp;
    }

    /**
     * 
     * @param timestamp
     *     The timestamp
     */
    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

}
