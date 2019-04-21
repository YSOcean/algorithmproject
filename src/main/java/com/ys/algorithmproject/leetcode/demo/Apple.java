package com.ys.algorithmproject.leetcode.demo;

/**
 * @author shuaiyu
 */
public class Apple {
    private int weight = 0;

    private String color = "";

    public Apple(int weight,String color){
        this.weight = weight;
        this.color = color;
    }

    public Integer getWeight(){
        return weight;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }
}
