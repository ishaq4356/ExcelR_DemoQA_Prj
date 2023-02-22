package ExcelR.DemoQA_Prj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadDownload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/");
		
		WebElement elements = driver.findElement(By.xpath("//div[@class=\"card mt-4 top-card\"][1]"));
		elements.click();
		
		WebElement uploadAndDownload = driver.findElement(By.xpath("//span[contains(text()='Upload and Download')]"));
		uploadAndDownload.click();
		
		 WebElement downloadButton = driver.findElement(By.id("downloadButton"));
	        downloadButton.click();

	        // Wait for the file to download
	        try {
	            Thread.sleep(5000); // wait for 5 seconds
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        // Find the "Upload" button and click it
	        WebElement uploadButton = driver.findElement(By.id("uploadFile"));
	        uploadButton.sendKeys("I:\\Job Details\\5TH SEM.jpg");

	        // Verify that the file has been uploaded by checking the uploaded file name
	        WebElement uploadedFileName = driver.findElement(By.id("uploadedFilePath"));
	        String expectedFileName = "file-to-upload.txt";
	        String actualFileName = uploadedFileName.getText();
	        assert actualFileName.contains(expectedFileName);

	        // Close the browser
	        driver.quit();
		
	}

}
