package com.kh.junit.practice;
import static org.junit.Assert.*;
import org.junit.Test;

public class ArrayPracticeTest {
	ArrayPractice ap = new ArrayPractice(10);
	@Test
	public void testPractice1() {
		int[] expected = {1,2,3,4,5,6,7,8,9,10};
		assertArrayEquals(expected,ap.getArray());
	}
	@Test
	public void testPractice2() {
		String[] expected = {"사과","귤","포도","복숭아","참외"};
		String[] actual = {"사과","오렌지","포도","복숭아","참외"};
		assertNotEquals(expected, ap.getArray());
	}
	@Test
	public void testPractice3() {
	
	}
}
