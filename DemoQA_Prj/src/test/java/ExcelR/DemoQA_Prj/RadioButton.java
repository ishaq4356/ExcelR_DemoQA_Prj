package ExcelR.DemoQA_Prj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/");
		WebElement elements = driver.findElement(By.xpath("//div[@class=\"card mt-4 top-card\"][1]"));
		elements.click();
		
		WebElement radioButton = driver.findElement(By.xpath("//span[contains(text(),'Radio Button')]"));
		radioButton.click();
		
		WebElement radio1 = driver.findElement(By.xpath("//label[text() = 'Yes']"));
		radio1.click();
		WebElement msg = driver.findElement(By.xpath("//label[text() = 'Yes']"));
		msg.getText().equals(msg);
	
//			System.out.println("printing text " +radio1.getText().equals("You have selected Yes "));
			
		WebElement radio2 = driver.findElement(By.xpath("//label[text() = 'Impressive']"));
		radio2.click();
		
	}

}
