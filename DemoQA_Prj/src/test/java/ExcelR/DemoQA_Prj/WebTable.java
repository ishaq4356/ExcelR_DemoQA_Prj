package ExcelR.DemoQA_Prj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/");
		WebElement elements = driver.findElement(By.xpath("//div[@class=\"card mt-4 top-card\"][1]"));
		elements.click();
		WebElement webTable = driver.findElement(By.xpath("//span[text()='Web Tables']"));
		webTable.click();
		
		WebElement addUser = driver.findElement(By.xpath("//button[@id='addNewRecordButton']"));
		addUser.click();
		
		WebElement firstNameField = driver.findElement(By.id("firstName"));
        firstNameField.sendKeys("ishaq");

        // Find the "Last Name" input field and enter a last name
        WebElement lastNameField = driver.findElement(By.id("lastName"));
        lastNameField.sendKeys("ish");

        // Find the "Email" input field and enter an email address
        WebElement emailField = driver.findElement(By.id("userEmail"));
        emailField.sendKeys("ishaqish@gmail.com");

        // Find the "Age" input field and enter an age
        WebElement ageField = driver.findElement(By.id("age"));
        ageField.sendKeys("22");

        // Find the "Salary" input field and enter a salary
        WebElement salaryField = driver.findElement(By.id("salary"));
        salaryField.sendKeys("50000");

        // Find the "Department" input field and enter a department
        WebElement departmentField = driver.findElement(By.id("department"));
        departmentField.sendKeys("Engineering");

        // Find the "Submit" button and click it
        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();

		WebElement search = driver.findElement(By.xpath("//input[@id='searchBox']"));
		search.sendKeys("ishaqish");
		search.click();
		
		WebElement edit = driver.findElement(By.xpath("//span[@id='edit-record-4']"));
		edit.click();
		
		WebElement editSubmit = driver.findElement(By.id("submit"));
		editSubmit.click();
		
		WebElement deleteRecord = driver.findElement(By.xpath("//span[@id='delete-record-4']"));
		deleteRecord.click();
		
	}

}
