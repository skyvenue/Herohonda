package com.javautlity;

import java.util.Random;

public class JavaUtlity {
	
	public int getRandomNumber() {
		  
		  Random ranDom = new Random();
		  int ranDomNumber = ranDom.nextInt(5000);
		  return ranDomNumber;
		  
	  }

}
