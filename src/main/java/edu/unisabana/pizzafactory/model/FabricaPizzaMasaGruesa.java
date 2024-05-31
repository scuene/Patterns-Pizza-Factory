package edu.unisabana.pizzafactory.model;


public class FabricaPizzaMasaGruesa implements FabricaPizza {
    @Override
    public AmasadorPizza createAmasador() {
        return new AmasadorPizzaGruesa();
    }

    @Override
    public HorneadorPizza createHorneador() {
        return new HorneadorPizzaGruesa();
    }

    @Override
    public MoldeadorPizza createMoldeador() {
        return new MoldeadorPizzaGruesa();
    }
}
