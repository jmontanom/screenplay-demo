package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import userinterfaces.LoginPage; // 👈 ESTE ES EL IMPORT QUE FALTA

public class HacerClickEnBoton implements Task {

    private String nombreBoton;

    public HacerClickEnBoton(String nombreBoton) {
        this.nombreBoton = nombreBoton;
    }

    public static HacerClickEnBoton conNombre(String nombreBoton) {
        return Tasks.instrumented(HacerClickEnBoton.class, nombreBoton);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        if (nombreBoton.equalsIgnoreCase("sign in")) {
            actor.attemptsTo(
                    Click.on(LoginPage.BOTON_SIGN_IN)
            );
        }
    }
}
