package sample;

//import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertComparisonSample {
	@Test
	public void softAssertStrictComparision() {
		String actualData="Raja";
		String expectedData="raja";
		SoftAssert sa= new SoftAssert();
		sa.assertEquals(actualData, expectedData);
		System.out.println("soft Assert Strict level comparison passed!!");
		sa.assertAll();
		}
	@Test
	public void softAssertContainsLevelComparision() { 
		String actualData="maharaja";
		String expectedData="raja";
		SoftAssert sa=new SoftAssert();
		sa.assertTrue(actualData.contains(expectedData));
		System.out.println("soft Assert contains level comparison passed!!");
		sa.assertAll();
		}


}
