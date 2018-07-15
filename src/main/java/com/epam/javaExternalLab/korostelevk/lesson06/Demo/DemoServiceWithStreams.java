package com.epam.javaExternalLab.korostelevk.lesson06.Demo;

import com.epam.javaExternalLab.korostelevk.lesson06.Demo.Interface.DemoService;
import com.epam.javaExternalLab.korostelevk.lesson06.TxtFileUtils.Interface.TxtFileUtilsService;
import com.epam.javaExternalLab.korostelevk.lesson06.TxtFileUtils.TxtFileUtilsServiceStreams;

import java.util.Comparator;

public class DemoServiceWithStreams implements DemoService {

    private TxtFileUtilsService txtFileUtilsService;

    public DemoServiceWithStreams(String fileName) {
        txtFileUtilsService = new TxtFileUtilsServiceStreams(fileName);
        System.out.println("\nTxtFileUtilsServiceStreams test");
    }

    @Override
    public void countWordsTests() {
        System.out.println("\ntxtFileUtilsService  countWords test(streams)");
        txtFileUtilsService.printMap(txtFileUtilsService.countWords());
    }

    @Override
    public void getUniqueWordsTests() {
        System.out.println("\ngetUniqueWordsTests test(streams)");
        txtFileUtilsService.printSet(txtFileUtilsService.getUniqueWords());
    }

    @Override
    public void sortWordsTests() {
        System.out.println("\nsortWords with custom comparator test(streams, compare by words length)");
        txtFileUtilsService.printList(txtFileUtilsService.sortWords(Comparator.comparingInt(String::length)));

        System.out.println("\nsortWords test(streams, natural ordered)");
        txtFileUtilsService.printList(txtFileUtilsService.sortWords());
    }
}
