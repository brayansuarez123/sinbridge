/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sinbridge.modelo;

/**
 *
 * @author ADMIN
 */
public class RepartoAmazon  extends Amazon{
    private int Id;
    
    public RepartoAmazon(int Id, EnvioArgentina Argentina) {
        super(Argentina);
        this.Id=Id;
    }
    
    public RepartoAmazon(int Id, EnvioColombia Colombia) {
        super(Colombia);
        this.Id=Id;
    }
    
    public RepartoAmazon(int Id, EnvioMexico Mexico) {
        super(Mexico);
        this.Id=Id;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }
    
}
