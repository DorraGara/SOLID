package com.directi.training.dip.exercise;

import java.io.IOException;

public class EncodingModule
{
    public void encodeWithFiles(String fileName) throws IOException
    {
        IReader reader = new ReaderFile(fileName);
        IWriter writer = new WriterFile();
        String encodedString = reader.read();
        writer.write(encodedString);
    }

    public void encodeBasedOnNetworkAndDatabase() throws IOException
    {
        IReader reader = new ReaderDataBase();
        IWriter writer = new WriterDataBase();
        String encodedString = reader.read();
        writer.write(encodedString);
    }
}

