package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
				
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("DemoSalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Chandra Prakash");
		driver.findElement(By.id("lastNameField")).sendKeys("Chandrasekar");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Chandra");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Sekar");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("EIE");
		driver.findElement(By.id("createContactForm_description")).sendKeys("This is for Automation testing");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("prakash123@gmail.com");
		WebElement drop1 = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		
		Select dropdown1= new Select(drop1);
		dropdown1.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//div[@class='frameSectionExtra']/a)[1]")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("updated the note field");
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
		
	}

}
