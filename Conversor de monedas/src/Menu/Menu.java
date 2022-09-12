package Menu;

import javax.swing.JOptionPane;

import ConvertirMoneda.OpcionesMoneda;
import CovertirTemperatura.OpcionesTemperatura;

public class Menu {


	public static void main(String[] args) {
		
		OpcionesMoneda moneda = new OpcionesMoneda();
		OpcionesTemperatura temperatura = new OpcionesTemperatura();
	
		
		while (true) {
			String opcion = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "MENU", JOptionPane.PLAIN_MESSAGE, null,
					new Object[]{"Conversor de Monedas", "Conversor de Temperatura"}, "Elegir").toString();
			
			switch (opcion) {
			case "Conversor de Monedas": 
				String entrada = JOptionPane.showInputDialog(null, "Ingrese una valor");
				double valorIngresado= Double.parseDouble(entrada);
				moneda.ConvertirMonedas(valorIngresado);
				break;
			case "Conversor de Temperatura": 
				String temp = JOptionPane.showInputDialog(null, "Ingrese una valor");
				double Temp= Double.parseDouble(temp);
				temperatura.temperatura(Temp);
				break;
			
			}
		}
	}

}
