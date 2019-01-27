//package ru.rzn.sbt.javaschool.lesson6.abonents;
//
//import java.util.Collection;
//import java.util.Iterator;
//import java.util.function.Function;
//
//public class Utils {
//    class My1Function<T,R> implements Function<T,R>{
//        @Override
//        public R apply(T o) {
//            return (R)o;
//        }
//
//        @Override
//        public <V> Function<V, R> compose(Function<? super V, ? extends T> before) {
//            return null;
//        }
//
//        @Override
//        public <V> Function<T, V> andThen(Function<? super R, ? extends V> after) {
//            return null;
//        }
//
//    }
//    static <T,R> Collection<R> transform(Collection<T> src, My1Function<T,R> function) {
//        Collection<R> result = new Collection<R>() {
//            @Override
//            public int size() {
//                return 0;
//            }
//
//            @Override
//            public boolean isEmpty() {
//                return false;
//            }
//
//            @Override
//            public boolean contains(Object o) {
//                return false;
//            }
//
//            @Override
//            public Iterator<R> iterator() {
//                return null;
//            }
//
//            @Override
//            public Object[] toArray() {
//                return new Object[0];
//            }
//
//            @Override
//            public <T> T[] toArray(T[] a) {
//                return null;
//            }
//
//            @Override
//            public boolean add(R r) {
//                return false;
//            }
//
//            @Override
//            public boolean remove(Object o) {
//                return false;
//            }
//
//            @Override
//            public boolean containsAll(Collection<?> c) {
//                return false;
//            }
//
//            @Override
//            public boolean addAll(Collection<? extends R> c) {
//                return false;
//            }
//
//            @Override
//            public boolean removeAll(Collection<?> c) {
//                return false;
//            }
//
//            @Override
//            public boolean retainAll(Collection<?> c) {
//                return false;
//            }
//
//            @Override
//            public void clear() {
//
//            }
//        };
//        Iterator<T> itr = src.iterator();
//        R elemR;
//        T elemT;
//        while (itr.hasNext()) {
//            elemT =itr.next();
//            elemR = function.apply(elemT);
//            result.add(elemR);
//        }
//        return result;
//    }
//}
