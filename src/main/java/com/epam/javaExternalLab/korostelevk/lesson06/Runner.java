package com.epam.javaExternalLab.korostelevk.lesson06;

import com.epam.javaExternalLab.korostelevk.lesson06.Demo.DemoServiceWithCollections;
import com.epam.javaExternalLab.korostelevk.lesson06.Demo.DemoServiceWithStreams;
import com.epam.javaExternalLab.korostelevk.lesson06.Demo.Interface.DemoService;

public class Runner {
    public static void main(String[] args) {
        String fileName = "dune.txt";

        DemoService demoServiceCollections = new DemoServiceWithCollections(fileName);
        demoServiceCollections.allTests();

        DemoService demoServiceStreams = new DemoServiceWithStreams(fileName);
        demoServiceStreams.allTests();
    }
}
