package edu.unisabana.pizzafactory.model;


public class FabricaPizzaMasaIntegral implements FabricaPizza {
    @Override
    public AmasadorPizza createAmasador() {
        return new AmasadorPizzaIntegral();
    }

    @Override
    public HorneadorPizza createHorneador() {
        return new HorneadorPizzaIntegral();
    }

    @Override
    public MoldeadorPizza createMoldeador() {
        return new MoldeadorPizzaIntegral();
    }
}
