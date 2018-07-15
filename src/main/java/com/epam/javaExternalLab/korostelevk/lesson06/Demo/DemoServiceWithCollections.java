package com.epam.javaExternalLab.korostelevk.lesson06.Demo;

import com.epam.javaExternalLab.korostelevk.lesson06.Demo.Comparators.CompareWordsByLength;
import com.epam.javaExternalLab.korostelevk.lesson06.Demo.Interface.DemoService;
import com.epam.javaExternalLab.korostelevk.lesson06.TxtFileUtils.Interface.TxtFileUtilsService;
import com.epam.javaExternalLab.korostelevk.lesson06.TxtFileUtils.TxtFileUtilsServiceCollections;

public class DemoServiceWithCollections implements DemoService {

    private TxtFileUtilsService txtFileUtilsService;

    public DemoServiceWithCollections(String fileName) {
        txtFileUtilsService = new TxtFileUtilsServiceCollections(fileName);
        System.out.println("\nTxtFileUtilsServiceCollections test");
    }

    @Override
    public void countWordsTests() {
        System.out.println("\ntxtFileUtilsService  countWords test(collection)");
        txtFileUtilsService.printMap(txtFileUtilsService.countWords());
    }

    @Override
    public void getUniqueWordsTests() {
        System.out.println("\ngetUniqueWordsTests test(collection)");
        txtFileUtilsService.printSet(txtFileUtilsService.getUniqueWords());
    }

    @Override
    public void sortWordsTests() {
        System.out.println("\nsortWords with custom comparator test(collection, compare by words length)");
        txtFileUtilsService.printList(txtFileUtilsService.sortWords(new CompareWordsByLength()));

        System.out.println("\nsortWords test(collection, natural ordered)");
        txtFileUtilsService.printList(txtFileUtilsService.sortWords());
    }
}
