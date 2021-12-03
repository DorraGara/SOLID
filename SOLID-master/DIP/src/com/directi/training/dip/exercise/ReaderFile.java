package com.directi.training.dip.exercise;

import java.io.*;
import java.util.Base64;

public class ReaderFile implements IReader {

    private String _fileName;

    public ReaderFile(String fileName) {
        _fileName = fileName;
    }

    @Override
    public String read() throws IOException {
        StringBuilder lines = new StringBuilder();
        BufferedReader reader = new BufferedReader(new FileReader(_fileName));
        String aLine;
        while ((aLine = reader.readLine()) != null) {
            lines.append(aLine);
        }
        reader.close();
        return lines.toString();
    }
}
