package com.biz.hashmap;


public class HashMap<K, V> {

    LinkedList<K> linkedList;
    private Object Key;

    public HashMap() {
        this.linkedList = new LinkedList<>();
    }

    public V get(K key) {
        MapNode<K, V> mapNode = (MapNode<K, V>) this.linkedList.search(key);
        if (mapNode == null)
            return null;
        return mapNode.getValue();

    }

    public void add(K key, V value) {
        MapNode<K, V> mapNode = (MapNode<K, V>) this.linkedList.search(key);
        if (mapNode == null) {
            mapNode = new MapNode<>(key, value);
            this.linkedList.append(mapNode);
        } else
            mapNode.setValue(value);
    }

    public V remove(K key) {
        MapNode<K,V> mapNode= (MapNode<K, V>) this.linkedList.delete(key);
        if (mapNode==null){
            System.out.println("Word is not there in para");
        }
        return mapNode.getValue();
    }
}
