package widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://demoqa.com/");
		
		WebElement widgets = driver.findElement(By.xpath("//div[@class=\"card mt-4 top-card\"][4]"));
		widgets.click();
		
		WebElement DatePicker = driver.findElement(By.xpath("//span[contains(text(),'Date Picker')]"));
		DatePicker.click();

		 WebElement datePicker = driver.findElement(By.id("datePickerMonthYearInput"));
	        datePicker.click();

	        // select a new month and year
	        WebElement monthYear = driver.findElement(By.className("react-datepicker__current-month-year"));
	        Actions actions = new Actions(driver);
	        actions.moveToElement(monthYear).click().perform();
	        WebElement month = driver.findElement(By.className("react-datepicker__month-select"));
	        month.click();
	        WebElement march = driver.findElement(By.xpath("//option[contains(text(),'March')]"));
	        march.click();
	        WebElement year = driver.findElement(By.className("react-datepicker__year-select"));
	        year.click();
	        WebElement selectYear = driver.findElement(By.xpath("//option[contains(text(),'2022')]"));
	        selectYear.click();

	        // select a new date
	        WebElement date = driver.findElement(By.xpath("//div[@aria-label='Choose Thursday, March 17th, 2022']"));
	        date.click();

	        // print the selected date
	        System.out.println("Selected Date: " + datePicker.getAttribute("value"));

	}

}
