package com.gerhorgan.tableview.model;

/**
 * Created by gerhorgan on 27/06/2017.
 */

public class Fixtures {
    public String getTeams() {
        return teams;
    }

    public String getVenue() {
        return venue;
    }

    public String getDate() {
        return date;
    }

    public Fixtures(String teams, String venue, String date) {

        this.teams = teams;
        this.venue = venue;
        this.date = date;
    }

    public Fixtures() {

    }

    public String teams, venue, date;


    
}
