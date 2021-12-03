package com.directi.training.dip.exercise;

import java.io.IOException;

public class WriterDataBase implements IWriter{
    @Override
    public void write(String encodedString) throws IOException {
        MyDatabase database = new MyDatabase();
        database.write(encodedString);
    }
}
