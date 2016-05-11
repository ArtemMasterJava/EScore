package com.anohin.artem.retrofitdemo.Model;

/**
 * Created by Artem on 06.05.2016.
 */
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Viewers {

    @SerializedName("stream")
    @Expose
    public Integer stream;
    @SerializedName("self")
    @Expose
    public String self;

    public Integer getStream() {
        return stream;
    }

    public void setStream(Integer stream) {
        this.stream = stream;
    }

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }
}