package com.dagrca.scrabble;

/**
 * User: carrelld
 * Date: 3/23/2016
 * Time: 10:46 AM
 * Purpose: Singleton class that allows players to pull tiles
 */
public class TileBag {

    private static TileBag tileBag = new TileBag();

    private TileBag() {

    }

    // Instantiate the singleton
    public static TileBag getInstance() {
        return tileBag;
    }


}
