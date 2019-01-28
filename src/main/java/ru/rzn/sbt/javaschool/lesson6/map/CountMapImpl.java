package ru.rzn.sbt.javaschool.lesson6.map;

import java.util.*;

public class CountMapImpl<T> implements CountMap<T> {
    private TreeMap<T, Integer> map;

    public CountMapImpl() {
        this.map = new TreeMap<>();

    }

    @Override
    public void add(T o) {
        if (map.containsKey(o)) {
            map.put(o, map.get(o) + 1);
        } else map.put(o, 1);
    }

    @Override
    public int getCount(T o) {
        if (map.containsKey(o)) {
            return map.get(o);
        } else return 0;
    }

    @Override
    public int remove(T o) {
        return map.remove(o);
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public void addAll(CountMap source) {
        this.map.putAll(source.toMap());
    }

    @Override
    public TreeMap<T, Integer> toMap() {
        return map;
    }

    @Override
    public void toMap(Map destination) {
        if (destination !=null) destination = (Map) map;
    }

}
