package com.example.from;

import java.io.Serializable;

public class EchoForm implements Serializable{
	private static final long serialVerionUID = 1L;

	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}


}
