package com.mkyong.java8.JAVA8;

import java.util.function.Consumer;;

public class Read {

	static int value = 6;
	
	public static void main(String[]ar) {
		//we can't use the value incress or assign value inside the method level and lanbda level
		Consumer<Integer> c1 = (i) -> {
			//c1 have value 4 that c1 give the input as i and in below
			//value + i means 6+4 so 10 is the out put
			System.out.println(value +i );
		};
		c1.accept(4);
	}
}
