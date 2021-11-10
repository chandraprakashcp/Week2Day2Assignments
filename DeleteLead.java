package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

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
		driver.findElement(By.xpath("(//a[@class='x-tab-right'])[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("phoneAreaCode")).sendKeys("12");
		driver.findElement(By.name("phoneNumber")).sendKeys("1234");
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[7]")).click();
		Thread.sleep(5000);
		WebElement element1 = driver.findElement(By.xpath("(//a[@class='linktext'])[4]"));
		String text1 = element1.getText();
		System.out.println(text1);
		
		element1.click();
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Delete")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//label[text()='Lead ID:']/following::input")).sendKeys(text1);
		driver.findElement(By.xpath("//button[@id='ext-gen334']")).click();
		WebElement elementVerify = driver.findElement(By.id("ext-gen437"));
		String textverify = elementVerify.getText();
		
		System.out.println(textverify);
		if (textverify=="No records to display") {
			System.out.println("Test Passed:Successfully deleted");
		}else {
			System.out.println("Test Passed:Message NOT deleted");
		}
		driver.close();
		
		
		
		/*http://leaftaps.com/opentaps/control/main  
		 
		(//a[@class='linktext'])[4]
		
		
		11	Capture lead ID of First Resulting lead
		12	Click First Resulting lead
		13	Click Delete
		14	Click Find leads
		15	Enter captured lead ID
		16	Click find leads button
		17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		18	Close the browser (Do not log out)
*/
	}

}
