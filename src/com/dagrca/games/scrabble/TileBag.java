package com.dagrca.games.scrabble;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

/**
 * User: carrelld
 * Date: 3/23/2016
 * Time: 10:46 AM
 * Purpose: Singleton class that allows players to pull tiles
 */
public class TileBag {

    private static TileBag tileBag = null;

    Character[] scrabbleLetters = {'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a',
            'b', 'b', 'c', 'c', 'd', 'd', 'd', 'd', 'e', 'e', 'e', 'e', 'e',
            'e', 'e', 'e', 'e', 'e', 'e', 'e', 'f', 'f', 'g', 'g', 'g', 'h',
            'h', 'i', 'i', 'i', 'i', 'i', 'i', 'i', 'i', 'i', 'j', 'k', 'l',
            'l', 'l', 'l', 'm', 'm', 'n', 'n', 'n', 'n', 'n', 'n', 'o', 'o',
            'o', 'o', 'o', 'o', 'o', 'o', 'p', 'p', 'q', 'r', 'r', 'r', 'r',
            'r', 'r', 's', 's', 's', 's', 't', 't', 't', 't', 't', 't', 'u',
            'u', 'u', 'u', 'v', 'v', 'w', 'w', 'x', 'y', 'y', 'z',};
    private List<Character> tilesInBag = new LinkedList<Character>(Arrays.asList(scrabbleLetters));

    private TileBag() {
    }

    public static TileBag getInstance() {
        if (tileBag == null) {
            tileBag = new TileBag();
            Collections.shuffle(tileBag.tilesInBag);
        }
        return tileBag;
    }

    public List<Character> getTilesInBag() {
        return this.tilesInBag;
    }

    public List<Character> getTiles(int numTiles) {
        List<Character> tilesPulled = new ArrayList<Character>();

        for (int i = 0; i < numTiles; i++) {
            tilesPulled.add(tileBag.tilesInBag.remove(0));
        }
        return tilesPulled;
    }
}
