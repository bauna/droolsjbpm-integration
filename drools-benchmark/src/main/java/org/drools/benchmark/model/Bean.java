package org.drools.benchmark.model;

import java.util.Random;

public class Bean {

    private String s;
    private int i;
    private long l;
    private double d;
    private boolean b;

    public String getS() {
        return s;
    }
    public void setS(String s) {
        this.s = s;
    }

    public int getI() {
        return i;
    }
    public void setI(int i) {
        this.i = i;
    }

    public long getL() {
        return l;
    }
    public void setL(long l) {
        this.l = l;
    }

    public double getD() {
        return d;
    }
    public void setD(double d) {
        this.d = d;
    }

    public boolean isB() {
        return b;
    }
    public void setB(boolean b) {
        this.b = b;
    }

    public static Bean[] generateRandomBeans(int nr) {
        Bean[] beans = new Bean[nr];
        Random random = new Random(nr);

        for (int i = 0; i < nr; i++) {
            beans[i] = new Bean();
            beans[i].setS("" + random.nextInt());
            beans[i].setI(random.nextInt());
            beans[i].setL(random.nextLong());
            beans[i].setD(random.nextDouble());
            beans[i].setB(random.nextBoolean());
        }

        return beans;
    }
}
