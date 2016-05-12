
package com.anohin.artem.retrofitdemo.POJO;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Viewers {

    @SerializedName("self")
    @Expose
    private String self;
    @SerializedName("stream")
    @Expose
    private Integer stream;

    /**
     * 
     * @return
     *     The self
     */
    public String getSelf() {
        return self;
    }

    /**
     * 
     * @param self
     *     The self
     */
    public void setSelf(String self) {
        this.self = self;
    }

    /**
     * 
     * @return
     *     The stream
     */
    public Integer getStream() {
        return stream;
    }

    /**
     * 
     * @param stream
     *     The stream
     */
    public void setStream(Integer stream) {
        this.stream = stream;
    }

}
