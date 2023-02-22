package ExcelR.DemoQA_Prj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class buttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/");
		
		WebElement elements = driver.findElement(By.xpath("//div[@class=\"card mt-4 top-card\"][1]"));
		elements.click();
		
		WebElement buttons = driver.findElement(By.xpath("//span[text()='Buttons']"));
		buttons.click();
		
		WebElement clickMeButton = driver.findElement(By.xpath("//button[@id='LUfk3']"));
        clickMeButton.click();

        Actions actions = new Actions(driver);
        // Find the "Double Click Me" button and double-click it
        WebElement doubleClickMeButton = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
        
        actions.doubleClick(doubleClickMeButton).perform();

        // Find the "Right Click Me" button and right-click it
        WebElement rightClickMeButton = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
        actions.contextClick(rightClickMeButton).perform();
	}

}
