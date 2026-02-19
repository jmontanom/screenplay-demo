package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterfaces.LoginPage;

public class LoginExitoso implements Question<String> {

    public static LoginExitoso fue() {
        return new LoginExitoso();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(LoginPage.MENSAJE_LOGIN_EXITOSO)
                .answeredBy(actor);
    }
}
