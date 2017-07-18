package com.gerhorgan.tableview;

import com.gerhorgan.tableview.model.Player;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gerhorgan on 13/07/2017.
 */

public class SampleData {

    public static List<Player> getSamplePlayers(){
        List<Player> players= new ArrayList<>();
        Player player1= new Player("Gerard","St Finbarrs");
        Player player2= new Player("Tim","St Finbarrs");
        Player player3= new Player("John","St Finbarrs");
        players.add(player1);
        players.add(player2);
        return players;
    }
}
