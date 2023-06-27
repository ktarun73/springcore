package com.springcore.spEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo{
    @Value("#{1+2}")
    private int x;
    @Value("#{T(Math).sqrt(4)}")
    private int y;
    @Value("#{T(java.lang.Math).PI}")
    private int z;

    @Value("#{new String('Demo class')}")
    private String name;

    @Value("#{3>1}")
     private boolean isGreater;

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", name='" + name + '\'' +
                ", isGreater=" + isGreater +
                '}';
    }
}
