package com.dagrca.adarkroom;

/**
 * User: dave
 * Date: 3/23/2016
 * Time: 9:59 PM
 * Purpose:
 */
public class Timer extends TimedAction implements Runnable{

    public Timer(String name) {
        this.setName(name);
        this.setWaitTime(11);
        this.setRemainingTime(this.getWaitTime());
    }

    @Override
    public void run() {
        this.countdown();
        this.reset();
    }
}
