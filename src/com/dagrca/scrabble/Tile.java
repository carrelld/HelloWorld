package com.dagrca.scrabble;

import java.util.HashMap;
import java.util.Map;

/**
 * User: carrelld
 * Date: 3/23/2016
 * Time: 10:58 AM
 * Purpose:
 */
public class Tile {

    private char letter;
    private int value;
    private static Map letterValue = new HashMap();
    //letterValue.put()



    public Tile(char letter) {
        this.letter = letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
        setValue(letter);
    }

    public char getLetter() {
        return letter;
    }

    private void setValue(char letter) {
        //this.value = letterValue.get(letter);
    }

    public int getValue() {
        return value;
    }

}
