package ru.rzn.sbt.javaschool.lesson6.bff;

import java.util.*;

public class Solution {

    /**
     * 1. Создайте обобщённый класс TwoItems, параметризовынный типом <T> и хранящий две ссылки на объекты типа T.
     * Введите конструктор, принимающий два аргумента и get-методы.
     * <p>
     * 2. В {@link Collection} persons найдите персоны, у которых взаимно совпадают ссылки на лучших друзей
     * {@link Person#bestFriend}, сформируйте из них экземпляры класса TwoItems<Person> и разместите
     * в {@link Collection}<TwoItems>.
     * <p>
     * 3. В качестве результата выполнения метода {@link Solution#findBestFriends(Collection)} верните размер коллекции
     * с парами лучших друзей.
     */
    public static int findBestFriends(Collection<Person> persons) {
        int result = 0;
        Iterator itrOut = persons.iterator();
        Set<TwoItems> setPairBF = null;
        Person p1,p2;
        TwoItems<Person> pairBF;
        if (persons.size() > 1)
            while (itrOut.hasNext()) {
                p1 = (Person) itrOut.next();
                Iterator itrIn = persons.iterator();
                while (itrIn.hasNext()) {
                    p2 = (Person) itrIn.next();
                    if (p1.getBestFriend().equals(p2)) {
                        pairBF =
                    }

                }


            }
        return result;
    }
}
