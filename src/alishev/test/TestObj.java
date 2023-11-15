package alishev.test;

import university.lesson2.Test;

import java.util.Objects;

public class TestObj implements Comparable<TestObj>{
    int id;

    public TestObj(int id) {
        this.id = id;
    }

    public int compareTo(TestObj o){
        if(id > o.id){
            return -1;
        }else if(id < o.id){
            return 1;
        }else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestObj testObj = (TestObj) o;
        return id == testObj.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "TestObj{" +
                "id=" + id +
                '}';
    }
}
