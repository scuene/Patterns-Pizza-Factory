package edu.unisabana.pizzafactory.model;

import java.util.logging.Level;
import java.util.logging.Logger;

public class AmasadorPizzaGruesa implements AmasadorPizza {
    @Override
    public void amasar() {
        Logger.getLogger(AmasadorPizzaGruesa.class.getName())
              .log(Level.INFO, "[@@] Amasando la pizza gruesa con masa de pan.");
        // CODIGO DE LLAMADO AL MICROCONTROLADOR
    }
}
