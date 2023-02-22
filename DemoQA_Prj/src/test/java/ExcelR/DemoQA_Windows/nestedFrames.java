package ExcelR.DemoQA_Windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class nestedFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://demoqa.com/");

		driver.findElement(By.xpath("//div[@class=\"card mt-4 top-card\"][3]")).click();
		
		driver.findElement(By.xpath("//span[text()='Nested Frames']")).click();
		
		driver.switchTo().frame("frame1");
        WebElement element1 = driver.findElement(By.xpath("//body[contains(text(),'Parent frame')]"));
        System.out.println(element1.getText());

        // switch to the inner frame and print its content
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame2");
        WebElement element2 = driver.findElement(By.xpath("//body[contains(text(),'Child Iframe')]"));
        System.out.println(element2.getText());

        // switch back to the default content and switch to the outer frame again
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame1");

        // switch to the inner frame using its index and print its content
        driver.switchTo().frame(1);
        WebElement element3 = driver.findElement(By.xpath("//body[contains(text(),'Child Iframe')]"));
        System.out.println(element3.getText());
	}

}
