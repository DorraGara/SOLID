package com.directi.training.dip.exercise;

import java.io.IOException;

public class EncodingModuleClient
{
    public static void main(String[] args) throws IOException
    {
        EncodingModule encodingModule = new EncodingModule();
        encodingModule.encodeWithFiles("D:/Studies/GL4/Qualite logiciel/TP/SOLID-master/SOLID-master/DIP/src/com/directi/training/dip/exercise/afterEncryption.txt");
        //encodingModule.encodeBasedOnNetworkAndDatabase();
    }
}
