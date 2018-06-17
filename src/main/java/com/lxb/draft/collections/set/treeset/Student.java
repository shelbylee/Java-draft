package com.lxb.draft.collections.set.treeset;

import java.util.Objects;

public class Student implements Comparable<Student> {

    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", id=" + id + "]";
    }

    @Override
    public boolean equals(Object otherObject) {

        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if (getClass() != otherObject.getClass()) return false;

        Student other = (Student) otherObject;

        return Objects.equals(id, other.id) && Objects.equals(name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    // Student 类的比较器：先根据姓名排序，如果姓名相同再按照 id 排序
    @Override
    public int compareTo(Student other) {
        int diff = name.compareTo(other.name);
        return diff != 0 ? diff : Integer.compare(id, other.id);
    }
}
