package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//SalesForce:
		// Step 1: Download and set the path 
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		
		// Step 3: Load the URL 
	    //    https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk	
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
			
		// Step 4: Maximise the window
		driver.manage().window().maximize();
		// Step 5: Add implicit wait
		Thread.sleep(5000);
			// Step 6: Fill in all the text boxes
		driver.findElement(By.xpath("//div[@class='field  ']//input")).sendKeys("Chandra");
		driver.findElement(By.xpath("//div[@class='lastName textFieldInput section']//input")).sendKeys("Prakash");
		driver.findElement(By.xpath("//div[@class='emailInput textFieldInput section']//input")).sendKeys("prakash123@gmail.com");
		driver.findElement(By.xpath("//div[@class='company textFieldInput section']//input")).sendKeys("infy");
		driver.findElement(By.xpath("//div[@class='phoneInput textFieldInput section']//input")).sendKeys("1234567890");
		
		// Step 7: Handle all the dropdowns
		WebElement dropdown = driver.findElement(By.xpath("//div[@class='userTitle selectFieldInput section']//select"));
		Select dropdownbox= new Select(dropdown);
		dropdownbox.selectByVisibleText("Developer / Software Engineer / Analyst");
		
		WebElement dropdown2 = driver.findElement(By.xpath("//div[@class='companyEmployees selectFieldInput section']//select"));
		Select dropdownbox2= new Select(dropdown2);
		dropdownbox2.selectByVisibleText("1501+ employees");
		
		WebElement dropdown3 = driver.findElement(By.xpath("//div[@class='country_field selectFieldInput']//select"));
		Select dropdownbox3= new Select(dropdown3);
		dropdownbox3.selectByVisibleText("India");
		
			
		// Step 8: Click the check box
		driver.findElement(By.xpath("(//input[@class='sr-only']/following-sibling::div)[1]")).click();
		// Step 9: Close the browser
		driver.close();
		
	}

}
