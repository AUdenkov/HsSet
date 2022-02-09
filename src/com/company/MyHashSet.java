package com.company;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSet<K> {
    private LinkedList<Node<K>>[] array;
    private int size;
    private int capacity;
    private int max;

    public MyHashSet() {
        capacity = 16;
        max = (int) (16 * 0.75);
        array = new LinkedList[capacity];

    }

    public MyHashSet(int capacity) {
        capacity = 16;
        max = (int) (16 * 0.75);
        array = new LinkedList[capacity];
    }

    private int CheckPosition(int hash) {
        return hash % capacity;
    }

    public boolean put(K key) {
        int position = CheckPosition(Math.abs(key.hashCode()));
        if (array[position] == null) {
            Node<K> node = new Node<>(key);
            LinkedList linkedList = new LinkedList();
            array[position] = linkedList;
            array[position].add(node);
            size++;
            return true;
        }
        else {
            int count=0;
            Node<K> temp=array[position].get(count);
            while (true){
                if (temp.getKey().hashCode()==key.hashCode()){
                    if (temp.getKey().equals(key)){
                        return false;
                    }
                }
                if (count+1==array[position].size()){
                    Node<K> node=new Node<>(key);
                    array[position].add(node);
                    temp.setNextNode(node);
                    return true;
                }
                count++;
                temp=array[position].get(count);
            }
        }
    }
    public int size(){
        return size;
    }
    public boolean contains(K key){
        int position = CheckPosition(Math.abs(key.hashCode()));
        if (array[position]==null){
            return false;
        }
        else {
            int count=0;
            Node<K> temp=array[position].get(count);
            while (true){
                if (temp.getKey().hashCode()==key.hashCode()){
                    if (temp.getKey().equals(key)){
                        return true;
                    }
                }
                if (count+1==array[position].size()){
                    return false;
                }
                count++;
            }
        }
    }
    @Override
    public String toString() {
        return "MyHashSet{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
