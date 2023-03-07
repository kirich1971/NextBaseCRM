package com.kirich.CRM.step_defs;


import com.kirich.CRM.pages.LoginPage;
import com.kirich.CRM.utulities.ConfigurationReader;
import com.kirich.CRM.utulities.Driver;
import io.cucumber.java.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.BeforeClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Hooks {

    static class Credentials {
        String username;
        String password;

        Credentials(String username, String password) {
            this.username = username;
            this.password = password;
        }
    }

    static List<Credentials> credentialUsers = new LinkedList<>();

//    @BeforeAll
    public static void before_all() {

        System.out.println("Before Class !");
        File file = new File(ConfigurationReader.getProperty("fileName"));

        FileInputStream fileInputStream;
        XSSFWorkbook workbook;
        XSSFSheet sheet = null;

        try {
            fileInputStream = new FileInputStream(file);

            workbook = new XSSFWorkbook(fileInputStream);
            sheet = workbook.getSheet("Credentials");
        } catch (IOException e) {

        }
        int numberOfCredentials = sheet.getPhysicalNumberOfRows();

        for (int i = 1; i < numberOfCredentials; i++) {
            String username = String.valueOf(sheet.getRow(i).getCell(0));
            String password = String.valueOf(sheet.getRow(i).getCell(1));
            credentialUsers.add(new Credentials(username, password));
        }
    }


    @Before
    public void setupScenario(){
//        System.out.println("Setting up browser using cucumber @Before each scenario");
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

//        Credentials user = credentialUsers.remove(0);
//        new LoginPage().loginToPage(user.username, user.password);
    }



    @After
    public void teardownScenario(Scenario scenario){
        // We will implement taking screenshot in this method
        //System.out.println("It will be closing browser using cucumber @After each scenario");

        if(scenario.isFailed()){

            byte [] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png",scenario.getName());

        }

        Driver.closeDriver();
    }



//    @Before
    public void loginEachUser() {
        Credentials user = credentialUsers.remove(0);
        new LoginPage().loginToPage(user.username, user.password);
    }


    //@Before (value = "@login", order=2)
    public void setupForLogin(){
        // If you want any code to run before any specific feature/scenario,
        // you can use value= "@tagname" to determine this
        System.out.println("====this will only apply to scenarios with @login tag");
    }

    //@Before (value="@db" , order=3)
    public void setupDatabaseScenario(){
        System.out.println("====this will only apply to scenarios with @db tag");
    }

    //@BeforeStep
    public void setupScenarioStep(){
        System.out.println("--------> applying setup using @BeforeStep");
    }

    //@AfterStep
    public void afterStep(){
        System.out.println("--------> applying tearDown using @AfterStep");
    }



}
