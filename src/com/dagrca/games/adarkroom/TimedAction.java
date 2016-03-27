package com.dagrca.games.adarkroom;

/**
 * User: dave
 * Date: 3/23/2016
 * Time: 10:00 PM
 * Purpose:
 */
public abstract class TimedAction {
    private String name;
    private int waitTime;
    private int remainingTime;

    public void countdown() {
        while (remainingTime > 0) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(remainingTime--);
        }
    }

    public void reset() {
        remainingTime = waitTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
