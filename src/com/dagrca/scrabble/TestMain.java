package com.dagrca.scrabble;

import java.util.List;

/**
 * User: carrelld
 * Date: 3/23/2016
 * Time: 3:41 PM
 * Purpose:
 */
public class TestMain {
    public static void main(String[] args) {
        TileBag tileBag = TileBag.getInstance();
        System.out.println("Tiles in bag before: " + tileBag.getTilesInBag());

        Player player1 = new Player("Dave!");
        System.out.println(player1.getName() + "\t" + player1.getScore() + "\t" + player1.getTiles());

        player1.addTiles(tileBag.getTiles(7));

        System.out.println(player1.getName() + "\t" + player1.getScore() + "\t" + player1.getTiles());
        System.out.println("Tiles in bag after1: " + tileBag.getTilesInBag());

        String removeWord = "gor";
        player1.removeTiles(removeWord);

        System.out.println(player1.getName() + "\t" + player1.getScore() + "\t" + player1.getTiles());
        System.out.println("Tiles in bag after2: " + tileBag.getTilesInBag());
    }
}
