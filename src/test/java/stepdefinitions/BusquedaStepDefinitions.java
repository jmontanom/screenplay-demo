package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import tasks.AbrirPagina;
import tasks.HacerClickEnBoton;

public class BusquedaStepDefinitions {

    WebDriver driver;
    Actor usuario;

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
        driver = new ChromeDriver();
        usuario = OnStage.theActorCalled("Jonathan");
        usuario.can(BrowseTheWeb.with(driver));
    }

    @Dado("el usuario abre la pagina y se loguea")
    public void el_usuario_abre_la_pagina_y_se_loguea() {
        usuario.attemptsTo(
                AbrirPagina.enStartSharp()
        );
    }

    @Cuando("hace clic en el boton {string}")
    public void hace_clic_en_el_boton(String boton) {
        usuario.attemptsTo(
                HacerClickEnBoton.conNombre(boton)
        );
    }

    @Entonces("debería loguearse")
    public void deberia_loguearse() {
        // Aquí luego pondremos la validación
    }
}
