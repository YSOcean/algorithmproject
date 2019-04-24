package com.ys.algorithmproject.leetcode.demo.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Create by YSOcean
 */
public class TraderTransactionTest {

    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul","Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brain = new Trader("Brain","Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brain,2011,300),
                new Transaction(raoul,2012,1000),
                new Transaction(raoul,2011,400),
                new Transaction(mario,2012,710),
                new Transaction(mario,2012,700),
                new Transaction(alan,2012,950)

        );


        //1、找出2011年发生的所有交易，并按交易额排序（从低到高）
        List<Transaction> allTransaction2011 = transactions.stream()
                .filter(x->x.getYear()==2011)
                .sorted(Comparator.comparing(x->x.getValue()))
                .collect(Collectors.toList());


        //2、交易员都在哪些不同的城市工作过
        List<String> cityAll = transactions.stream()
                .map(x->x.getTrader().getCity())
                .distinct()
                .collect(Collectors.toList());

        //3、查找所有来自剑桥的交易员，并按姓名排序
        List<Trader> traders2 = transactions.stream()
                .filter(x->"Cambridge".equals(x.getTrader().getCity()))
                .map(x->x.getTrader())
                .distinct()
                .sorted(Comparator.comparing(x->x.getName()))
                .collect(Collectors.toList());


        //4、返回所有交易员的姓名字符串，并按字母排序  AlanBrainMarioRaoul
        String nameStr = transactions.stream()
                .map(x->x.getTrader().getName())
                .sorted()
                .reduce("",(x,y)->x+y);
        //5、有没有交易员在米兰工作
        boolean flagWorkMilan = transactions.stream()
                .anyMatch(x->"Milan".equals(x.getTrader().getCity()));

        //6、打印所有生活在剑桥的交易员的所有交易额
        transactions.stream()
                .filter(x->"Cambridge".equals(x.getTrader().getCity()))
                .map(Transaction::getValue)
                .forEach(System.out::print);


        //7、所有交易中，最高的交易额是多少？
        Optional<Integer> maxValue = transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer::max);
        //8、找到交易额最小的交易
        Optional<Integer> minValue = transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer::min);




        //1、找出2011年发生的所有交易，并按交易额排序（从低到高）
        List<Transaction> transactions1 = transactions.stream()
                .filter(t -> t.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());


        //2、交易员都在哪些不同的城市工作过
        List<String> cities = transactions.stream()
                .map(t -> t.getTrader().getCity())
                .distinct()
                .collect(Collectors.toList());

        //3、查找所有来自剑桥的交易员，并按姓名排序
        List<Trader> traders = transactions.stream()
                .filter(t -> "Cambridge".equals(t.getTrader().getCity()))
                .map(Transaction::getTrader)
                .distinct()
                .sorted(Comparator.comparing(Trader::getName))
                .collect(Collectors.toList());

        //4、返回所有交易员的姓名字符串，并按字母排序  AlanBrainMarioRaoul
        String names = transactions.stream()
                .map(t -> t.getTrader().getName())
                .distinct()
                .sorted()
                .reduce("",(n1,n2) -> n1 + n2);

        //5、有没有交易员在米兰工作
        boolean isMilan = transactions.stream()
                .anyMatch(t -> "Milan".equals(t.getTrader().getCity()));

        //6、打印所有生活在剑桥的交易员的所有交易额
        transactions.stream().filter(t -> "Cambridge".equals(t.getTrader().getCity()))
                .map(Transaction::getValue)
                .forEach(System.out::println);

        //7、所有交易中，最高的交易额是多少？
        List<Integer> integerList = transactions.stream()
                .map(Transaction::getValue)
                .sorted(Comparator.reverseOrder())
                .limit(1)
                .collect(Collectors.toList());

        Optional<Integer> highestValue = transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer::max);

        //8、找到交易额最小的交易
        List<Transaction> integerList2 = transactions.stream()
                .sorted(Comparator.comparing(Transaction::getValue).reversed())
                .limit(1)
                .collect(Collectors.toList());

        Optional<Transaction> smallTran = transactions.stream()
                .min(Comparator.comparing(Transaction::getValue));

        Optional<Transaction> smallTran2 = transactions.stream()
                .reduce((t1,t2) -> t1.getValue()<t2.getValue()?t1:t2);

        System.out.println("*************************");

        IntStream eventNumbers = IntStream.rangeClosed(1,100);
        eventNumbers.filter(i -> i%2==0)
                .forEach(System.out::print);

    }
}
