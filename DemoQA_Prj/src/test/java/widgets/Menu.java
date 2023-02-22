package widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://demoqa.com/");
		
		WebElement widgets = driver.findElement(By.xpath("//div[@class=\"card mt-4 top-card\"][4]"));
		widgets.click();
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(frame);
		
		WebElement menu = driver.findElement(By.xpath("//span[text()='Select Menu']"));
		menu.click();
		
		WebElement selectElement = driver.findElement(By.id("oldSelectMenu"));
        Select select = new Select(selectElement);
        select.selectByVisibleText("Yellow");
        
        WebElement selectElement2 = driver.findElement(By.id("cars"));
        Select select2 = new Select(selectElement2);
        select2.selectByValue("audi");
		
		
	}

}
