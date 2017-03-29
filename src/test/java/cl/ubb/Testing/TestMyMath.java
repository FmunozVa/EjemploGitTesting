package cl.ubb.Testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMyMath {
	@Test
public void AddMinusOneAndFourIsThree(){
		//Arrange
		MyMath myMath=new MyMath();
		int resultado;
		//act
		resultado= myMath.add(-1,4);
		//Assert
		assertEquals(resultado,3);
	}
}
