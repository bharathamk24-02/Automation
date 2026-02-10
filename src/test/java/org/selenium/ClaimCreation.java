package org.selenium;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClaimCreation {

    static void main() {

        try {

            String userNameAndPassword = "exp_test";
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://10.192.209.132:8080/cc/ClaimCenter.do");
            Thread.sleep(1000);
            WebElement userName = driver.findElement(By.xpath("//input[@id=\"Login:LoginScreen:LoginDV:username-inputEl\"]"));
            userName.sendKeys(userNameAndPassword);
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@id=\"Login:LoginScreen:LoginDV:password-inputEl\"]")).sendKeys(userNameAndPassword);
            Thread.sleep(2000);
            driver.findElement(By.xpath("//span[@id=\"Login:LoginScreen:LoginDV:submit-btnInnerEl\"]")).click();
            Thread.sleep(1000);

            Actions actions = new Actions(driver);
            WebElement dropdown = driver.findElement(
                    By.xpath("//span[contains(@id,'TabBar:ClaimTab-btnWrap')]")
            );
            actions.moveToElement(dropdown,30,0).click().perform();
            Thread.sleep(2000);

            driver.findElement(By.id("TabBar:ClaimTab:ClaimTab_FNOLWizard-textEl")).click();
            Thread.sleep(1000);

            driver.findElement(By.id("FNOLWizard:FNOLWizard_FindPolicyScreen:ScreenMode_false-boxLabelEl")).click();
            Thread.sleep(1000);

            WebElement policyNum =driver.findElement(By.id("id=\"FNOLWizard:FNOLWizard_FindPolicyScreen:FNOLWizardFindPolicyPanelSet:PolicyNumber-inputEl\""));
            String ranPolicyNum = RandomStringUtils.randomNumeric(7);
            policyNum.sendKeys(ranPolicyNum);

            Thread.sleep(1000);
            driver.findElement(By.id("id=\"FNOLWizard:FNOLWizard_FindPolicyScreen:FNOLWizardFindPolicyPanelSet:Type-inputEl\"")).click();

            Thread.sleep(1000);
            driver.findElement(By.xpath("//div[@class='x-boundlist x-boundlist-floating x-layer x-boundlist-default x-border-box x-boundlist-above']//li[text()='Personal Auto']")).click();



        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }}
