package ExcelR.DemoQA_Prj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demoQA_Page {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/");
		driver.findElement(By.xpath("//img[@class=\"banner-image\"]")).click();
		driver.switchTo().window("https://demoqa.com/");

		
	}

}
