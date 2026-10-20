/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Uptc.cajeroAutomatico.logic;

import com.Uptc.cajeroAutomatico.exeptions.IncorrectKeyException;
import com.Uptc.cajeroAutomatico.exeptions.InsufficientBalanceException;
import com.Uptc.cajeroAutomatico.exeptions.InvalidAmountException;
import com.Uptc.cajeroAutomatico.models.BankAccount;
 
/**
 * Cajero automático. Usa una {@link BankAccount} para realizar depósitos y
 * retiros, lanzando una excepción propia por cada error de negocio.
 *
 * @author AndresSandoval
 * @version 1.0
 */
public class ATM {
    
    /** Cuenta sobre la que opera el cajero. */
    private final BankAccount account;
 
    /**
     * Construye un cajero asociado a una cuenta.
     *
     * @param account cuenta con la que opera el cajero
     */
    public ATM(BankAccount account) {
        this.account = account;
    }
 
    /**
     * Deposita un monto en la cuenta.
     *
     * @param amount monto a depositar
     * @throws InvalidAmountException si el monto es menor o igual a cero
     */
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new InvalidAmountException(
                    "El monto debe ser mayor a cero: " + amount);
        }
        account.setBalance(account.getBalance() + amount);
    }
 
    /**
     * Retira un monto de la cuenta, validando monto, clave y saldo.
     *
     * @param amount monto a retirar
     * @param passwordEntered clave ingresada por el usuario
     * @throws InsufficientBalanceException si el monto es mayor al saldo
     * @throws IncorrectKeyException si la clave no coincide con la de la cuenta
     * @throws InvalidAmountException si el monto es menor o igual a cero
     */
    public void withdraw(double amount, String passwordEntered)
            throws InsufficientBalanceException, IncorrectKeyException {
        if (amount <= 0) {
            throw new InvalidAmountException(
                    "El monto debe ser mayor a cero: " + amount);
        }
        if (!account.getPassword().equals(passwordEntered)) {
            throw new IncorrectKeyException(
                    "La clave ingresada no coincide con la de la cuenta");
        }
        if (amount > account.getBalance()) {
            throw new InsufficientBalanceException(
                    "Saldo insuficiente. Saldo: " + account.getBalance()
                    + ", monto solicitado: " + amount);
        }
        account.setBalance(account.getBalance() - amount);
    }
 
    /**
     * Consulta el saldo actual de la cuenta.
     *
     * @return el saldo actual de la cuenta
     */
    public double getBalance() {
        return account.getBalance();
    }
}
