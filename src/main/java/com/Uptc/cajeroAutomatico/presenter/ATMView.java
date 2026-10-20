/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Uptc.cajeroAutomatico.presenter;

/**
 * Vista del patrón MVP. Solo se encarga de mostrar mensajes por consola.
 *
 * @author AndresSandoval
 * @version 1.0
 */
public class ATMView {
    
    	/**
     * Construye la vista del cajero.
     */
    public ATMView() {
        // Sin atributos que inicializar
    }
 
    /**
     * Muestra el título de un caso de prueba.
     *
     * @param title título del caso
     */
    public void showTitle(String title) {
        System.out.println("=== " + title + " ===");
    }
 
    /**
     * Muestra un mensaje informativo.
     *
     * @param message mensaje a mostrar
     */
    public void showMessage(String message) {
        System.out.println(message);
    }
 
    /**
     * Muestra un mensaje de error.
     *
     * @param type nombre de la excepción capturada
     * @param message detalle del error
     */
    public void showError(String type, String message) {
        System.out.println("Error [" + type + "]: " + message);
    }
}
