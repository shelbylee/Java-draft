package com.lxb.draft.collections.set.treeset;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {

        // 因为 TreeSet 借助 TreeMap 实现，而 TreeMap 有两种排序方式，所以 TreeSet 也支持这两种排序方式

        // 第一种：根据容器中元素的 compareTo 排序，即自然顺序

        SortedSet<Student> students = new TreeSet<>();

        students.add(new Student("Joe", 2015));
        students.add(new Student("Amanda", 2016));
        students.add(new Student("Clair", 2017));
        students.add(new Student("Amanda", 2014));
        students.add(new Student("Amanda", 2018));

        System.out.println(students);

        // 第二种：根据给定的比较器排序
        // 此处用指定姓名排序没有意义，只是为了练习使用

        // 采用 name 排序时，重名的 Amanda 只会输出 id 小的那个，这个和树有关系

        NavigableSet<Student> sortByName = new TreeSet<>(
                Comparator.comparing(Student::getName)
        );

        sortByName.addAll(students);

        System.out.println(sortByName);

    }
}
