package com.upchiapas.practica03;

import com.upchiapas.practica03.models.Persona;
import com.upchiapas.practica03.models.Vehiculo;

import java.util.Scanner;

public class Main {
    private static Persona []listaPersona=new Persona[5]; static Persona objetoPersona;static Vehiculo objetoVeiculo;
    private static Vehiculo []listaVeiculo=new Vehiculo[3]; private static byte opcion; private static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Menu");
        System.out.println("1- Registrar personas");
        System.out.println("2- Registrar veiculo");
        System.out.println("3- Mostrar personas con veiculo");
        System.out.println("4- Mostrar personas sin veiculo");
        opcion= entrada.nextByte();
        switch (opcion){
            case 1:
                registarPersonas();
                break;
            case 2:
                registarVeiculo();
                break;
            case 3:
                mostrarPersonasVeiculo();
                break;
            case 4:
                mostrarPersonasinVeiculo();
        }
    }

    private static void registarVeiculo() {
    }
    private static void mostrarPersonasVeiculo(){
    }
    private static void mostrarPersonasinVeiculo(){
    }
    public static void registarPersonas(){
        String nombre; String marca; short modelo;
        for (int i=0; i<5; i++) {
            System.out.println("Ingresa el nombre");
            nombre = entrada.nextLine();
            objetoPersona = new Persona(nombre);
            listaPersona[i] = objetoPersona;
        }
    }
}