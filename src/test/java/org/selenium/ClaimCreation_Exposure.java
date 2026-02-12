package org.selenium;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClaimCreation_Exposure {


    public static void main(String[] args) throws InterruptedException {
        String userNameAndPassword = "exp_test";
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://10.192.209.132:8080/cc/ClaimCenter.do");
        Thread.sleep(1000);
        WebElement userName = driver.findElement(By.xpath("//input[@id=\"Login:LoginScreen:LoginDV:username-inputEl\"]"));
        userName.sendKeys(userNameAndPassword);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id=\"Login:LoginScreen:LoginDV:password-inputEl\"]")).sendKeys(userNameAndPassword);
        Thread.sleep(1000);
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


        WebElement radioBtn = driver.findElement(By.xpath("//input[@id=\"FNOLWizard:FNOLWizard_FindPolicyScreen:ScreenMode_false-inputEl\"]"));
        radioBtn.click();

        Thread.sleep(1000);
        WebElement policyNum =driver.findElement(By.xpath("//input[@id='FNOLWizard:FNOLWizard_FindPolicyScreen:FNOLWizardFindPolicyPanelSet:PolicyNumber-inputEl']"));
        String ranPolicyNum = RandomStringUtils.randomNumeric(8);
        policyNum.sendKeys(ranPolicyNum);

        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@id='FNOLWizard:FNOLWizard_FindPolicyScreen:FNOLWizardFindPolicyPanelSet:Type-trigger-picker']")).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@class='x-form-field x-form-text x-form-text-default  x-form-focus  x-field-form-focus  x-field-default-form-focus']//li[text()='Personal Auto']")).click();

        Thread.sleep(1000);
        WebElement LossDate = driver.findElement(By.xpath("//input[@id=\"FNOLWizard:FNOLWizard_FindPolicyScreen:FNOLWizardFindPolicyPanelSet:Claim_LossDate-inputEl\"]"));
        LossDate.sendKeys("02/10/2026");

        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class=\"x-form-trigger x-form-trigger-default x-form-time-trigger x-form-time-trigger-default  x-form-trigger-focus\"]//li[text()='12:00 AM']")).click();

        Thread.sleep(1000);
        WebElement effectiveDate = driver.findElement(By.xpath("//input[@id=\"FNOLWizard:FNOLWizard_FindPolicyScreen:FNOLWizardFindPolicyPanelSet:NewClaimPolicyGeneralPanelSet:NewClaimPolicyGeneralDV:EffectiveDate-inputEl\"]"));
        effectiveDate.sendKeys("02/11/2025");

        Thread.sleep(1000);
        WebElement expirationDate = driver.findElement(By.xpath("//input[@id=\"FNOLWizard:FNOLWizard_FindPolicyScreen:FNOLWizardFindPolicyPanelSet:NewClaimPolicyGeneralPanelSet:NewClaimPolicyGeneralDV:ExpirationDate-inputEl\"]"));
        expirationDate.sendKeys("02/12/2027");

        //driver.findElement(By.xpath("//input[@id=\"FNOLWizard:FNOLWizard_FindPolicyScreen:FNOLWizardFindPolicyPanelSet:NewClaimPolicyGeneralPanelSet:NewClaimPolicyGeneralDV:Insured_Name-inputEl\"]")).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@id=\"FNOLWizard:FNOLWizard_FindPolicyScreen:FNOLWizardFindPolicyPanelSet:NewClaimPolicyGeneralPanelSet:NewClaimPolicyGeneralDV:Insured_Name:Insured_NameMenuIcon\"]")).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("(//span[@id=\"FNOLWizard:FNOLWizard_FindPolicyScreen:FNOLWizardFindPolicyPanelSet:NewClaimPolicyGeneralPanelSet:NewClaimPolicyGeneralDV:Insured_Name:ClaimNewContactPickerMenuItemSet:NewContactPickerMenuItemSet_NewPerson-textEl\"])")).click();

        Thread.sleep(1000);
        WebElement firstName = driver.findElement(By.xpath("//input[@id=\"NewContactPopup:ContactDetailScreen:ContactBasicsDV:PersonNameInputSet:GlobalPersonNameInputSet:FirstName-inputEl\"]"));
        firstName.sendKeys("Bharath kumar");

        Thread.sleep(1000);
        WebElement lastName = driver.findElement(By.xpath("//input[@id=\"NewContactPopup:ContactDetailScreen:ContactBasicsDV:PersonNameInputSet:GlobalPersonNameInputSet:LastName-inputEl\"]"));
        lastName.sendKeys("M");

        Thread.sleep(1000);
        WebElement zipCode = driver.findElement(By.xpath("//input[@id=\"NewContactPopup:ContactDetailScreen:ContactBasicsDV:PrimaryAddressInputSet:CCAddressInputSet:globalAddressContainer:globalAddress:GlobalAddressInputSet:PostalCode-inputEl\"]"));
        zipCode.sendKeys("99501");

        Thread.sleep(1000);
        driver.findElement(By.id("NewContactPopup:ContactDetailScreen:ContactBasicsDV_tb:ContactDetailToolbarButtonSet:CustomUpdateButton-btnInnerEl")).click();

        Thread.sleep(1000);
        driver.findElement(By.id("FNOLWizard:Next-btnInnerEl")).click();

        Thread.sleep(1000);
        driver.findElement(By.id("//input[@id='FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:PanelRow:BasicInfoDetailViewPanelDV:ReportedBy_Name-inputEl']")).click();

        Thread.sleep(1000);
        driver.findElement(By.id("//div[@class=\"x-form-trigger x-form-trigger-default x-form-time-trigger x-form-time-trigger-default  x-form-trigger-focus\"]//li[text()='Bharath M']")).click();

        Thread.sleep(1000);
        driver.findElement(By.id("FNOLWizard:Next-btnInnerEl")).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_NewLossDetailsScreen:LossDetailsAddressDV:Claim_LossCause-inputEl']")).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class=\"x-form-trigger x-form-trigger-default x-form-arrow-trigger x-form-arrow-trigger-default x-form-trigger-focus\"]//li[text()='Collision while turning left']")).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id=\"FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_NewLossDetailsScreen:LossDetailsAddressDV:AddressDetailInputSetRef:CCAddressInputSet:globalAddressContainer:Address_Picker-inputEl\"]")).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@value='Test, Anchorage, AK 99501']")).click();

        //step 4 Nxt Btn
        Thread.sleep(1000);
        driver.findElement(By.id("FNOLWizard:Next-btnInnerEl")).click();

        //step 5 Next Btn
        Thread.sleep(1000);
        driver.findElement(By.id("FNOLWizard:Next-btnInnerEl")).click();

        //Finish Btn
        Thread.sleep(1000);
        driver.findElement(By.id("FNOLWizard:Finish-btnInnerEl")).click();

        Thread.sleep(1000);
        WebElement claimNumAndSuccessMsg = driver.findElement(By.id("//label[@id='NewClaimSaved:NewClaimSavedScreen:NewClaimSavedDV:Header']"));
        System.out.println("***************** Claim Is Successfully Created **********************");
        System.out.println("The claimNumber is :" + claimNumAndSuccessMsg.getText());

        //Actions Btn

        Thread.sleep(1000);
        WebElement actionBtn = driver.findElement(By.id("FNOLWizard:FNOLMenuActions-btnWrap"));
        actions.moveToElement(actionBtn,30,0).click().perform();
        Thread.sleep(2000);


    }

}