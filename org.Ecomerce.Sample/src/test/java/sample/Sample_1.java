package sample;

import org.testng.annotations.Test;

public class Sample_1 {
	@Test(priority = 0)
	public void createUser() {
		System.out.println("UserCreated");
		
	}
	@Test(priority = 1,dependsOnMethods = {"createUser"})
	public void modifyUser() {
		System.out.println("modifiedUser");
		
	}@Test(priority = 2)
	public void deleteUser() {
		System.out.println("DeleteUser");
		
	}

}
