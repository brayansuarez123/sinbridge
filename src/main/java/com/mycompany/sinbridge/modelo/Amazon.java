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
public class Amazon {
    private EnvioArgentina Argentina;
    private EnvioColombia Colombia;
    private EnvioMexico Mexico;
    public Amazon(EnvioArgentina Argentina){
    this.Argentina=Argentina;
    }
    public Amazon(EnvioColombia Colombia){
    this.Colombia=Colombia;
    }
    public Amazon(EnvioMexico Mexico){
    this.Mexico=Mexico;
    }
    
    public String ProcesarPedidoArgentina(){
        if (Argentina==null) {
            return "no hay pedidos desde Argentina";
        }
        return Argentina.ProcesarPedido();
    }
    
    public String ProcesarPedidoColombia(){
        if (Colombia==null) {
            return "no hay pedidos desde Colombia";
        }
        return Colombia.ProcesarPedido();
    }
    
    public String ProcesarPedidoMexico(){
        if (Mexico==null) {
            return "no hay pedidos desde Mexico";
        }
        return Mexico.ProcesarPedido();
    }
    
    public String EnviarPedidoArgentina(){
        if (Argentina==null) {
            return "no hay envios desde Argentina";
        }
        return Argentina.Enviar();
    }
    
    public String EnviarPedidoColombia(){
        if (Colombia==null) {
            return "no hay envios desde Colombia";
        }
        return Colombia.Enviar();
    }
   
    public String EnviarPedidoMexico(){
        if (Mexico==null) {
            return "no hay envios desde Mexico";
        }
        return Mexico.Enviar();
    }
    
    
    public String EntregarPedidoArgentina(){
        if (Argentina==null) {
            return "no hay entregas desde Argentina";
        }
        return Argentina.Entrega();
    }
    
    public String EntregarPedidoColombia(){
        if (Colombia==null) {
            return "no hay entregas desde Colombia";
        }
        return Colombia.Entrega();
    }
    
    public String EntregarPedidoMexico(){
        if (Mexico==null) {
            return "no hay entregas desde Mexico";
        }
        return Mexico.Entrega();
    }
}
