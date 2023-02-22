package ExcelR.DemoQA_Windows;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/");
		
		driver.findElement(By.xpath("//div[@class=\"card mt-4 top-card\"][3]")).click();
		
		
		driver.findElement(By.xpath("//span[text()='Alerts']")).click();
		
		
		WebElement simpleAlert = driver.findElement(By.xpath("//button[@id='alertButton']"));
		simpleAlert.click();

		Alert alert1 = driver.switchTo().alert();
		alert1.accept();

		WebElement confirm = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		confirm.click();
		
		Thread.sleep(5000);
		
		Alert confirmAlt = driver.switchTo().alert();
		//confirmAlt.dismiss();
		confirmAlt.accept();
		
		WebElement click = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		click.click();
		
		Alert ok = driver.switchTo().alert();
		ok.accept();
		
		WebElement prompt = driver.findElement(By.id("promtButton"));
		prompt.click();
		Alert promptAlt = driver.switchTo().alert();
		Thread.sleep(2000);

		promptAlt.sendKeys("ishaq");
		
		promptAlt.accept();
	}

}
