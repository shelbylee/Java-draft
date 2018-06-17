package com.lxb.draft.collections.list.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListTest {
    public static void main(String[] args) {
        List<String> a = new LinkedList<>();
        a.add("A");
        a.add("B");
        a.add("C");

        List<String> b = new LinkedList<>();
        b.add("D");
        b.add("E");
        b.add("F");
        b.add("G");

        // 交叉着合并链表

        // ListIterator 接口有 add 方法，是 Iterator 接口的子接口
        ListIterator<String> aIter = a.listIterator();
        Iterator<String> bIter = b.listIterator();

        while (bIter.hasNext()) {
            if (aIter.hasNext())
                // next 返回越过的对象的引用
                aIter.next();
            // add 是在迭代器位置之前添加
            aIter.add(bIter.next());
        }

        System.out.println(a);

        // 在 b 中隔一个元素删一个

        bIter = b.iterator();
        while (bIter.hasNext()) {
            bIter.next();
            if (bIter.hasNext()) {
                // 隔一个元素
                bIter.next();
                // remove 会删除上次调用 next 返回的元素（注意：remove 之前必须 next）
                bIter.remove();
            }
        }

        System.out.println(b);

        // 移除 a 中所有 b 的元素
        a.removeAll(b);

        System.out.println(a);
    }
}
