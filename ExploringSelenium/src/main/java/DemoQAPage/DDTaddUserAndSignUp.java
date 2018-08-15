package DemoQAPage;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import DemoQAPage.utilityAppache;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DDTaddUserAndSignUp {

    // filePathOfTheExcellSpreadSheet
    String pathOfFile = "C:\\Development";
    String actualFile = "\\UserSignUpAndLogin.xlsx";

    @FindBy(xpath = "/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[3]") private WebElement signUpLink;
    @FindBy(xpath = "/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[1]/td[2]/p/input") private WebElement userSignUpTextBox;
    @FindBy(xpath = "/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[2]/td[2]/p/input") private WebElement passwordSignUpTextBox;
    @FindBy(xpath = "/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[3]/td[2]/p/input") private WebElement SignUpBtn;

    @FindBy(xpath = "/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[4]") private WebElement signInLink;
    @FindBy(xpath = "/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/p/input") private WebElement userSignInTextBox;
    @FindBy(xpath = "/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/p/input") private WebElement passwordSignInTextBox;
    @FindBy(xpath = "/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[3]/td[2]/p/input") private WebElement SignInBtn;

    @FindBy(xpath = "/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b") private WebElement logInStatus;

    public void getUserNameAndPasswordFromExcel(){
        FileInputStream file = null;
        try {
            file = new FileInputStream(pathOfFile + actualFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        XSSFWorkbook workbook = null;
        try {
        workbook = new XSSFWorkbook(file);
        } catch (IOException e){ }
        XSSFSheet sheet = workbook.getSheetAt(0);
        for(int i = 1; i < 3; i++){
            XSSFCell username = sheet.getRow(i).getCell(0);
            XSSFCell password = sheet.getRow(i).getCell(1);
            XSSFCell status = sheet.getRow(i).getCell(2);
            utilityAppache.setExcelFile(pathOfFile + actualFile,0);
            utilityAppache.getCellData(i,2);
            utilityAppache.setCellData("Success",i,2, pathOfFile, actualFile);
            signUp(username.toString(), password.toString());
            SignIn(username.toString(), password.toString());
        }
    }

    public void signUp(String user, String password){
        signUpLink.click();
        userSignUpTextBox.sendKeys(user);
        passwordSignUpTextBox.sendKeys(password);
        SignUpBtn.click();
    }

    public boolean checkIfLogInSuccessful(){
        if(logInStatus.getText().equals("**Successful Login**")){
            return true;
        }
        else{
            return false;
        }
    }


    public void SignIn(String username, String password){
        signInLink.click();
        userSignInTextBox.sendKeys(username);
        passwordSignInTextBox.sendKeys(password);
        SignInBtn.click();
    }

}
