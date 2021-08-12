package userinterface;

import net.thucydides.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class ChoucairLoginPage extends PageObject {
    public  static  final Target LOGIN_BUTTON = Target.the("button that shows us the form to login").
            located(By.xpath("//*[@id=\"yui_3_17_2_1_1628784521255_40\"]"));

    public  static  final Target INPUT_USER = Target.the("Were do we write the user").located(By.id("username"));

    public  static  final Target INPUT_PASSWORD = Target.the("Where do we write the password").located(By.id("Password"));

    public  static  final Target ENTER_BUTTON = Target.the("button to confirm login").located(By.xpath("//*[@id=\"yui_3_17_2_1_1628784521255_31\"]"));
}
