package ru.rzn.sbt.javaschool.lesson6.map;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class CountMapImpl<T> implements CountMap<T> {
    private Map<T, Integer> map;

    public CountMapImpl() {
        this.map = new Map<T, Integer>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean containsKey(Object key) {
                return false;
            }

            @Override
            public boolean containsValue(Object value) {
                return false;
            }

            @Override
            public Integer get(Object key) {
                return null;
            }

            @Override
            public Integer put(T key, Integer value) {
                return null;
            }

            @Override
            public Integer remove(Object key) {
                return null;
            }

            @Override
            public void putAll(Map<? extends T, ? extends Integer> m) {

            }

            @Override
            public void clear() {

            }

            @Override
            public Set<T> keySet() {
                return null;
            }

            @Override
            public Collection<Integer> values() {
                return null;
            }

            @Override
            public Set<Entry<T, Integer>> entrySet() {
                return null;
            }
        };
    }
//    public CountMapImpl(Map<T, Integer> m) {
//        this.map = m;
//    }

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
        return 0;
    }

    @Override
    public void addAll(CountMap source) {

    }

    @Override
    public Map toMap() {
        return map;
    }

    @Override
    public void toMap(Map destination) {
        destination = map;
    }
}
