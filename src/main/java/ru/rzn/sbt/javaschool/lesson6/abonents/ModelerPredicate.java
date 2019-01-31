package ru.rzn.sbt.javaschool.lesson6.abonents;

import java.util.function.Predicate;

public class ModelerPredicate implements Predicate<CatalogEntry> {
    @Override
    public boolean test(CatalogEntry entry) {
        return entry.getPerson().getProfession().equals("Модельер");
    }
}
