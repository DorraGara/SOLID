package com.directi.training.dip.exercise_refactored;

import java.io.IOException;

public class EncodingModuleClient
{
    public static void main(String[] args) throws IOException
    {
    	WriterFile writer = new WriterFile();
    	ReaderDataBase reader = new ReaderDataBase();
        EncodingModule encodingModule = new EncodingModule(reader, writer);
        encodingModule.encode();
    }
}
