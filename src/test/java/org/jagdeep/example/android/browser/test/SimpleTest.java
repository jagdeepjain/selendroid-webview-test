/**
 * @author jagdeepjain
 *
 */
package org.jagdeep.example.android.browser.test;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.selendroid.SelendroidCapabilities;
import io.selendroid.SelendroidConfiguration;
import io.selendroid.SelendroidDriver;
import io.selendroid.SelendroidLauncher;

import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SimpleTest {

	WebDriver driver = new RemoteWebDriver(DesiredCapabilities.android());

	@Before
	public void setUp() throws Exception {
		System.out.println("Starting Test");
		System.out.println("Launching android browser.");
		driver.get("http://www.google.co.in");
		// let the page loads
		Thread.sleep(2000);

	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Test Complted.");
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		System.out.println("Verifying the page contains results we expected.");
		WebElement form = driver.findElement(By.name("q"));
		form.sendKeys("selendroid");
		form.submit();
		// let the page loads before we check the required text
		Thread.sleep(2000);
		assertTrue(driver.getPageSource().contains("selendroid"));
	}

}
