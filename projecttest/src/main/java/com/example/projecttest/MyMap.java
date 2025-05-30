package com.example.projecttest;

// Name:         Justin Rhodes
// Class:         CS 3305/ W01
// Term:             Fall 2024
// Instructor:    Sharon Perry
// Assignment:9-Part-1-Hashing

import java.util.Set;

//I'm using the chapter 27 code from the GitHub link provided in assignment 8 as a template for my Hash Map

public interface MyMap<K, V> {
    // Remove all the entries from this map 
    public void clear();

    // Return true if the specified key is in the map
    public boolean containsKey(K key);

    // Return true if this map contains the specified value
    public boolean containsValue(V value);

    // Return a set of entries in the map
    public Set<Entry<K, V>> entrySet();

    // Return the first value that matches the specified key
    public V get(K key);

    // Return true if this map contains no entries
    public boolean isEmpty();

    // Return a set consisting of the keys in this map
    public Set<K> keySet();

    // Add an entry (key, value) into the map
    public V put(K key, V value);

    // Remove the entries for the specified key
    public void remove(K key);

    // Return the number of mappings in this map
    public int getSize();

    // Return a set consisting of the values in this map
    public Set<V> values();

    // Define inner class for Entry
    public static class Entry<K, V> {
        K key;
        V value;
        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
        public K getKey() {
            return key;
        }
        public V getValue() {
            return value;
        }
        @Override
        public String toString() {
            return "[" + key + ", " + value + "]";
        }
    }
}
