package org.example.config;

public class AppConfig {

    private static AppConfig instance;
    private String ambiente;
    private double taxaBase;

    private AppConfig() {
        this.ambiente = "PROD";
        this.taxaBase = 0.02; //2%
    }

    public static AppConfig getInstance() {
        if(instance == null){
            instance = new AppConfig();
        }
        return instance;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public double getTaxaBase() {
        return taxaBase;
    }
}
