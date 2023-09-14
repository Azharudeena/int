package org.alart;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alartpopup {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.firefox.driver", "C:\\Users\\User\\Selenium\\ParentChild\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		// load Url

		driver.get("https://demo.automationtesting.in/Alerts.html");

		driver.manage().window().maximize();


		//funtio 1
		driver.findElement(By.xpath("//a[text()='Alert with OK ']")).click();
		driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();



		////alart function

		Alert alert = driver.switchTo().alert();
		//alert.accept();
		//Thread.sleep(2000);
		alert.dismiss();


		//function 2

		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']")).click();

		Alert a = driver.switchTo().alert();

		Thread.sleep(3000);

		a.accept();


		//function3
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']")).click();

		Alert a1 = driver.switchTo().alert();

		a1.sendKeys("my self azhar");
		Thread.sleep(3000);
		a1.accept();



	}

}
