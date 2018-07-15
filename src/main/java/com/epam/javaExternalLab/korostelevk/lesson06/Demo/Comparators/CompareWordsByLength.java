package com.epam.javaExternalLab.korostelevk.lesson06.Demo.Comparators;

import java.util.Comparator;

public class CompareWordsByLength implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        if (o1 == null) {
            return -1;
        }

        return o2 == null ? 1 : o1.length() - o2.length();
    }
}
