package ru.rzn.sbt.javaschool.lesson6.abonents;

import java.util.function.Predicate;

public class RznCytiPredicate implements Predicate<CatalogEntry> {
    @Override
    public boolean test(CatalogEntry entry) {
        return entry.getCity().equals("Рязань");
    }
}
