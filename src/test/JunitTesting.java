package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JunitTesting {
	
	@Test
	
	public void test() {
	UnitTesting obj = new UnitTesting();
	int result = obj.add(4);
	assertEquals(8, result);
	}

}
