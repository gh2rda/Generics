package ru.rzn.sbt.javaschool.lesson6.abonents;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class Utils {

    static Collection<CatalogEntry> transform(List<Person> persons, MyFirstFunction function) {
        Collection<CatalogEntry> catalog = new ArrayList<>();
        for (Person person : persons) {
            catalog.add(function.apply(person));
        }
        return catalog;
    }

}
