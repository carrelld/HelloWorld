package com.dagrca.games.scrabble;

import java.util.ArrayList;
import java.util.List;

/**
 * User: carrelld
 * Date: 3/23/2016
 * Time: 3:52 PM
 * Purpose:
 */
public class Player {
    private String name;
    private int score = 0;
    private List<Character> tiles = new ArrayList<Character>();

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public List getTiles() {
        return tiles;
    }

    public void addTiles(List tiles) {
        this.tiles.addAll(tiles);
    }

    public boolean removeTiles(String s) {
        // TO-DO add remove tiles code by looping through string s
        for (Character ch : s.toCharArray()) {
            if (!removeTile(ch)) {
                return false;
            }
        }
        return true;
    }

    public boolean removeTile(Character c) {
        return this.tiles.remove(c);
    }
}
