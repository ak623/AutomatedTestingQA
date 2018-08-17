import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static junit.framework.TestCase.assertTrue;

public class Hr_Tool_Test {


    ExtentReports report = new ExtentReports(constants.reportPath, false);;
    ExtentTest test;
    WebDriver driver;
    String fakeEmailPage ="https://10minutemail.com/10MinuteMail/";
    String anime = "";
    private String fakeEmail;
    String url = "";

    //https://qa-trials641.orangehrmlive.com/auth/login
    @Before
    public void setUp() throws  Exception{
        driver = constants.setUp();
        url = "https://qa-trials641.orangehrmlive.com/auth/login";
        driver.manage().window().maximize();
        driver.get(url);
    }

    @After
    public void tearDown(){
        driver.quit();
        report.endTest(test);
        report.flush();
    }

    @Given("^the login page$")
    public void the_login_page(){
        Check_If_LogIn_Page_Loaded page = PageFactory.initElements(driver, Check_If_LogIn_Page_Loaded.class);
        test = report.startTest("Verify the login page has loaded");
        if (page.checkIfLogInPageLoaded()) {
            // report the test as a pass
            test.log(LogStatus.PASS, "The Login Page was sucessfully accessed");
        } else {
            test.log(LogStatus.FAIL, "The login Page could not be loaded");
        }
        assertTrue("page was not loaded",page.checkIfLogInPageLoaded());

    }

    @When("^I login$")
    public void i_login(){
        HR_Tool_Login_Action page = PageFactory.initElements(driver, HR_Tool_Login_Action.class);
        page.login();
        test = report.startTest("Confim user login");
        if (page.checkIfUserLoggedIn()) {
            test.log(LogStatus.PASS, "The user sucessfully logged in");
        } else {
            test.log(LogStatus.FAIL, "The user could not log in");
        }
        assertTrue("The login was not successful",page.checkIfUserLoggedIn());
    }

    @When("^I click the PIM tab$")
    public void i_click_the_PIM_tab() {
        Get_To_Employee_Tab_Action page = PageFactory.initElements(driver, Get_To_Employee_Tab_Action.class);
        page.loadEmployeeList();
        test = report.startTest("Test Employee List can be loaded");
        if (page.checkIfPmTabOpens()) {
            test.log(LogStatus.PASS, "PIM tab successfully opened");
        } else {
            test.log(LogStatus.FAIL, "PIM tab could not open");
        }
        if (page.checkIfEmoloyeeListLoaded()) {
            test.log(LogStatus.PASS, "Employee List was able to be accessed");
        } else {
            test.log(LogStatus.FAIL, "Employee List was not able to be accessed");
        }
        assertTrue("Employee List was not able to be accessed",page.checkIfEmoloyeeListLoaded());
    }

    @When("^then the Add Employee Tab$")
    public void then_the_Add_Employee_Tab(){
        Press_Start_EmployeeForm_Action page = PageFactory.initElements(driver, Press_Start_EmployeeForm_Action.class);
        page.clickAddEmployee(driver);
        test = report.startTest("Test If Add employee prompt opens");
        if (page.checkIfAddEmployeePromptOpens(driver)) {
            test.log(LogStatus.PASS, "Employee prompt successfully opened");
        } else {
            test.log(LogStatus.FAIL, "Employee prompt could not open");
        }
        assertTrue("Employee List was not able to be accessed",page.checkIfAddEmployeePromptOpens(driver));
    }

    @When("^I fill out the Add Employee Details correctly$")
    public void i_fill_out_the_Add_Employee_Details_correctly(){
        Fill_Out_Employee_Form_Action page = PageFactory.initElements(driver, Fill_Out_Employee_Form_Action.class);
        page.fillOutForm(driver);

        test = report.startTest("Test if user details are entered");
        if (page.checkIfFormIsFilledOut()) {
            test.log(LogStatus.PASS, "user details have sucessfully been added");
        } else {
            test.log(LogStatus.FAIL, "user details have not been added");
        }
        assertTrue("user details have not been added",page.checkIfFormIsFilledOut());
    }

    @When("^I choose to create Login Details by clicking the appropriate button$")
    public void i_choose_to_create_Login_Details_by_clicking_the_appropriate_button(){
        Check_If_LogIn_Page_Loaded page = PageFactory.initElements(driver, Check_If_LogIn_Page_Loaded.class);
        test = report.startTest("Confirm that the second part of user detail form opens");
        if (page.checkIfLogInPageLoaded()) {
            test.log(LogStatus.PASS, "The second part of the form has opened");
        } else {
            test.log(LogStatus.FAIL, "The second part of form did not openen");
        }
        assertTrue("The second part of the form has opened",page.checkIfLogInPageLoaded());
    }

    @When("^I fill out the Login Details correctly$")
    public void i_fill_out_the_Login_Details_correctly(){
        Add_Employee_LogIn_Details page = PageFactory.initElements(driver, Add_Employee_LogIn_Details.class);
        page.addEmployeeUserDetails(driver);
        test = report.startTest("Add user login details");
        if (page.checkIfLogInDetailsHaveBeenEntered()) {
            test.log(LogStatus.PASS, "Users details have been enterd");
        } else {
            test.log(LogStatus.FAIL, "Users details have not been enterd");
        }
        assertTrue("Users details have not beem enterd",page.checkIfLogInDetailsHaveBeenEntered());

    }

    @When("^I click the Save button$")
    public void i_click_the_Save_button(){
        Save_And_Confirm_Adding_Action page = PageFactory.initElements(driver, Save_And_Confirm_Adding_Action.class);
        page.saveUserDetails(driver);
        test = report.startTest("Confirm user has been added");
        if (page.checkIfUserDetailsSaved()) {
            test.log(LogStatus.PASS, "Users was added");
        } else {
            test.log(LogStatus.FAIL, "Users was not added");
        }
        assertTrue("Users was not added",page.checkIfUserDetailsSaved());
    }

    @Then("^I can search for the Employee I have just created$")
    public void i_can_search_for_the_Employee_I_have_just_created(){
        Searc_Employee_Action page = PageFactory.initElements(driver, Searc_Employee_Action.class);
        page.searchEmployee(driver);
        test = report.startTest("Check if employee has been searched");
        if (page.confirmeEmployeeHasLoaded()) {
            test.log(LogStatus.PASS, "Employee found");
        } else {
            test.log(LogStatus.FAIL, "Employee was not found");
        }
        assertTrue("Users was not added",page.confirmeEmployeeHasLoaded());

    }

    @Then("^select them for inspection$")
    public void select_them_for_inspection(){

    }
}
