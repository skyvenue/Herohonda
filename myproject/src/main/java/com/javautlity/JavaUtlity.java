package com.javautlity;

import java.util.Random;

public class JavaUtlity {
public int getRandomNumber() {
	Random rndm = new Random();
	int Randomnum = rndm.nextInt(100);
	return Randomnum;
}
}
