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
        List playerTiles = tileBag.getTiles(7);
        System.out.println("Player 1: " + playerTiles);
        System.out.println("Tiles in bag after: " + tileBag.getTilesInBag());
    }
}
