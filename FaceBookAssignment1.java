package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookAssignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		
	    
		// Step 3: Load the URL https://en-gb.facebook.com/
		driver.get("https://en-gb.facebook.com/");
		// Step 4: Maximise the window
		driver.manage().window().maximize();
		// Step 5: Add implicit wait
		Thread.sleep(5000);
		// Step 6: Click on Create New Account button
		WebElement ele1 = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		ele1.click();
		Thread.sleep(10000);
		// Step 7: Enter the first name
		
		
		driver.findElement(By.xpath("(//input[contains(@class,'inputtext _58mg')])[1]")).sendKeys("chandra");
		
		// Step 8: Enter the last name
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("last name");
		
		// Step 9: Enter the mobile number
		driver.findElement(By.xpath("(//input[contains(@class,'inputtext _58mg')])[3]")).sendKeys("1234567890");
		// Step 10: Enterthe password
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("password123");
		// Step 11: Handle all the three drop downs
		WebElement dropdown1 = driver.findElement(By.id("day"));
		Select selectdropdown1=new Select(dropdown1);
		selectdropdown1.selectByVisibleText("9");
		
		WebElement dropdown2 = driver.findElement(By.id("month"));
		Select selectdropdown2=new Select(dropdown2);
		selectdropdown2.selectByVisibleText("Oct");
		
		WebElement dropdown3 = driver.findElement(By.id("year"));
		Select selectdropdown3= new Select(dropdown3);
		selectdropdown3.selectByVisibleText("1984");
		// Step 12: Select the radio button "Female" 
		driver.findElement(By.xpath("//input[@name='sex']")).click();
		           //( A normal click will do for this step) 

		
	}

}
