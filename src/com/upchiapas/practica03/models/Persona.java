package com.upchiapas.practica03.models;

public class Persona {
    private String nombre;
    private Vehiculo[]listaVeiculo=new Vehiculo[3];
    public Persona (String nombre){
        this.nombre=nombre;
    }
    public boolean addVehiculo(Vehiculo vehiculo){
        boolean marca=true;
        for (int i=0; i<5; i++){
            if (listaVeiculo[i]!=null){
                listaVeiculo[i]=vehiculo;
            }
            else
                marca=false;
        }
        return marca;
    }
    public String getNombre(){
        return nombre;
    }
}
