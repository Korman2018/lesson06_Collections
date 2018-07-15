package com.epam.javaExternalLab.korostelevk.lesson06.TxtFileUtils;


import com.epam.javaExternalLab.korostelevk.lesson06.TxtFileUtils.Interface.TxtFileUtilsService;

public abstract class AbstractTxtFileUtils implements TxtFileUtilsService {

    private String fileName;

    public AbstractTxtFileUtils(String fileName) {
        this.fileName = fileName;
    }

    protected abstract String readFromFile();

    protected String[] splitText() {
        return readFromFile().split("(U?)[\\p{Punct}\\s]+");
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
