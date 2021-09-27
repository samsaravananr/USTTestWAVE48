package com.saravanan.USTTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmazonTest 
{
	
	@Test
	public void TS001() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARAVANAN R\\Desktop\\ArisGlobalB2\\chromedriver.exe");
		WebDriver myD=new ChromeDriver();
		myD.get("https://www.amazon.in/");
		Thread.sleep(4000);
		System.out.println(myD.getTitle());
		myD.close();
		
	}

}
