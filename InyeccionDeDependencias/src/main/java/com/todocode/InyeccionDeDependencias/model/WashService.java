package com.todocode.InyeccionDeDependencias.model;

public class WashService {

    private NormalService normalSevice;

    private PremiumService premiumService;

    /*Inyeccion de Dependencias por Constructores*/
    public WashService(NormalService normalSevice, PremiumService premiumService) {
        this.normalSevice = normalSevice;
        this.premiumService = premiumService;
    }


}
