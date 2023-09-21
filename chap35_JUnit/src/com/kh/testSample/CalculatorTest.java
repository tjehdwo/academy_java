package com.kh.testSample;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void testAddition() {
		Calculator cal = new Calculator();
		int result = cal.add(2, 5);
		assertEquals(7,result); //���󰪰� ���� ����� ��
	}
	
	@Test
	public void testSubtraction() {
		Calculator cal = new Calculator();
		int result = cal.subtract(10, 3);
		assertEquals(7,result);
	}
}
