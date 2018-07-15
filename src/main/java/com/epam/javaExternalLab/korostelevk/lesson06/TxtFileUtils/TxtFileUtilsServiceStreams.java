package com.epam.javaExternalLab.korostelevk.lesson06.TxtFileUtils;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TxtFileUtilsServiceStreams extends AbstractTxtFileUtils {

    public TxtFileUtilsServiceStreams(String fileName) {
        super(fileName);
    }

    @Override
    public Map<String, Long> countWords() {
        return Arrays.stream(splitText())
                .collect(HashMap::new, (m, key) -> m.put(key, m.containsKey(key) ? m.get(key) + 1 : 1), HashMap::putAll);
    }

    @Override
    public Set<String> getUniqueWords() {
        return Arrays.stream(splitText()).collect(Collectors.toSet());
    }

    @Override
    public List<String> sortWords(Comparator<String> comparator) {
        return Arrays.stream(splitText()).distinct().sorted(comparator).collect(Collectors.toCollection(ArrayList::new));
    }

    @Override
    public List<String> sortWords() {
        return sortWords(Comparator.naturalOrder());
    }

    @Override
    protected String readFromFile() {
        try (Stream<String> stream = Files.lines(Paths.get(getFileName()), Charset.forName("UTF8"))) {
            return stream.reduce(((s1, s2) -> s1 + " " + s2)).orElse("");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    public void printSet(Set<String> set) {
        set.forEach(System.out::println);
    }

    public void printMap(Map<String, Long> map) {
        map.entrySet().forEach(e -> System.out.println((e.getKey() + " - " + e.getValue()) + " times"));
    }

    @Override
    public void printList(List<String> list) {
        list.forEach(System.out::println);
    }
}
