
package com.trustedoffer.mvvmdesignpattern.Model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ModelClass {

    @SerializedName("MostWickets")
    @Expose
    private List<MostWicket> mostWickets = null;

    public List<MostWicket> getMostWickets() {
        return mostWickets;
    }

    public void setMostWickets(List<MostWicket> mostWickets) {
        this.mostWickets = mostWickets;
    }

}
