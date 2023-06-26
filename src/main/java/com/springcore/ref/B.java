package com.springcore.ref;

public class B {
    public int y;

    public int getY() {
        return y;
    }

    public B(int y) {
        this.y = y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public B() {
        super();
    }

    @Override
    public String toString() {
        return "B{" +
                "y=" + y +
                '}';
    }
}


