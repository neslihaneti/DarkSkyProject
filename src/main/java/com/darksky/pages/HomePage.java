package com.darksky.pages;
import com.darksky.utils.ElementUtil;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static com.darksky.base.BasePage.driver;
public class HomePage {
    // locators using FindBy
    @FindBy(xpath = "//*[@id='searchForm']/input")
    private static WebElement searchForm;

    @FindBy(xpath = "//*[@id='searchForm']/a[2]")
    private static WebElement searchBtn;

    @FindBy(xpath = "//*[@id='title']/span[1]/span[2]/span[2]/span[2]/span[2]")
    private static WebElement lowTemp;

    @FindBy(xpath = "//*[@id='title']/span[1]/span[2]/span[2]/span[3]/span[2]")
    private static WebElement highTemp;

    //Constructor
    public HomePage() {
        PageFactory.initElements(driver, this);
    }


    public static String verifyTitle(){
        return ElementUtil.doGetPageTitle();
    }

    public static void enterlocation(String location){
        String keyCombination = Keys.chord(Keys.COMMAND,"A");
        searchForm.sendKeys(keyCombination);
        searchForm.sendKeys(Keys.DELETE);
        ElementUtil.doSendText(searchForm, location);
        ElementUtil.doClick(searchBtn);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String actualtitle = ElementUtil.doGetPageTitle();
        System.out.println(actualtitle);
    }



    public static String getlowtemp(){
        //System.out.println(ElementUtil.doGetText(lowTemp));
        return  ElementUtil.doGetText(lowTemp);

    }

    public static String gethightemp(){
        //System.out.println(ElementUtil.doGetText(highTemp));
        return  ElementUtil.doGetText(highTemp);
    }


}