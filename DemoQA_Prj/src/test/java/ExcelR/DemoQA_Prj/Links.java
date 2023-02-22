package ExcelR.DemoQA_Prj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/");
		
		WebElement elements = driver.findElement(By.xpath("//div[@class=\"card mt-4 top-card\"][1]"));
		elements.click();
		
		WebElement links = driver.findElement(By.xpath("//span[text()='Links']"));
		links.click();
		
		 WebElement homeLink = driver.findElement(By.linkText("Home"));
	        homeLink.click();

	        // Verify that we are on the home page by checking the page title
	        String expectedTitle = "ToolsQA";
	        String actualTitle = driver.getTitle();
	        assert actualTitle.equals(expectedTitle);

	        // Navigate back to the links page
	        driver.navigate().back();

	        // Find the "Created" link and click it
	        WebElement createdLink = driver.findElement(By.partialLinkText("Created"));
	        createdLink.click();

	        // Verify that we are on the created page by checking the page title
	        expectedTitle = "2015 Created By";
	        actualTitle = driver.getTitle();
	        assert actualTitle.contains(expectedTitle);

		

	}

}
