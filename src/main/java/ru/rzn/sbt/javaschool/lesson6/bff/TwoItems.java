package ru.rzn.sbt.javaschool.lesson6.bff;

public class TwoItems<T> {
    private T first;
    private T second;

    public TwoItems(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }
}
