package com.ys.algorithmproject.leetcode.demo.concurrency.Semaphore;

import java.util.List;
import java.util.Vector;
import java.util.concurrent.Semaphore;
import java.util.function.Function;

/**
 * @ Copyright (C), 2015-2020, kxjl.com
 * @ Author:   shuaiyu
 * @ Date:     Created in 2020/1/10 11:54
 * @ Description:
 * @ Modified By：
 * @ Version: 1.0
 */
public class ObjPool<T,R> {
    final List<T> pool;

    final Semaphore semaphore;

    ObjPool(int size,T t){
        pool = new Vector<T>(size);
        for (int i = 0; i < size; i++) {
            pool.add(t);
        }
        semaphore = new Semaphore(size);
    }


    R exec(Function<T,R> func){
        T t = null;
        try {
            semaphore.acquire();
            t = pool.remove(0);
            return func.apply(t);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            pool.add(t);
            semaphore.release();
        }
        return null;
    }


}
