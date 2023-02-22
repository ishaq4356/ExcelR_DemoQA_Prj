package widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://demoqa.com/");
		
		WebElement widgets = driver.findElement(By.xpath("//div[@class=\"card mt-4 top-card\"][4]"));
		widgets.click();
		
//		WebElement frame = driver.findElement(By.xpath("//iframe[@id='frame1']"));
//		driver.switchTo().frame(frame);
		
		WebElement tab = driver.findElement(By.xpath("//span[text()='Tabs']"));
		tab.click();
	}

}
