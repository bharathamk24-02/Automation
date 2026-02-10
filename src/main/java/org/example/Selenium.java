package org.example;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.List;




public class Selenium {

    // Scenario 1
    static void main() throws InterruptedException {

//        try {
//            WebDriver driver = new ChromeDriver();
//            driver.manage().window().maximize();
//            driver.get("https://www.orangehrm.com/");
//            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
//            driver.findElement(By.xpath("//button[text()='Allow selection']")).click();
//            Thread.sleep(2000);
//            driver.findElement(By.xpath("//a[text()='Solutions']")).click();
//            Thread.sleep(1000);
//            driver.findElement(By.xpath("//a[text()='Starter (Open Source)']")).click();
//
//            List<WebElement> serviceName = driver.findElements(By.xpath("//div[@class='card-title-menu']"));
//            for (int i = 0; i < serviceName.size(); i++) {
//                System.out.println("******* The serviceName is : **********" + serviceName.get(i).getText());
//            }
//            driver.close();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//
//    }


        // Scenario 2
//        try {
//
//            String userNameAndPassword = "exp_test";
//            WebDriver driver = new ChromeDriver();
//            driver.manage().window().maximize();
//            driver.get("http://10.192.190.131:8180/pc/PolicyCenter.do");
//            Thread.sleep(1000);
//            WebElement userName = driver.findElement(By.xpath("//input[@id=\"Login:LoginScreen:LoginDV:username-inputEl\"]"));
//            userName.sendKeys(userNameAndPassword);
//            Thread.sleep(2000);
//            driver.findElement(By.xpath("//input[@id=\"Login:LoginScreen:LoginDV:password-inputEl\"]")).sendKeys(userNameAndPassword);
//            Thread.sleep(2000);
//            driver.findElement(By.xpath("//span[@id=\"Login:LoginScreen:LoginDV:submit-btnInnerEl\"]")).click();
//            Thread.sleep(2000);
//
//            driver.quit();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//
//
//    }}
        //Scenario 3

//        try {
//            WebDriver driver = new ChromeDriver();
//            driver.manage().window().maximize();
//            driver.get("https://www.orangehrm.com/");
//            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
//            driver.findElement(By.xpath("//button[text()='Allow selection']")).click();
//            Thread.sleep(2000);
//            driver.findElement(By.xpath("//a[text()='Solutions']")).click();
//            Thread.sleep(1000);
//            List<WebElement> sourceList = driver.findElements(By.xpath("//div[@class=\"left-sub-menu\"]"));
//            for (int i =0 ;i<sourceList.size();i++){
//                System.out.println(sourceList.get(i).getText().trim());
//            }
//            driver.close();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        } {



        //Guideware Account Creation

        try {

            String userNameAndPassword = "exp_test";
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://10.192.190.131:8180/pc/PolicyCenter.do");
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
                    By.xpath("//span[contains(@id,'AccountTab-btnEl')]")
            );
            actions.moveToElement(dropdown,30,0).click().perform();
            Thread.sleep(2000);

            driver.findElement(By.xpath("//span[@id=\"TabBar:AccountTab:AccountTab_NewAccount-textEl\"]")).click();

            Thread.sleep(1000);
            WebElement enterFirstName = driver.findElement(By.xpath("//input[@id=\"NewAccount:NewAccountScreen:NewAccountSearchDV:GlobalPersonNameInputSet:FirstName-inputEl\"]"));
            enterFirstName.sendKeys("Bharath");

            WebElement enterLastname = driver.findElement(By.xpath("//input[@id=\"NewAccount:NewAccountScreen:NewAccountSearchDV:GlobalPersonNameInputSet:LastName-inputEl\"]"));
            enterLastname.sendKeys("kumar");

//

            WebElement clickSubmitbtn = driver.findElement(By.xpath("//a[@id=\"NewAccount:NewAccountScreen:NewAccountSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search\"]"));
            clickSubmitbtn.click();

            Thread.sleep(1000);
            driver.findElement(By.id("NewAccount:NewAccountScreen:NewAccountButton-btnInnerEl")).click();

            Thread.sleep(2000);
            driver.findElement(By.xpath("//a[@id=\"NewAccount:NewAccountScreen:NewAccountButton:NewAccount_Person-itemEl\"]")).click();

            Thread.sleep(2000);

            WebElement enterAddress = driver.findElement(By.id("CreateAccount:CreateAccountScreen:CreateAccountDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl"));
            String address = RandomStringUtils.randomAlphabetic(3);
            System.out.println(address);
            enterAddress.sendKeys("Test-"+ address);;

            WebElement pincode = driver.findElement(By.xpath("//input[@id=\"CreateAccount:CreateAccountScreen:CreateAccountDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode-inputEl\"]"));
            pincode.sendKeys("99501");
            Thread.sleep(3000);
              driver.findElement(By.id("CreateAccount:CreateAccountScreen:CreateAccountDV:AddressDescription-inputEl")).click();

              driver.findElement(By.id("CreateAccount:CreateAccountScreen:CreateAccountDV:AddressType-inputEl")).click();
//            Actions actions1 = new Actions(driver);
//            actions1.contextClick(addressType);
            Thread.sleep(1000);
            System.out.println("Printed_sample-1");
            driver.findElement(By.xpath("(//li[contains(text(),'Billing')])")).click();
            Thread.sleep(1000);

            driver.findElement(By.xpath("//div[@id=\"CreateAccount:CreateAccountScreen:CreateAccountDV:ProducerSelectionInputSet:Producer:SelectOrganization\"]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//input[@id=\"OrganizationSearchPopup:OrganizationSearchPopupScreen:OrganizationSearchDV:GlobalContactNameInputSet:Name-inputEl\"]")).sendKeys("a");
            driver.findElement(By.xpath("//a[@id=\"OrganizationSearchPopup:OrganizationSearchPopupScreen:OrganizationSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search\"]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//a[@id=\"OrganizationSearchPopup:OrganizationSearchPopupScreen:OrganizationSearchResultsLV:0:_Select\"]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//span[@id=\"CreateAccount:CreateAccountScreen:Update-btnInnerEl\"]")).click();
            Thread.sleep(5000);

            WebElement expectedAccNum =driver.findElement(By.xpath("//div[@id=\"AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:AccountNumber-bodyEl\"]"));
            System.out.println("AccountNum :"+ expectedAccNum.getText());

            Thread.sleep(1000);
            List<WebElement> expectedAccName =driver.findElements(By.xpath("//div[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:Name-inputEl']"));
            for (int i =0 ;i<expectedAccName.size();i++) {
                System.out.println("Address :" + expectedAccName.get(i).getText());
            }





            Thread.sleep(1000);

            List<WebElement> expectedAddress =driver.findElements(By.xpath("//div[@id=\"AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:AddressShortInputSet:globalAddressContainer:GlobalAddressInputSet:AddressSummary-inputEl\"]"));
            for (int i =0 ;i<expectedAddress.size();i++){
                System.out.println("Address :"+ expectedAddress.get(i).getText());
            }


            driver.close();
        } catch (Exception e) {
            throw new RuntimeException(e);

        }


    }}






