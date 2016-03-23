package com.dagrca.scrabble;

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
    private List<Character> tiles = null;

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

    public void setTiles(List tiles) {
        this.tiles = tiles;
    }

    public Character removeTile(Character c) {
        int index = this.tiles.indexOf(c);
        return this.tiles.remove(index);
    }
}
