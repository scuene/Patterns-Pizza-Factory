package edu.unisabana.pizzafactory.consoleview;

import edu.unisabana.pizzafactory.model.FabricaPizza;
import edu.unisabana.pizzafactory.model.FabricaPizzaDelgada;
import edu.unisabana.pizzafactory.model.AmasadorPizza;
import edu.unisabana.pizzafactory.model.ExcepcionParametrosInvalidos;
import edu.unisabana.pizzafactory.model.HorneadorPizza;
import edu.unisabana.pizzafactory.model.Ingrediente;
import edu.unisabana.pizzafactory.model.MoldeadorPizza;
import edu.unisabana.pizzafactory.model.Tamano;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PreparadorPizza {
    private final FabricaPizza factory;

    public PreparadorPizza(FabricaPizza factory) {
        this.factory = factory;
    }

    public void prepararPizza(Ingrediente[] ingredientes, Tamano tam) throws ExcepcionParametrosInvalidos {
        AmasadorPizza amasador = factory.createAmasador();
        HorneadorPizza horneador = factory.createHorneador();
        MoldeadorPizza moldeador = factory.createMoldeador();

        amasador.amasar();

        if (tam == Tamano.PEQUENO) {
            moldeador.moldearPizzaPequena();
        } else if (tam == Tamano.MEDIANO) {
            moldeador.moldearPizzaMediana();
        } else {
            throw new ExcepcionParametrosInvalidos("Tamaño de pizza inválido: " + tam);
        }

        aplicarIngredientes(ingredientes);
        horneador.hornear();
    }

    private void aplicarIngredientes(Ingrediente[] ingredientes) {
        Logger.getLogger(PreparadorPizza.class.getName())
              .log(Level.INFO, "APLICANDO INGREDIENTES!:{0}", Arrays.toString(ingredientes));
        // CODIGO DE LLAMADO AL MICROCONTROLADOR
    }

    public static void main(String[] args) {
        try {
            Ingrediente[] ingredientes = {new Ingrediente("queso", 1), new Ingrediente("jamon", 2)};
            PreparadorPizza preparadorPizza = new PreparadorPizza(new FabricaPizzaDelgada());
            preparadorPizza.prepararPizza(ingredientes, Tamano.MEDIANO);
        } catch (ExcepcionParametrosInvalidos e) {
            Logger.getLogger(PreparadorPizza.class.getName()).log(Level.SEVERE, "Problema en la preparación de la Pizza", e);
        }
    }
}
