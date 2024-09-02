package sample;

import org.testng.Assert;
import org.testng.annotations.Test;
public class HardAssertComparisonSample {
	@Test
	public void hardAssertStrictComparision() {
		String actualData="Raja";
		String expectedData="raja";
		Assert.assertEquals(actualData, expectedData);
		System.out.println("Hard Assert Strict level comparison passed!!");
		}
	@Test
	public void hardAssertContainsLevelComparision() {
		String actualData="maharaja";
		String expectedData="raja";
		Assert.assertTrue(actualData.contains(expectedData));
		System.out.println("Hard Assert contains level comparison passed!!");
		}

}
