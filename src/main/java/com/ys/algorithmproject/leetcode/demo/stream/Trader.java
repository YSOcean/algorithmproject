package com.ys.algorithmproject.leetcode.demo.stream;

/**
 * Create by YSOcean
 */
public class Trader {
    private final String name;
    private final String city;

    public Trader(String n, String c){
        this.name = n;
        this.city = c;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }


    @Override
    public String toString() {
        return "Trader{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
    private static String switchIntentionLevel(String intentionLevel){
        switch (intentionLevel){
            case "A":
                return "承诺还款";
            case "B":
                return "未承诺还款";
            case "C":
                return "已经还款";
            default:
                return intentionLevel;
        }
    }

    public static void main(String[] args) {
        System.out.println(switchIntentionLevel("A"));
        System.out.println(switchIntentionLevel("b"));
        System.out.println(switchIntentionLevel("B"));
        System.out.println(switchIntentionLevel("C"));
        System.out.println(switchIntentionLevel(""));
        //java.lang.NullPointerException
        System.out.println(switchIntentionLevel(null));
    }
}
