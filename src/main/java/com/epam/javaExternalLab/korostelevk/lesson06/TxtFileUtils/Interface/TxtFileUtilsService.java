package com.epam.javaExternalLab.korostelevk.lesson06.TxtFileUtils.Interface;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface TxtFileUtilsService {

    Map<String, Long> countWords();

    Set<String> getUniqueWords();

    List<String> sortWords(Comparator<String> comparator);

    List<String> sortWords();

    void printSet(Set<String> set);

    void printMap(Map<String, Long> map);

    void printList(List<String> list);
}
