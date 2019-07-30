package com.ys.algorithmproject.leetcode.demo.array;

import java.util.Arrays;

/**
 * @ Description:ArrayList简易版
 * @ Modified By：
 * @ Version: 1.0
 */
public class MyArrayList {
    /**
     * 用于存储数据
     */
    private transient Object[] data = null;

    /**
     * 集合中元素的个数
     */
    private int size = 0;
    //

    /**
     * 集合的默认大小
     */
    private static final int DEFAULT_CAPACITY = 3;

    /***
     * 有参构造函数
     * 指定数组的大小
     * @param initialCapacity：初始化集合大小参数
     */
    public MyArrayList(int initialCapacity){
        if(initialCapacity < 0){
            throw new IllegalArgumentException("非法的集合初始容量值 Illegal Capacity: "+
                    initialCapacity);
        }else{
            //实例化数组
            this.data = new Object[initialCapacity];
        }
    }

    /***
     * 无参构造函数
     * 指定数组的初始大小为 DEFAULT_CAPACITY
     */
    public MyArrayList(){
        this(DEFAULT_CAPACITY);
    }


    /***
     * 获取数组中元素的个数
     * @return
     */
    public int getSize(){
        return this.size;
    }

    /**
     * 判断给定索引是否越界
     * @param index
     * @return
     */
    public boolean checkIndexOut(int index){
        if(index > size || index < 0){
            throw new IndexOutOfBoundsException("指定的索引越界，集合大小为:"+size+",您指定的索引大小为:"+index);
        }
        return true;
    }

    /***
     * 根据索引获得元素
     * @param index
     * @return
     */
    public Object get(int index){
        checkIndexOut(index);
        return data[index];

    }

    /***
     * 删除所有元素
     */
    public void removeAll(){
        this.data = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    /***
     * 根据索引删除元素
     * @param index
     * @return
     */
    public Object remove(int index){
        if(checkIndexOut(index)){
            //保存对象
            Object obj = data[index];
            if(index == size){
                data[index] = null;
            }else{
                //将后边的数组向前移动一位
                System.arraycopy(data, index+1, data, index, size-index);
            }
            size--;
            return obj;
        }

        return null;
    }

    /***
     * 删除指定的元素，删除成功返回 true，失败返回 false
     * @param obj
     * @return
     */
    public boolean remove(Object obj){
        for(int i = 0 ; i < size ; i++){
            if(obj.equals(data[i])){
                remove(i);
                return true;
            }
        }
        return false;
    }


    /***
     * 在指定位置修改元素，通过索引，修改完成后返回原数据
     * @param index
     * @param obj
     * @return
     */
    public Object change(int index,Object obj){
        checkIndexOut(index);
        Object oldObj = data[index];
        data[index] = obj;
        return oldObj;
    }

    /***
     * 根据元素获得在集合中的索引
     * @param o
     * @return
     */
    public int indexOf(Object o) {
        if (o == null) {
            for (int i = 0; i < data.length; i++){
                if (data[i]==null){
                    return i;
                }
            }
        } else {
            for (int i = 0; i < data.length; i++) {
                if (o.equals(data[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    /***
     * 查看集合中是否包含某个元素，如果有，返回 true，没有返回 false
     * @param obj
     * @return
     */
    public boolean contain(Object obj){

        return indexOf(obj)>=0;
    }



    /***
     * 复制原数组，并扩容一倍
     * @param
     */
    public void checkIncrease(int index){
        if(index >= data.length){
            int oldCapacity = data.length;
            int newCapacity = oldCapacity + (oldCapacity >> 1);
            //实例化一个新数组
            data = Arrays.copyOf(data,newCapacity);
        }
    }

    /***
     * 判断集合是否为空，为空返回true
     * @param
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /***
     * 在尾部添加元素
     * @param obj
     * @return
     */
    public boolean add(Object obj){
        //检查是否需要扩容
        checkIncrease(size+1);
        data[size++] = obj;
        return true;

    }





    public static void main(String [] args){

        MyArrayList my = new MyArrayList();
        //System.out.println(my.data.length);
        my.add(3);
        //System.out.println(my.getSize());
        my.add(4);
        //System.out.println(my.getSize());
        my.add(5);
        //my.removeAll();
        //my.remove(2);
        //System.out.println(my.get(2));
        my.add(6);
        System.out.println(my.indexOf(null));
        System.out.println(my.contain(2));
        my.removeAll();
        my.add(3);
        my.add(4);
        for(int i = 0 ; i < my.size ; i++){
            System.out.println(my.data[i]);
        }


    }
}
