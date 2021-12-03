package com.directi.training.dip.exercise_refactored;

import java.io.*;

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
