package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;

public class SearchCoursePage extends PageObject {
    public  static  final Target BUTTON_UC = the("Select university choucair")
            .located(By.xpath("//div[@id='universidad'//strong"));

    public  static  final Target INPUT_COURSE = the("Search course")
            .located(By.id("coursesearchbox"));

    public  static  final Target BUTTON_GO = the("Click to seach course")
            .located(By.id("//buttom[@class='btn btn-secondary']"));

    public  static  final Target SELECT_COURSE = the("Click to select course")
            .located(By.xpath("//h4[contains(text(),'Recursos Automatizacion Bancolombia')]"));


    public static final Target NAME_COURSE = the("extract the course name")
            .located(By.xpath("//h1[contains(text(),'Recursos Automatizacion Bancolombia')]"));
}
