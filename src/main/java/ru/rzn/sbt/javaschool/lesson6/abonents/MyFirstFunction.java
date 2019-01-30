package ru.rzn.sbt.javaschool.lesson6.abonents;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class MyFirstFunction implements Function<Person, CatalogEntry> {
     List<PhoneCode> phoneCodesList;

    public MyFirstFunction(List<PhoneCode> phoneCodesList) {
        this.phoneCodesList = phoneCodesList;
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
