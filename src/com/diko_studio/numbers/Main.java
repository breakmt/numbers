package com.diko_studio.numbers;

import javax.swing.JFrame;

public class Main {

	public static final String APP_TITLE = "Генератор";
	public static final String APP_VERSION = "1.0";	
	
	public static void main(String[] args) {
		Numbers numbers = new Numbers();
		JFrame frame = new GUI(numbers);
		frame.setVisible(true);
	}

}
