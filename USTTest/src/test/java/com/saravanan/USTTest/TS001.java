package com.saravanan.USTTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class TS001 {

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARAVANAN R\\Desktop\\ArisGlobalB2\\chromedriver.exe");
		WebDriver myD=new ChromeDriver();
		myD.get("https://blazedemo.com/");
		Thread.sleep(4000);
		Select select1 =new Select(myD.findElement(By.xpath("//select[@name='fromPort']")));
		select1.selectByValue("Boston");
		Thread.sleep(2000);
		Select select2 =new Select(myD.findElement(By.xpath("//select[@name='toPort']")));
		select2.selectByValue("New York");
		Thread.sleep(2000);
		myD.findElement(By.xpath("//input[@value='Find Flights']")).click();
		Thread.sleep(2000);
		myD.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[2]/td[1]/input")).click();
		Thread.sleep(2000);
		myD.findElement(By.id("inputName")).sendKeys("sam");
		myD.findElement(By.id("creditCardNumber")).sendKeys("123456");
		myD.findElement(By.id("nameOnCard")).sendKeys("sam");
		myD.findElement(By.className("checkbox")).click();
		Thread.sleep(4000);
		myD.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
		String vText1=myD.findElement(By.xpath("/html/body/div[2]/div/h1")).getText();
		System.out.println(vText1);
		myD.close();

	}

}
