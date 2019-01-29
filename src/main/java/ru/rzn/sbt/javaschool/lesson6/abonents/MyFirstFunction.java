//package ru.rzn.sbt.javaschool.lesson6.abonents;
//
//import java.util.function.Function;
//
//public abstract class MyFirstFunction<T, R> implements Function<T, R> {
//    @Override
//    public <V> Function<V, R> compose(Function<? super V, ? extends T> before) {
//        return null;
//    }
//
//    @Override
//    public <V> Function<T, V> andThen(Function<? super R, ? extends V> after) {
//        return null;
//    }
//
//    @Override
//    public R apply(Person p) {
//       CatalogEntry result = new CatalogEntry();
//
//                public CatalogEntry(Person person, String city, String region) {
//
//            String codeCity = p.getPhoneNumber().substring(2, p.getPhoneNumber().length());
//            String city = "";
//
//            String region = "";
//            result = new CatalogEntry(p, city, region);
//            return result;
//        }
//    }
//
//
//}
