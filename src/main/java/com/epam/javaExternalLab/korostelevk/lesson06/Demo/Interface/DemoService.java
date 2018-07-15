package com.epam.javaExternalLab.korostelevk.lesson06.Demo.Interface;

public interface DemoService {

    void countWordsTests();

    void getUniqueWordsTests();

    void sortWordsTests();

    default void allTests() {
        countWordsTests();
        getUniqueWordsTests();
        sortWordsTests();
    }
}
