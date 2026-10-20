/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Uptc.cajeroAutomatico.exeptions;

/**
 * Excepción que se lanza cuando el monto a retirar es
 * mayor al saldo disponible en la cuenta.
 *
 * @author AndresSandoval
 * @version 1.0
 */
public class InsufficientBalanceException extends Exception{
    /** Identificador de versión de serialización. */
    private static final long serialVersionUID = 1L;
 
    /**
     * Construye la excepción con un mensaje descriptivo.
     *
     * @param message mensaje que explica el motivo del error
     */
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
