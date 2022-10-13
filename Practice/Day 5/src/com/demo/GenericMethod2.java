/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo;

/**
 * Key & Value
 *
 * @author Mahesh
 */
public class GenericMethod2<K, V> {

    private K key;
    private V value;

    public GenericMethod2(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public static void main(String[] args) {
        GenericMethod2<Integer, String> g = new GenericMethod2<>(1, "aaa");
        System.out.println("key-->" + g.getKey());
        System.out.println("value-->" + g.getValue());

        GenericMethod2<String, String> g1 = new GenericMethod2<>("ID", "S001");
        System.out.println("key-->" + g1.getKey());
        System.out.println("value-->" + g1.getValue());

    }

}
