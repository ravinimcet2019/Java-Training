package com.josh.training.java.oops.question3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CylinderTest {

	private Cylinder cylinder;

	@Before
	public void initialize() throws Exception {
		cylinder =new Cylinder();
	}
	
	@Test
	public void shouldReturnVolumeOfCylinder() {
		cylinder.setRadius(5.0);
		cylinder.setHeight(7.0);
		double expected = Math.PI * Math.pow(cylinder.getRadius(), 2) * cylinder.getHeight();
		double actual = cylinder.getVolume() ;
		assertTrue(expected-actual == 0);
	}
	@After
	public void tearDown() throws Exception {
	}

	

}
