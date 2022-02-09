package com.company;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        Men men1 = new Men("Andrey");
        Men men2 = new Men("Denis");
        Men men3 = new Men("Veronika");
        Men men4 = new Men("Vea");
        MyHashSet<Men> myHashSet = new MyHashSet<>();
        myHashSet.put(men1);
        myHashSet.put(men2);
        myHashSet.put(men2);
        myHashSet.put(men3);
        System.out.println(myHashSet);
        System.out.println(myHashSet.size());
    }
}
