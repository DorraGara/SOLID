package com.directi.training.dip.exercise_refactored;

import java.io.IOException;

public class EncodingModule
{
	private IReader reader;
	private IWriter writer;
	
	public EncodingModule(IReader reader, IWriter writer) {
		this.reader = reader;
		this.writer = writer;
	}
	
	public void encode() throws IOException {
		String encodedString = reader.read();
		writer.write(encodedString);
	}
}

