/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Uptc.cajeroAutomatico.exeptions;

/**
 * Excepción que se lanza cuando el monto de una
 * operación es menor o igual a cero.
 *
 * @author AndresSandoval
 * @version 1.0
 */
public class IncorrectKeyException extends Exception{
    
    /** Identificador de versión de serialización. */
    private static final long serialVersionUID = 1L;
 
    /**
     * Construye la excepción con un mensaje descriptivo.
     *
     * @param message mensaje que explica el motivo del error
     */
    public IncorrectKeyException(String message) {
        super(message);
    }
}
