package com.directi.training.dip.exercise_refactored;

import java.io.IOException;

public interface IWriter {
    void write(String encodedString) throws IOException;
}
