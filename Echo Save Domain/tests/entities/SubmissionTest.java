package entities;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import enumerations.StateOfSubmission;


/**
 *
 * @author soni
 */
public class SubmissionTest {
       
    
    @Test
    @DisplayName ("State Of Submission 'proposed' is true")
    public void checkStateOfSubmission() {

    	//Arrange
		String materialName = "Laptop";
		String materialDescription= "new computer from intel";
		int pointsPerKg = 12;
		
		Material material = Material.materialFactory(materialDescription, materialName, pointsPerKg);
    	Submission instance = new Submission(StateOfSubmission.PROPOSED, material);
        StateOfSubmission expResult = StateOfSubmission.PROPOSED;
        
        //Act
        StateOfSubmission actualResult = instance.getStateOfSubmission();
        
        //Assert
        assertEquals(expResult, actualResult);
        
    } 

    @Test
    @DisplayName ("State Of Submission 'Submitted' is true")
    public void GetStateOfSubmission() {

    	//Arrange
    	Material material = Material.materialFactory("new computer from intel", "Laptop", 0);
    	Submission submission = new Submission(StateOfSubmission.PROPOSED, material);
        StateOfSubmission expResult = StateOfSubmission.PROPOSED;
        
        
        //Act
        StateOfSubmission actualResult = submission.getStateOfSubmission();
        
        //Assert
        assertEquals(expResult, actualResult);
        
    }
    
	@Test
    @DisplayName ("Weight in Kg is ")
    public void weightInkg() {

    	//Arrange

    	Material material = Material.materialFactory("new computer from intel", "Laptop", 0);
    	Submission submission = new Submission(StateOfSubmission.PROPOSED, material);
    	submission.setWeightInKg(10);   	
    	 	  	
    	//Act
    	
    	int actualResult = submission.getWeightInKg();
                
        //Assert
        assertEquals(10, actualResult);
        
    }
    
}
