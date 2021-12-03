package com.directi.training.dip.exercise;

import java.io.*;
import java.util.Base64;

public class WriterFile implements IWriter {
    @Override
    public void write(String encodedString) throws IOException {

        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(
                    new FileWriter("D:/Studies/GL4/Qualite logiciel/TP/SOLID-master/SOLID-master/DIP/src/com/directi/training/dip/exercise/afterEncryption.txt"));
            String aLine;
            writer.append(encodedString);
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }
}
