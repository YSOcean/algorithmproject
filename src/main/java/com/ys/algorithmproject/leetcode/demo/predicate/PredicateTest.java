package com.ys.algorithmproject.leetcode.demo.predicate;

import com.ys.algorithmproject.leetcode.demo.Apple;
import com.ys.algorithmproject.leetcode.demo.Tradition;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author shuaiyu
 */
public class PredicateTest {

    public static List<Apple> filterApple(List<Apple> inventory , ApplePredicate p){
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory){
            if(p.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Apple> appleList = new ArrayList<>();
        Apple a1 = new Apple(100,"red");
        Apple a2 = new Apple(160,"red");
        Apple a3 = new Apple(170,"green");
        Apple a4 = new Apple(100,"green");
        appleList.add(a1);
        appleList.add(a2);
        appleList.add(a3);
        appleList.add(a4);

        ApplePredicate p = new AppleGreenColorPredicate();

        List<Apple> greenApples = filterApple(appleList,p);
        System.out.println("**********");


        List<Apple> heavyApples = filterApple(appleList, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight()>150;
            }
        });
        System.out.println("**********");
        List<Apple> result = filterApple(appleList,(Apple apple) -> "red".equals(apple.getColor()));
        System.out.println("**********");

        String plateNumber = "辽AE2345".replaceAll("\\s*", "");
        String[] strings = plateNumber.split("");
        System.out.println(plateNumber.substring(plateNumber.length()-1,plateNumber.length()));
        String reg = "^(([京津沪渝冀豫云辽黑湘皖鲁新苏浙赣鄂桂甘晋蒙陕吉闽贵粤青藏川宁琼使领][A-Z](([0-9]{5}[DF])|([DF]([A-HJ-NP-Z0-9])[0-9]{4})))|([京津沪渝冀豫云辽黑湘皖鲁新苏浙赣鄂桂甘晋蒙陕吉闽贵粤青藏川宁琼使领][A-Z][A-HJ-NP-Z0-9]{4}[A-HJ-NP-Z0-9挂学警港澳使领]))$";
        String [] strings1 = plateNumber.split(reg);
        boolean f = plateNumber.matches(reg);

        String str = "Q,W,E,R,T,Y,U,I,O,P,A,S,D,F,G,H,J,K,L,Z,X,C,V,B,N,M,q,w,e,r,t,y,u,i,o,p,a,s,d,f,g,h,j,k,l,z,x,c,v,b,n,m,1,2,3,4,5,6,7,8,9,0,一,二,三,四,五,六,七,八,九,零,幺,京,津,沪,渝,蒙,新,藏,宁,桂,港,澳,黑,吉,辽,晋,冀,青,鲁,豫,苏,皖,浙,闽,赣,湘,鄂,粤,琼,甘,陕,黔,滇,川,警,学";
        List<String> list = Arrays.asList(StringUtils.split(str, ","));
        System.out.println("***************");
    }
}
