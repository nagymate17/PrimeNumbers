package com.matenagy.math;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PrimeNumbersTest {
	private static List<Integer> resultList = new ArrayList<Integer>();
	private static int numbersOfTesting = 1;
	
	@Before
	public void init(){
		System.out.println("Testing ...");	
	}
	
	@After
	public void finallyy(){
		System.out.format("End of testing %d \n",numbersOfTesting);
		numbersOfTesting += 1;
	}
	
	@Test
	public void wrongArgument(){
		try{
			PrimeNumbers.prime(-1);
		}catch(IllegalArgumentException e){
			System.out.println("Illegal Argument Exception catched!");
		} 	
	}

	@Test
	public void firsElement() {
		resultList = PrimeNumbers.prime(10000);
		int result = resultList.get(0);
		assert(2 == result);
	}
	
	
	
	
	

}
