package Example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sai {

	/*static void demm() {
		int i=1
	}*/
	
	

public static void main(String[] args) throws InterruptedException {
		System.out.println("i");
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.tirupationlinestore.com/");
		
		driver.findElement(By.xpath("//*[@id=\"pgi8ceca5e71c734f4593630949fc1a9168_0\"]/div[2]/div")).click();
	
		Thread.sleep(4000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(0,250)");
		
		for(int i=1;i<=5;i++) {
			driver.findElement(By.xpath("//*[@class='_3g4hn _33aXP']//li[1]//*[@aria-label='Add one item']")).click();
			 Thread.sleep(4000);
		}
			
			driver.findElement(By.xpath("//*[@class='_3g4hn _33aXP']//li[1]//*[@data-hook='product-item-add-to-cart-button']")).click();
		    Thread.sleep(4000);
		driver.close();
}

}
