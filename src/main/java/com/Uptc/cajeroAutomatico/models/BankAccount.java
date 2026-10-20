/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Uptc.cajeroAutomatico.models;

/**
 * Representa una cuenta bancaria. Es el modelo de datos del cajero.
 *
 * @author AndresSandoval
 * @version 1.0
 */
public class BankAccount {
     /** Número de la cuenta. */
    private String accountNumber;
 
    /** Clave de la cuenta. */
    private String password;
 
    /** Saldo actual de la cuenta. */
    private double balance;
 
    /**
     * Construye una cuenta bancaria.
     *
     * @param accountNumber número de la cuenta
     * @param password clave de la cuenta
     * @param balance saldo inicial de la cuenta
     */
    public BankAccount(String accountNumber, String password, double balance) {
        this.accountNumber = accountNumber;
        this.password = password;
        this.balance = balance;
    }
 
    /**
     * Obtiene el número de la cuenta.
     *
     * @return el número de la cuenta
     */
    public String getAccountNumber() {
        return accountNumber;
    }
 
    /**
     * Modifica el número de la cuenta.
     *
     * @param accountNumber nuevo número de la cuenta
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
 
    /**
     * Obtiene la clave de la cuenta.
     *
     * @return la clave de la cuenta
     */
    public String getPassword() {
        return password;
    }
 
    /**
     * Modifica la clave de la cuenta.
     *
     * @param password nueva clave de la cuenta
     */
    public void setPassword(String password) {
        this.password = password;
    }
 
    /**
     * Obtiene el saldo actual de la cuenta.
     *
     * @return el saldo actual
     */
    public double getBalance() {
        return balance;
    }
 
    /**
     * Modifica el saldo de la cuenta.
     *
     * @param balance nuevo saldo de la cuenta
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }
}
