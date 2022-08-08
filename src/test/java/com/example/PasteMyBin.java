package com.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PasteMyBin {
    @Test

    public void checkLocator() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://pastebin.com/");
        driver.findElement(By.xpath("//*[@id='postform-text']")).sendKeys("Hello from WebDriver");
        JavascriptExecutor javascriptExecutor =(JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollBy(0,350)","");
        driver.findElement(By.xpath("//*[@id='select2-postform-expiration-container']")).click();
        driver.findElement(By.xpath("/html/body/span[2]/span/span[2]/ul/li[3]")).click();
        javascriptExecutor.executeScript("window.scrollBy(0,350)","");
        driver.findElement(By.id("postform-name")).sendKeys("helloweb");
        driver.findElement(By.xpath("//*[@id='w0']/div[5]/div[1]/div[8]/button")).click();
    }
}