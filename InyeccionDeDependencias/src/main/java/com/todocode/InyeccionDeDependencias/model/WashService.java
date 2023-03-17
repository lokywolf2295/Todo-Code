package com.todocode.InyeccionDeDependencias.model;

public class WashService {

    private NormalService normalSevice;

    private PremiumService premiumService;

    /*Inyección de Dependencias por Constructores*/
    public WashService(NormalService normalSevice, PremiumService premiumService) {
        this.normalSevice = normalSevice;
        this.premiumService = premiumService;
    }

    /*Inyección de Dependencias por Setter*/

    public void setNormalSevice(NormalService normalSevice) {
        this.normalSevice = normalSevice;
    }

    public void setPremiumService(PremiumService premiumService) {
        this.premiumService = premiumService;
    }
}
