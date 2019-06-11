package com.ys.algorithmproject.leetcode.demo.consumer;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * Create by YSOcean
 */
public class TreeMapTest {

/*    //添加元素
    public V put(K key, V value) {
        TreeMap.Entry<K,V> t = root;
        //如果根节点为空，即TreeMap中一个元素都没有，那么设置新添加的元素为根节点
        //并且设置集合大小size=1,以及modCount+1，这是用于快速失败
        if (t == null) {
            compare(key, key); // type (and possibly null) check

            root = new TreeMap.Entry<>(key, value, null);
            size = 1;
            modCount++;
            return null;
        }
        int cmp;
        TreeMap.Entry<K,V> parent;
        // split comparator and comparable paths
        Comparator<? super K> cpr = comparator;
        //如果比较器不为空，即初始化TreeMap构造函数时，有传递comparator类
        //那么插入新的元素时，按照comparator实现的类进行排序
        if (cpr != null) {
            //通过do-while循环不断遍历树，调用比较器对key值进行比较
            do {
                parent = t;
                cmp = cpr.compare(key, t.key);
                if (cmp < 0)
                    t = t.left;
                else if (cmp > 0)
                    t = t.right;
                else
                    //遇到key相等，直接将新值覆盖到原值上
                    return t.setValue(value);
            } while (t != null);
        }
        //如果比较器为空，即初始化TreeMap构造函数时，没有传递comparator类
        //那么插入新的元素时，按照key的自然顺序
        else {
            //如果key==null，直接抛出异常
            //注意，上面构造TreeMap传入了Comparator，是可以允许key==null
            if (key == null)
                throw new NullPointerException();
            @SuppressWarnings("unchecked")
            Comparable<? super K> k = (Comparable<? super K>) key;
            do {
                parent = t;
                cmp = k.compareTo(t.key);
                if (cmp < 0)
                    t = t.left;
                else if (cmp > 0)
                    t = t.right;
                else
                    return t.setValue(value);
            } while (t != null);
        }
        //找到父亲节点，根据父亲节点创建一个新节点
        TreeMap.Entry<K,V> e = new TreeMap.Entry<>(key, value, parent);
        if (cmp < 0)
            parent.left = e;
        else
            parent.right = e;
        //修正红黑树（包括节点的左旋和右旋，具体可以看我Java数据结构和算法中对红黑树的介绍）
        fixAfterInsertion(e);
        size++;
        modCount++;
        return null;
    }


    public V remove(Object key) {
        //根据key找到该节点
        TreeMap.Entry<K,V> p = getEntry(key);
        if (p == null)
            return null;
        //获取该节点的value，并返回
        V oldValue = p.value;
        //调用deleteEntry()方法删除节点
        deleteEntry(p);
        return oldValue;
    }

    private void deleteEntry(TreeMap.Entry<K,V> p) {
        modCount++;
        size--;

        //如果删除节点的左右节点都不为空，即有两个孩子
        if (p.left != null && p.right != null) {
            //得到该节点的中序后继节点
            TreeMap.Entry<K,V> s = successor(p);
            p.key = s.key;
            p.value = s.value;
            p = s;
        } // p has 2 children

        // Start fixup at replacement node, if it exists.
        TreeMap.Entry<K,V> replacement = (p.left != null ? p.left : p.right);
        //待删除节点只有一个子节点，直接删除该节点，并用该节点的唯一子节点顶替该节点
        if (replacement != null) {
            // Link replacement to parent
            replacement.parent = p.parent;
            if (p.parent == null)
                root = replacement;
            else if (p == p.parent.left)
                p.parent.left  = replacement;
            else
                p.parent.right = replacement;

            // Null out links so they are OK to use by fixAfterDeletion.
            p.left = p.right = p.parent = null;

            // Fix replacement
            if (p.color == BLACK)
                fixAfterDeletion(replacement);

            //TreeMap中只有待删除节点P，也就是只有一个节点，直接返回nul即可
        } else if (p.parent == null) { // return if we are the only node.
            root = null;
        } else { //  No children. Use self as phantom replacement and unlink.
            //待删除节点没有子节点，即为叶子节点，直接删除即可
            if (p.color == BLACK)
                fixAfterDeletion(p);

            if (p.parent != null) {
                if (p == p.parent.left)
                    p.parent.left = null;
                else if (p == p.parent.right)
                    p.parent.right = null;
                p.parent = null;
            }
        }
    }

    public V get(Object key) {
        TreeMap.Entry<K,V> p = getEntry(key);
        return (p==null ? null : p.value);
    }

    final TreeMap.Entry<K,V> getEntry(Object key) {
        // Offload comparator-based version for sake of performance
        if (comparator != null)
            return getEntryUsingComparator(key);
        if (key == null)
            throw new NullPointerException();
        @SuppressWarnings("unchecked")
        Comparable<? super K> k = (Comparable<? super K>) key;
        TreeMap.Entry<K,V> p = root;
        while (p != null) {
            int cmp = k.compareTo(p.key);
            if (cmp < 0)
                p = p.left;
            else if (cmp > 0)
                p = p.right;
            else
                return p;
        }
        return null;
    }
    */

    public static void main(String[] args) {
TreeMap<String,Integer> map = new TreeMap<>();
map.put("A",1);
map.put("B",2);
map.put("C",3);

//第一种方法
//首先利用keySet()方法得到key的集合，然后利用map.get()方法根据key得到value
Iterator<String> iterator = map.keySet().iterator();
while(iterator.hasNext()){
    String key = iterator.next();
    System.out.println(key+":"+map.get(key));
}

//第二种方法
Iterator<Map.Entry<String,Integer>> iterator1 = map.entrySet().iterator();
while(iterator1.hasNext()){
    Map.Entry<String,Integer> entry = iterator1.next();
    System.out.println(entry.getKey()+":"+entry.getValue());
}
    }

}
