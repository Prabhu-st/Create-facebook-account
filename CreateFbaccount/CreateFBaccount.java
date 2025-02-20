package JAVAPAKAGE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateFBaccount {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("prabhudev2915@gmail.com");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abimadev");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("prabhudev");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Chilboydev");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//select[@title='Day']")).sendKeys("15");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//select[@title='Month']")).sendKeys("March");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//select[@title='Year']")).sendKeys("2003");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("selinium29@gmail.com");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("justtakeitchillbro");
		Thread.sleep(3000);
	
		WebElement radio = driver.findElement (By.xpath("//label[@class='_58mt']")) ;
		
		radio.click();
		
		driver.findElement(By.xpath("//button[@name='websubmit']"));
		
		Thread.sleep(3000);
		
		if(radio.isSelected()) {
			
			System.out.println("toggle is on");
			
		}
		
		else {
			
			System.out.println("toggle is off ");
			
		}
		
		
	
		
	}

}
