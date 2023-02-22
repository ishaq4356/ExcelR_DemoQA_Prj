package widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class toolTip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/tool-tips");

		WebElement toolTipBtn = driver.findElement(By.id("toolTipButton"));

		String toolTipTxt = toolTipBtn.getAttribute("title");

		System.out.println(toolTipTxt);
		if (toolTipTxt.equals(toolTipTxt)) {
			System.out.println("You hovered over the button");
	}

}
}
