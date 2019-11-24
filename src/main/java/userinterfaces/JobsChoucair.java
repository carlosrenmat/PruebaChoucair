package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class JobsChoucair {
    public static final Target location = Target.the("Text").located(By.id("search_location"));
    public static final Target Boton = Target.the("Text").located(By.xpath("//*[@id=\"content\"]/div/div/div/div/div/section[12]/div/div/div/div/div/div[2]/div/div/div/form/div[1]/div[4]/input"));
    public static final Target MESSAGE = Target.the("Text").located(By.xpath("//*[@id=\"content\"]/div/div/div/div/div/section[12]/div/div/div/div/div/div[2]/div/div/div/form/div[2]/span"));
    public static final Target MESSAGEQ = Target.the("Text").located(By.xpath("//*[@id=\"content\"]/div/div/div/div/div/section[12]/div/div/div/div/div/div[2]/div/div/div/ul/li"));

}
