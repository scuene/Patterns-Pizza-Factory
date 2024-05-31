package edu.unisabana.pizzafactory.model;
/**
 *
 * @author sandracuene
 */
import edu.unisabana.pizzafactory.model.AmasadorPizza;
import edu.unisabana.pizzafactory.model.HorneadorPizza;
import edu.unisabana.pizzafactory.model.MoldeadorPizza;

public interface FabricaPizza {
    AmasadorPizza createAmasador();
    HorneadorPizza createHorneador();
    MoldeadorPizza createMoldeador();
}
