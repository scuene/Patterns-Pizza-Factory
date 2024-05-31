package edu.unisabana.pizzafactory.model;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MoldeadorPizzaGruesa implements MoldeadorPizza {
    @Override
    public void moldearPizzaPequena() {
        Logger.getLogger(MoldeadorPizzaGruesa.class.getName())
              .log(Level.INFO, "[O] Moldeando pizza pequena de masa de pan.");
        // CODIGO DE LLAMADO AL MICROCONTROLADOR
    }

    @Override
    public void moldearPizzaMediana() {
        Logger.getLogger(MoldeadorPizzaGruesa.class.getName())
              .log(Level.INFO, "[O] Moldeando pizza mediana de masa de pan.");
        // CODIGO DE LLAMADO AL MICROCONTROLADOR
    }
}
