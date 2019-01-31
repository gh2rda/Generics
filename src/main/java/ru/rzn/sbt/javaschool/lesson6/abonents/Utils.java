package ru.rzn.sbt.javaschool.lesson6.abonents;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class Utils {

    static Collection<CatalogEntry> transform(List<Person> persons, CreateCatalogFunction function) {
        Collection<CatalogEntry> catalog = new ArrayList<>();
        for (Person person : persons) {
            catalog.add(function.apply(person));
        }
        return catalog;
    }

    static Collection<CatalogEntry> filter(Collection<CatalogEntry> src, Predicate<CatalogEntry> predicate) {
        Collection<CatalogEntry> result = new ArrayList<>();
        for (CatalogEntry entry : src) {
            if (predicate.test(entry)) result.add(entry);
        }
        return result;
    }

    static int count(Collection<CatalogEntry> src, Predicate<CatalogEntry> predicate) {
        int result = 0;
        for (CatalogEntry entry : src) {
            if (predicate.test(entry)) result++;
        }
        return result;
    }

    static boolean contains(Collection<CatalogEntry> src, Predicate<CatalogEntry> predicate) {
        boolean result = false;
        for (CatalogEntry entry : src) {
            if (predicate.test(entry)) {result = true; break;}
        }
        return result;
    }
}
