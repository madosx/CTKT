package main;

import static org.junit.Assert.*;

import org.junit.Test;

public class Person_tests {

	@Test
	public void test() {
		Person p = new Person();
		assertTrue(p.getAge()==1);
	}

}
