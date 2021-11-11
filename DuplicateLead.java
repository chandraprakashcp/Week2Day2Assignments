package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(5000);
		//8	Click on Email
		driver.findElement(By.xpath("(//a[@class='x-tab-right'])[3]")).click();
		Thread.sleep(5000);
		
		//9	Enter Email
		
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("prakash111@gmail.com");
		//10	Click find leads button
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(5000);
		//11	Capture name of First Resulting lead
		
		WebElement findElement = driver.findElement(By.xpath("(//a[@class='linktext'])[4]"));
		String text = findElement.getText();
		System.out.println(text);
		
		//12	Click First Resulting lead
		findElement.click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		
		//13	Click Duplicate Lead
		driver.findElement(By.linkText("Duplicate Lead")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='smallSubmit' and @name='submitButton']")).click();
		/*http://leaftaps.com/opentaps/control/main
		 
		1	Launch the browser
		2	Enter the username
		3	Enter the password
		4	Click Login
		5	Click crm/sfa link
		6	Click Leads link
		7	Click Find leads
		8	Click on Email
		9	Enter Email
		10	Click find leads button
		11	Capture name of First Resulting lead
		12	Click First Resulting lead
		13	Click Duplicate Lead
		14	Verify the title as 'Duplicate Lead'
		15	Click Create Lead
		16	Confirm the duplicated lead name is same as captured name
		17	Close the browser (Do not log out)
		
		*/
	}
}
