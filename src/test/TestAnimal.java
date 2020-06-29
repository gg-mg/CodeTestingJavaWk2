package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Animal;

public class TestAnimal {
	/*Write Test 
	 * ARRANGE
	 * ACT
	 * ASSERT
	Make the test compile
	Watch the test fail
	Do just enough to make all tests pass
	Refactor and generalise*/


	@Test
	public void test_CheckIfAnimalIsOrganic() {
		//Arrange
		Animal barbar = new Animal();
		barbar.setOrganicNature(true);
		//Act
		boolean isOrganic = barbar.getOrganicNature();
		//Assert
		assertTrue(isOrganic);
	}
	@Test
	public void test_CheckIfAnimalIsInOrganic() {
		//Arrange
		Animal sparky = new Animal();
		sparky.setOrganicNature(false);
		//Act
		boolean isOrganic = sparky.getOrganicNature();
		
		//Assert
	    assertFalse(isOrganic);
	}

}
//fail("Not yet implemented");