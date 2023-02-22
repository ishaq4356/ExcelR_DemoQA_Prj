package ExcelR.DemoQA_Windows;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/");
		
		driver.findElement(By.xpath("//div[@class=\"card mt-4 top-card\"][3]")).click();
		
		driver.findElement(By.xpath("//span[text()='Browser Windows']")).click();
		
		
		
		
		WebElement newWindow = driver.findElement(By.xpath("//button[@id='windowButton']"));
		newWindow.click();
		
		Thread.sleep(2000);
		
		WebElement newWindowmsg = driver.findElement(By.xpath("//button[@id='messageWindowButton']"));
		newWindowmsg.click();
		
		
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		WebElement tab = driver.findElement(By.id("tabButton"));
		tab.click();
		Set<String> s = driver.getWindowHandles();

		Iterator<String> I1 = s.iterator();

		while (I1.hasNext()) {
			String childWindow = I1.next();

			if (parent.equals(childWindow)) {
				driver.switchTo().window(childWindow);
				Thread.sleep(2000);
				String getText = driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();
				
				System.out.println(getText);
				driver.close();
			}
		}
	
		driver.switchTo().window(parent);
		
	}
	

}
