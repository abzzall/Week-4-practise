package com.company;


import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Generic<T extends Number, V >  {
    T t;
    V v;
    public void set(T t) {
        this.t = t;
    }

    public  void set( V v) {
    }


}
