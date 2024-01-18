package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass1 {
public static WebDriver driver;
	
	public static void wait(int sec) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
		driver.manage().window().maximize();
	}
	public static void chromelaunch() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	public static void url(String url) {
		driver.get(url);
	}
	public static void click(WebElement e) {
		e.click();
	}
	public static void sendkeys(WebElement e,String s) {
		e.sendKeys(s);
	}
	public static String getTitle() {
		String tit=driver.getTitle();
		return tit;
	}
	public static String getAttribute(WebElement e) {
		String s=e.getAttribute("value");
		return s;
	}
	public static void quit() {
		driver.quit();
	}
	public static void close() {
		driver.close();
	}
	public static String currentUrl() {
		String s=driver.getCurrentUrl();
		return s;
	}
	public static void staticWait(int sec) {
		try {
			Thread.sleep(1000*sec);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static String getText(WebElement e) {
		String s=e.getText();
		return s;
	}
	public static void DeSelBYValue(WebElement e, String v) {
		Select s=new Select(e);
		s.deselectByValue(v);
	}
	public static void DeSelByIndex(WebElement e, int v) {
		Select s=new Select(e);
		s.selectByIndex(v);
	}
	public static void DeSelByVisible(WebElement e, String g) {
		Select s=new Select(e);
		s.deselectByVisibleText(g);
	}
	public static void DeSelAll(WebElement e) {
		Select s=new Select(e);
		s.deselectAll();
	}
	public static boolean IsMultipleSel(WebElement e) {
		Select s=new Select(e);
		boolean b=s.isMultiple();
		return b;
	}
	public static void FrameByIndex(int v) {
		driver.switchTo().frame(v);
	}
	public static void FrameById(String v) {
		driver.switchTo().frame(v);
	}
	public static void FrameByName(String v) {
		driver.switchTo().frame(v);
	}
	public static void DefaultContent() {
		driver.switchTo().defaultContent();
	}
	public static void ParentFrame() {
		driver.switchTo().parentFrame();
	}
	
	public static void SelByValue(WebElement e, String v) {
		Select s=new Select(e);
		s.selectByValue(v);
	}
	public static void SelByIndex(WebElement e, int v) {
		Select s=new Select(e);
		s.selectByIndex(v);
	}
	public static void SelByVisible(WebElement e, String g) {
		Select s=new Select(e);
		s.selectByVisibleText(g);
	}
	public static void navigate(String url) {
		driver.navigate().to(url);
	}
	public static void back() {
		driver.navigate().back();
	}
	public static void forward() {
		driver.navigate().forward();
	}
	public static void refresh() {
		driver.navigate().refresh();
	}
	public static boolean isDisplayed(WebElement e) {
		boolean t= e.isDisplayed();
		return t;
	}
	public static boolean isEnabled(WebElement e) {
		boolean d = e.isEnabled();
		return d;
	}
	public static boolean isSelected(WebElement e) {
		boolean d=e.isSelected();
		return d;
	}
	public static void screenshot(String loc) {
		TakesScreenshot ts=(TakesScreenshot)driver;
		java.io.File from =  ts.getScreenshotAs(OutputType.FILE);
		File to= new File(loc);
		try {
			FileUtils.copyFile(from,to);
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}
	public static void contextClick(WebElement e) {
		   Actions a=new Actions(driver); 
		     a.contextClick(e).perform();
	}
	public static void moveToElement(WebElement e) {
		Actions a=new Actions(driver);
		a.moveToElement(e).perform();
	}
	public static void actionClick(WebElement e) {
		Actions a=new Actions(driver);
		a.click().perform();
	}
	public static void doubleClick(WebElement e) {
		Actions a =new Actions(driver);
		a.doubleClick().perform();
	}
	public static void dragAndDrop(WebElement from,WebElement to) {
		Actions a =new Actions(driver);
		a.dragAndDrop(from, to).perform();
	}
	public static void release() {
		Actions a =new Actions(driver);
		a.release().perform();
	}
    public static void robot(int t) throws AWTException {
    	Robot r =new Robot();
    	r.keyPress(t);
    	r.keyRelease(t);
    }
    public static void simpleAlert() {
    	Alert a=driver.switchTo().alert();
    	a.accept();
    }
    public static void confirmAlert() {
    	Alert a=driver.switchTo().alert();
    	a.dismiss();
    }
    public static void promptAlert(String txt) {
    	Alert a= driver.switchTo().alert();
    	a.sendKeys(txt);
    	a.accept();
    }
    public static void jsSetAttribute(String v, WebElement e) {
    	JavascriptExecutor js=(JavascriptExecutor)driver;
    	js.executeScript("arguments[0].setAttribute('value','"+v+"')",e);
    	
    }
    public static String jsGetAttribute(WebElement e) {
    	JavascriptExecutor js=(JavascriptExecutor)driver;
    	Object obj= js.executeScript("return arguments[0].getAttribute('value')", e);
    	String s=obj.toString();
    	return s;
    	
    }
    public static void JavascriptClick(WebElement e) {
    	JavascriptExecutor js=(JavascriptExecutor)driver;
    	js.executeScript("arguments[0].click()",e);
    }
    public static void ScrollUpAndDown(WebElement e) {
    	JavascriptExecutor js=(JavascriptExecutor)driver;
    	js.executeScript("arguments[0].scrollIntoView()",e);
    	
    }
    
 public static String getWindowHandle() {
     String w=driver.getWindowHandle();
     return w;
}
 public static void switchToWindow(int index) {
	 Set<String>all=driver.getWindowHandles();
	 List<String>li=new ArrayList<>();
	 li.addAll(all);
	 driver.switchTo().window(li.get(index));
	 }

}
