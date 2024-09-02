package sample;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Sample_3 {
		@Test(priority = -1)
		public void createUser() {
			System.out.println("UserCreated");
			
		}
		@Test(invocationCount = 0)
		public void modifyUser() {
			System.out.println("modifiedUser");
			}
		@Ignore	
		public void deleteUser() {
		System.out.println("DeleteUser");
			
		}

	}


