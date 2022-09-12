package ConvertirMoneda;

import javax.swing.JOptionPane;

public class OpcionesMoneda {
	
ConvertirMoneda monedas = new ConvertirMoneda();
	
	public void ConvertirMonedas(double valor) {
		String opcion = (JOptionPane.showInputDialog(null, "Elije la moneda para convertir tu dinero","MONEDAS",
				JOptionPane.PLAIN_MESSAGE, null, new Object[] 
						{"De peso a Dolar" ,"De peso a Euro","De peso a Libras Esterlinas",
								"De peso  a Yen Japones", "De pesoArgentino a Won Sur Coreano", "De Dolar a peso",
									"De Euro a peso ","De Libras Esterlinas a Peso", "De Yen Japones a peso",
										"De Won Sur Coreano a Peso"},"selección")).toString();
		switch (opcion) {
		case "De peso a Dolar": 
			monedas.PesoDolar(valor);
			break;
		
		case "De peso a Euro": 
			monedas.PesoEuro(valor);
			break;
		
		case "De peso a Libras Esterlinas": 
			monedas.PesoLibrasEsterlina(valor);;
			break;
		
		case "De peso  a Yen Japones": 
			monedas.PesoYenJapones(valor);
			break;
		case "De pesoArgentino a Won Sur Coreano": 
			monedas.PesoWonSurCoreano(valor);
			break;
		
		case "De Dolar a peso": 
			monedas.DolarPeso(valor);
			break;
			
		case "De Euro a peso": 
			monedas.EuroPeso(valor);
			break;
			
		case "De Libras Esterlinas a Peso": 
			monedas.LibrasEsterlinaPeso(valor);
			break;	
		case "De Yen Japones a peso": 
			monedas.YenJaponesPeso(valor);
			break;
		case "De Won Sur Coreano a Peso": 
			monedas.WonSurCoreanoPeso(valor);
			break;	
		}
		
	}

}
