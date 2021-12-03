package com.directi.training.dip.exercise_refactored;

import java.io.IOException;

public class WriterDataBase implements IWriter{
    @Override
    public void write(String encodedString) throws IOException {
        MyDatabase database = new MyDatabase();
        database.write(encodedString);
    }
}
