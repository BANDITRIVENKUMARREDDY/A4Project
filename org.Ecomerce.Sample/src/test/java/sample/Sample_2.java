package sample;

import org.testng.annotations.Test;

public class Sample_2 {
		@Test(priority = 0, invocationCount = 5)
		public void createUser() {
			System.out.println("UserCreated");
			
		}
		//@Test(priority = 1)
		@Test(enabled = false)
		public void modifyUser() {
			System.out.println("modifiedUser");
			
		}
		
		@Test(priority = 2)
		public void deleteUser() {
			System.out.println("DeleteUser");
			
		}

	
}
