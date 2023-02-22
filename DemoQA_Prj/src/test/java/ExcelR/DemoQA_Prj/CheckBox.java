package ExcelR.DemoQA_Prj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/");
		WebElement elements = driver.findElement(By.xpath("//div[@class=\"card mt-4 top-card\"][1]"));
		elements.click();

		WebElement checkBox = driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-1']"));
		checkBox.click();
		
		WebElement toggle = driver.findElement(By.xpath("//button[@title='Toggle']"));
		toggle.click();
		
		WebElement checkHome = driver.findElement(By.xpath("//label[@for='tree-node-home']//span[@class='rct-checkbox']//*[name()='svg']"));
		checkHome.click();
		
//		WebElement getText = driver.findElement(By.xpath("//div[@id='result']"));
//		getText.getText();
//		System.out.println(getText);
		
		
		
	}
 
}
