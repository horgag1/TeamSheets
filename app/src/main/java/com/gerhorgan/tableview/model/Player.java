package com.gerhorgan.tableview.model;

/**
 * Created by gerhorgan on 05/07/2017.
 */

public class Player {
    public String name,club, playerId;

    public Player(String name, String club) {
        this.name = name;
        this.club = club;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public Player(String name, String club, String playerId) {

        this.name = name;
        this.club = club;
        this.playerId = playerId;
    }

    public Player() {

    }
}
