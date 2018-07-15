package com.epam.javaExternalLab.korostelevk.lesson06.TxtFileUtils;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;

import static java.nio.file.Files.readAllBytes;

public class TxtFileUtilsServiceCollections extends AbstractTxtFileUtils {

    public TxtFileUtilsServiceCollections(String fileName) {
        super(fileName);
    }

    @Override
    public Map<String, Long> countWords() {
        Map<String, Long> map = new HashMap<>();

        for (String s : splitText()) {
            map.put(s, map.containsKey(s) ? map.get(s) + 1 : 1);
        }
        return map;
    }

    @Override
    public Set<String> getUniqueWords() {
        Set<String> set = new HashSet<>();

        set.addAll(Arrays.asList(splitText()));
        return set;
    }

    @Override
    public List<String> sortWords(Comparator<String> comparator) {
        List<String> list = Arrays.asList(splitText());

        list.sort(comparator);
        return list;
    }

    @Override
    public List<String> sortWords() {
        return sortWords(null);
    }

    @Override
    protected String readFromFile() {
        try {
            return new String(readAllBytes(Paths.get(getFileName())), "UTF8");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    public void printSet(Set<String> set) {
        for (String s : set) {
            System.out.println(s);
        }
    }

    public void printMap(Map<String, Long> map) {
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " - " + m.getValue() + " times");
        }
    }

    @Override
    public void printList(List<String> list) {
        for (String s : list) {
            System.out.println(s);
        }
    }
}
