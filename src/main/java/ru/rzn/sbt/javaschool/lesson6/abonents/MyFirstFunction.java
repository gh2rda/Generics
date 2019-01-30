package ru.rzn.sbt.javaschool.lesson6.abonents;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public abstract class MyFirstFunction implements Function<Person, CatalogEntry> {
    @Override
    public <V> Function<V, CatalogEntry> compose(Function<? super V, ? extends Person> before) {
        return null;
    }

    @Override
    public <V> Function<Person, V> andThen(Function<? super CatalogEntry, ? extends V> after) {
        return null;
    }

    @Override
    public CatalogEntry apply(Person person) {
        String codeCity = "", city = "", region = "";
        codeCity = person.getPhoneNumber().substring(2);
        for (PhoneCode phCode : phoneCodesList) {
            if (codeCity.startsWith(phCode.getCode())) {
                codeCity = phCode.getCode();
                city = phCode.getCity();
                region = phCode.getRegion();
            }
        }
        return new CatalogEntry(person, city, region);
    }
}
