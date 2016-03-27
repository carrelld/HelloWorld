package com.dagrca.games.adarkroom;

/**
 * User: dave
 * Date: 3/23/2016
 * Time: 10:00 PM
 * Purpose:
 */
public abstract class TimedAction {
    private int waitTime;
    private int remainingTime;
    private boolean ready;

    public void decayTime() {
        while (remainingTime > 0) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            remainingTime -= 1;
        }
    }

    public int getWaitTime() {
        return waitTime;
    }

    public void setWaitTime(int waitTime) {
        this.waitTime = waitTime;
    }

    public int getRemainingTime() {
        return remainingTime;
    }

    public void setRemainingTime(int remainingTime) {
        this.remainingTime = remainingTime;
    }

    public boolean isReady() {
        return ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }
}
