package entities;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class RecyclerTest {

	@DisplayName("Recycler password Testing")
	@Test
	void recyclerProposingMaterialSubmission() {
		
		//Arrange
		Recycler recycler = Recycler.recyclerFactory("12345", "Mehmood");
		//Act
		char[] actualPassword = recycler.getUserNameAndPassword().getPassword();
		char[] expectedPassword = "12345".toCharArray();
		
		//Assert
		assertArrayEquals(expectedPassword, actualPassword);
	}

	@Test
	@DisplayName("Recycler user name Testing")
	void recyclerUserNameTest() {

		//Arrange
		Recycler recycler = Recycler.recyclerFactory("12345", "Mehmood");
		//Act
		String actualUserName = recycler.getUserNameAndPassword().getUserName();
		String expectedUserName = "Mehmood";
		//Assert
		assertEquals(expectedUserName,actualUserName);

	}

}
