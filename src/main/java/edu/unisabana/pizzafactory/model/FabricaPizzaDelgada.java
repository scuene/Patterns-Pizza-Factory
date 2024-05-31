package edu.unisabana.pizzafactory.model;

public class FabricaPizzaDelgada implements FabricaPizza {
    @Override
    public AmasadorPizza createAmasador() {
        return new AmasadorPizzaDelgada();
    }

    @Override
    public HorneadorPizza createHorneador() {
        return new HorneadorPizzaDelgada();
    }

    @Override
    public MoldeadorPizza createMoldeador() {
        return new MoldeadorPizzaDelgada();
    }
}