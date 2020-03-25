
package com.trustedoffer.mvvmdesignpattern.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MostWicket {

    @SerializedName("wickets")
    @Expose
    private String wickets;
    @SerializedName("Team")
    @Expose
    private String team;
    @SerializedName("player")
    @Expose
    private String player;

    public String getWickets() {
        return wickets;
    }

    public void setWickets(String wickets) {
        this.wickets = wickets;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

}
