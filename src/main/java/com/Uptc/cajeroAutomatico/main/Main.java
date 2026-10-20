/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Uptc.cajeroAutomatico.main;

import com.Uptc.cajeroAutomatico.exeptions.IncorrectKeyException;
import com.Uptc.cajeroAutomatico.exeptions.InsufficientBalanceException;
import com.Uptc.cajeroAutomatico.exeptions.InvalidAmountException;
import com.Uptc.cajeroAutomatico.logic.ATM;
import com.Uptc.cajeroAutomatico.models.BankAccount;
import com.Uptc.cajeroAutomatico.presenter.ATMPresenter;
import com.Uptc.cajeroAutomatico.presenter.ATMView;
 
/**
 * Clase principal. Prueba los casos del taller y captura las excepciones.
 *
 * @author AndresSandoval
 * @version 1.0
 */
public class Main {
    
    	  /**
     * Construye la clase principal.
     */
    public Main() {
        // Clase de arranque sin estado
    }
 
    /**
     * Ejecuta los cuatro casos de prueba del cajero automático.
     *
     * @param args argumentos de línea de comandos (no se usan)
     */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount account = new BankAccount("001", "1234", 500);
		ATMPresenter presenter = new ATMPresenter(new ATM(account), new ATMView());

		double[] amounts = { 100, 1000, -50, 200 };
		String[] passwords = { "0000", "1234", "1234", "1234" };
		String[] titles = { "Caso 1: Clave incorrecta", "Caso 2: Monto mayor al saldo", "Caso 3: Monto negativo",
				"Caso 4: Retiro válido" };

		for (int i = 0; i < amounts.length; i++) {
			presenter.showTitle(titles[i]);
			try {
				presenter.withdraw(amounts[i], passwords[i]);
			} catch (InsufficientBalanceException e) {
				presenter.showError("InsufficientBalanceException", e.getMessage());
			} catch (IncorrectKeyException e) {
				presenter.showError("IncorrectKeyException", e.getMessage());
			} catch (InvalidAmountException e) {
				presenter.showError("InvalidAmountException", e.getMessage());
			} finally {
				presenter.showMessage("Intento procesado");
			}

		}

	}
}
