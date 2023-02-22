package ExcelR.DemoQA_Prj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Elements_Page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/");
		WebElement elements = driver.findElement(By.xpath("//div[@class=\"card mt-4 top-card\"][1]"));
		elements.click();
//		WebElement test = driver.findElement(By.id("Ad.Plus-728x90"));
//		test.getText();
//		System.out.println("the text is " +test);
		
		WebElement textBox = driver.findElement(By.id("item-0"));
		textBox.click();
	
		WebElement userName = driver.findElement(By.xpath("//input[@id='userName']"));
		userName.sendKeys("ishaq");
		WebElement userMail = driver.findElement(By.xpath("//input[@id='userEmail']"));
		userMail.sendKeys("ishaq@gmail.com");
		WebElement userAdd = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		userAdd.sendKeys("bangalore");
		WebElement userAdd2 = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
		userAdd2.sendKeys("bangalore");
		
		WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
		submit.click();
		
		
	}

}
