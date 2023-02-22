package ExcelR.DemoQA_Windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/");

		driver.findElement(By.xpath("//div[@class=\"card mt-4 top-card\"][3]")).click();

		driver.findElement(By.xpath("//span[text()='Frames']")).click();

		driver.switchTo().frame("frame1");
		WebElement element1 = driver.findElement(By.xpath("//h1[contains(text(),'This is a sample page')]"));
		System.out.println(element1.getText());

		// switch back to the default content and switch to the second frame
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");

		// wait for the element to become visible
	
		WebElement element2 = driver.findElement(By.xpath("//h1[contains(text(),'This is a sample page')]"));
		System.out.println(element2.getText());

	}

}
