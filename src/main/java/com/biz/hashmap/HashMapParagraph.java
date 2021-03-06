package com.biz.hashmap;

import java.util.ArrayList;

public class HashMapParagraph<K, V> {
    private final int bucket;
    ArrayList<LinkedList<K>> bucketArrayList;

    public HashMapParagraph() {
        this.bucket = 10;
        this.bucketArrayList = new ArrayList<>(bucket);
        for (int i = 0; i < bucket; i++) {
            this.bucketArrayList.add(null);
        }
    }

    public V get(K key) {
        int index = Math.abs(key.hashCode() % bucket);
        LinkedList<K> linkedList = this.bucketArrayList.get(index);
        if (linkedList == null) {
            return null;
        }
        MapNode<K, V> mapNode = (MapNode<K, V>) linkedList.search(key);
        return (mapNode == null) ? null : mapNode.getValue();
    }


    public void add(K key, V value) {
        int index = Math.abs(key.hashCode() % bucket);
        LinkedList<K> linkedList = this.bucketArrayList.get(index);
        if (linkedList == null) {
            linkedList = new LinkedList<>();
        }
        this.bucketArrayList.set(index, linkedList);
        MapNode<K, V> mapNode = (MapNode<K, V>) linkedList.search(key);
        if (mapNode == null) {
            mapNode = new MapNode<>(key, value);
            linkedList.append(mapNode);
        } else mapNode.setValue(value);
    }
}
