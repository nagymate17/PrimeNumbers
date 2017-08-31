package com.matenagy.math;

import java.util.*;
import java.util.stream.*;

public class PrimeNumbers {
	
	
	public static  List<Integer> prime( int num ){
		if(num <= 0 || num > 10000) throw new IllegalArgumentException (" input is wrong...please give me az integer between 1 to 10000");
		else return primeRec(IntStream.rangeClosed(2, num).boxed().collect(Collectors.toList()), new ArrayList<Integer>());
	}
	private static List<Integer> primeRec(List<Integer> in , List<Integer> out){
		if(in.isEmpty()) return out;
		int firstElement = in.get(0);
		out.add(firstElement);
		in = in.stream().filter( n -> n % firstElement  != 0 ).collect(Collectors.toList());
		return primeRec(in,out);
	}
}
