package Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 /* int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};  
	        System.out.println("Duplicate elements in given array: ");  
	        //Searches for duplicate element  
	        for(int i = 0; i < arr.length; i++) {  
	            for(int j = i + 1; j < arr.length; j++) {  
	                if(arr[i] == arr[j])  
	                    System.out.println(arr[j]);  */
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver() ;

		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		String userId="txtUsername";

		WebElement userName=driver.findElement(By.id(userId));

		userName.sendKeys("Admin");


		driver.findElement(By.id("txtPassword")).sendKeys("admin123");

		String logId="btnLogin";

		WebElement logInId=driver.findElement(By.id(logId));

		logInId.click();

		String adminName="//*[@id=\"menu_admin_viewAdminModule\"]/b";

	    WebElement adminId=driver.findElement(By.xpath(adminName));


	    adminId.click();

	     String employeeId="searchSystemUser_userName";		
		WebElement employeeName=driver.findElement(By.id(employeeId));

		employeeName.sendKeys("arivand");

		String userRoleId="searchSystemUser_userType";

		WebElement usreroleName=driver.findElement(By.id(userRoleId));


	//	Select drop=new Select(usreroleName);

		//drop.selectByValue("2");


	            }
	        }
	}

}
