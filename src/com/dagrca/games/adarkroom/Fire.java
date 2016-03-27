package com.dagrca.games.adarkroom;

/**
 * User: dave
 * Date: 3/23/2016
 * Time: 9:59 PM
 * Purpose:
 */
public class Fire extends TimedAction implements Runnable{

    public Fire() {
        this.setWaitTime(10);
        this.setRemainingTime(this.getWaitTime());
    }

    @Override
    public void run() {
        this.decayTime();
        this.setReady(true);
    }
}
