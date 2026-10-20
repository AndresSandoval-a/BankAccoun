/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Uptc.cajeroAutomatico.presenter;

import com.Uptc.cajeroAutomatico.exeptions.IncorrectKeyException;
import com.Uptc.cajeroAutomatico.exeptions.InsufficientBalanceException;
import com.Uptc.cajeroAutomatico.exeptions.InvalidAmountException;
import com.Uptc.cajeroAutomatico.logic.ATM;
import com.Uptc.cajeroAutomatico.models.BankAccount;

/**
 * Presentador del patrón MVP. Conecta el modelo ({@link ATM} y
 * {@link BankAccount}) con la vista ({@link ATMView}).
 *
 * @author AndresSandoval
 * @version 1.0
 */
public class ATMPresenter {
    
    /** Modelo: cajero que opera la cuenta. */
    private final ATM atm;
 
    /** Vista: muestra los resultados. */
    private final ATMView view;
 
    /**
     * Construye el presentador.
     *
     * @param atm cajero (modelo)
     * @param view vista donde se muestran los resultados
     */
    public ATMPresenter(ATM atm, ATMView view) {
        this.atm = atm;
        this.view = view;
    }
 
    /**
     * Solicita un retiro al cajero y muestra el saldo final si es exitoso.
     * Las excepciones se propagan para que las capture la clase Main.
     *
     * @param amount monto a retirar
     * @param password clave ingresada
     * @throws com.Uptc.cajeroAutomatico.exeptions.InsufficientBalanceException si el monto es mayor al saldo
     * @throws com.Uptc.cajeroAutomatico.exeptions.IncorrectKeyException
     */
    public void withdraw(double amount, String password)
            throws InsufficientBalanceException, IncorrectKeyException, InvalidAmountException {
        atm.withdraw(amount, password);
        view.showMessage("Retiro exitoso. Saldo final de " + atm.getBalance());
    }
 
    /**
     * Solicita un depósito al cajero y muestra el nuevo saldo.
     *
     * @param amount monto a depositar
     * @throws InvalidAmountException si el monto es menor o igual a cero
     */
    public void deposit(double amount) {
        atm.deposit(amount);
        view.showMessage("Depósito exitoso. Saldo actual de " + atm.getBalance());
    }
 
    /**
     * Muestra un mensaje de error en la vista.
     *
     * @param type nombre de la excepción capturada
     * @param message detalle del error
     */
    public void showError(String type, String message) {
        view.showError(type, message);
    }
 
    /**
     * Muestra el título de un caso de prueba en la vista.
     *
     * @param title título del caso
     */
    public void showTitle(String title) {
        view.showTitle(title);
    }
 
    /**
     * Muestra un mensaje informativo en la vista.
     *
     * @param message mensaje a mostrar
     */
    public void showMessage(String message) {
        view.showMessage(message);
    }
}
