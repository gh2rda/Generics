package ru.rzn.sbt.javaschool.lesson6.abonents;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;

public class Utils {
    class My1Function<T, R> implements Function<T, R> {
        @Override
        public R apply(T o) {
            return (R) o;
        }

        @Override
        public <V> Function<V, R> compose(Function<? super V, ? extends T> before) {
            return null;
        }

        @Override
        public <V> Function<T, V> andThen(Function<? super R, ? extends V> after) {
            return null;
        }

    }

    static <T, R> Collection<R> transform(Collection<T> src, My1Function<T, R> function) {
        Collection<R> result = new ArrayList<>();
        for (T entry : src) {
            result.add(function.apply(entry));
        }
        return result;
    }
}
