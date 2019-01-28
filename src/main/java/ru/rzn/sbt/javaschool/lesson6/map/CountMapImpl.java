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
            map.replace(o, map.get(o) + 1);
        } else map.put(o, 1);
    }

    @Override
    public int getCount(T o) {
        if (map.containsKey(o)) {
            return map.get(o);
        } else return 0;
    }

    @Override
    public int remove(T o) throws NullPointerException {
        int result = 0;
        try {
            if (map.containsKey(o)) {
                result = map.get(o);
                if (result == 1) map.remove(o);
                else
                    map.replace(o, map.get(o) - 1);
            }
        } catch (NullPointerException e) {
            throw e;
        }
        return result;

    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public void addAll(CountMap source) throws NullPointerException {
        try {
            if (source != null) {
                CountMapImpl<T> items = (CountMapImpl<T>) source;
                Iterator<Map.Entry<T, Integer>> entries = items.map.entrySet().iterator();
                while (entries.hasNext()) {
                    Map.Entry<T, Integer> entry = entries.next();
                    T curentKey = entry.getKey();
                    if (map.containsKey(curentKey)) {
                        map.replace(curentKey, map.get(curentKey) + entry.getValue());
                    } else map.put(curentKey, entry.getValue());
                }
            } else
               throw  new NullPointerException();
        } catch (NullPointerException e) {
            throw e;
        }
    }

    @Override
    public TreeMap<T, Integer> toMap() {
        return map;
    }

    @Override
    public void toMap(Map destination) throws NullPointerException {
        if (destination != null) destination = (Map) map;
        else throw new NullPointerException();
    }

}
