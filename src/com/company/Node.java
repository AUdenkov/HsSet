package com.company;

import java.util.Objects;

public class Node <K>{
    private int hash;
    private final K key;
    private Node<K> nextNode;

    public Node(K key) {
        this.key = key;
        hash=key.hashCode();
    }

    public int getHash() {
        return hash;
    }

    public void setHash(int hash) {
        this.hash = hash;
    }

    public K getKey() {
        return key;
    }

    public Node<K> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<K> nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node<?> node = (Node<?>) o;
        return Objects.equals(key, node.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key);
    }

    @Override
    public String toString() {
        return "Node{" +
                "key=" + key +
                ", nextNode= " + nextNode+
                '}';
    }
}
