/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sinbridge.vista;

import com.mycompany.sinbridge.modelo.EnvioArgentina;
import com.mycompany.sinbridge.modelo.EnvioColombia;
import com.mycompany.sinbridge.modelo.RepartoAmazon;

/**
 *
 * @author ADMIN
 */
public class App  {
    public static void main(String[] args){
        //Envio desde Colombia
    RepartoAmazon MiReparto = new RepartoAmazon(1, new EnvioColombia());
        System.out.println(MiReparto.ProcesarPedidoColombia());
        System.out.println(MiReparto.EnviarPedidoColombia());
        System.out.println(MiReparto.EntregarPedidoColombia());
        //Cambiando de pais de envio
        RepartoAmazon MiReparto2 = new RepartoAmazon(2, new EnvioArgentina());
        System.out.println(MiReparto2.ProcesarPedidoArgentina());
        System.out.println(MiReparto2.EnviarPedidoArgentina());
        System.out.println(MiReparto2.EntregarPedidoArgentina());
        //cambiando de pais de envio
     
    }
    
        
    
}
