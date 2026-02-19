package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    public static final Target BOTON_SIGN_IN =
            Target.the("Botón Sign In")
                    .located(By.id("LoginPanel0_LoginButton"));

    public static final Target MENSAJE_LOGIN_EXITOSO =
            Target.the("Mensaje login exitoso")
                    .located(By.id("spanMessage")); // cambia por el real
}
