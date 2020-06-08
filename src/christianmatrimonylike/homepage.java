package christianmatrimonylike;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class homepage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Kavitha Devasagayam\\Desktop\\webdriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.christianmatrimony.com");
		driver.findElement(By.id("loginbtn")).click();
		driver.findElement(By.id("a12")).sendKeys("mailtomarykavi@gmail.com");
		Thread.sleep(2000);
		//driver.findElement(By.cssSelector("input[onclick='if (this.value == 'Password') { this.value = ''; })).click();
		//WebElement password = new wait(driver,10).until(ExpectedConditions.elementToBeClickable(By.name("password")));
		WebElement password=driver.findElement(By.id("password1"));
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].value='Devan2020';", password);
		WebElement button=driver.findElement(By.xpath("//input[@class='medimum-btn login-btn font14 ']"));
		executor.executeScript("arguments[0].click();", button);
		//driver.findElement(By.cssSelector("input[class='medimum-btn login-btn font14']")).click();

	}

}
