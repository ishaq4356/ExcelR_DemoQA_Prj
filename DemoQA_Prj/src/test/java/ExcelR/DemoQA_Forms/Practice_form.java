package ExcelR.DemoQA_Forms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice_form {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/");
		
		WebElement forms = driver.findElement(By.xpath("//div[@class=\"card mt-4 top-card\"][2]"));
		forms.click();
		
		WebElement practiceform = driver.findElement(By.xpath("//span[text()='Practice Form']"));
		practiceform.click();
		
		
		 WebElement firstNameInput = driver.findElement(By.id("firstName"));
	        firstNameInput.sendKeys("ishaq");

	        WebElement lastNameInput = driver.findElement(By.id("lastName"));
	        lastNameInput.sendKeys("ish");

	        WebElement emailInput = driver.findElement(By.id("userEmail"));
	        emailInput.sendKeys("ishaish@gmail.com");

	        WebElement genderRadioButton = driver.findElement(By.xpath("//label[text()='Male']"));
	        genderRadioButton.click();

	        WebElement mobileNumberInput = driver.findElement(By.xpath("//input[@id='userNumber']"));
	        mobileNumberInput.sendKeys("1234567890");

	        WebElement dobInput = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
	        dobInput.click();

	        WebElement yearDropdown = driver.findElement(By.xpath("//select[@class=\"react-datepicker__year-select\"]"));
	        Select yearSelect = new Select(yearDropdown);
	        yearSelect.selectByVisibleText("2000");

	        WebElement monthDropdown = driver.findElement(By.xpath("//select[@class=\"react-datepicker__month-select\"]"));
	        Select monthSelect = new Select(monthDropdown);
	        monthSelect.selectByVisibleText("June");

	        WebElement dayLink = driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--001']"));
	        dayLink.click();

	        WebElement subjectsInput = driver.findElement(By.id("subjectsInput"));
	        subjectsInput.sendKeys("Maths");
	        subjectsInput.submit();

	        WebElement hobbiesCheckbox = driver.findElement(By.xpath("//label[contains(text(),'Sports')]"));
	        hobbiesCheckbox.click();

	        WebElement uploadInput = driver.findElement(By.xpath("//input[@id='uploadPicture']"));
	        uploadInput.sendKeys("I:\\Job Details\\5TH SEM.jpg");

	        WebElement addressInput = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
	        addressInput.sendKeys("Bangalore");

	        WebElement stateDropdown = driver.findElement(By.id("state"));
	        Select stateSelect = new Select(stateDropdown);
	        stateSelect.selectByVisibleText("NCR");

	        WebElement cityDropdown = driver.findElement(By.id("city"));
	        Select citySelect = new Select(cityDropdown);
	        citySelect.selectByVisibleText("Delhi");

	        // Submit the form
	        WebElement submitButton = driver.findElement(By.id("submit"));
	        submitButton.click();

	        // Verify that the form was submitted successfully by checking the page title
	        String expectedTitle = "Practice Automation Form";
	        String actualTitle = driver.getTitle();
	        assert actualTitle.equals(expectedTitle);

	}

}

