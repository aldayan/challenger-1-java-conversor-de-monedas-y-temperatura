package CovertirTemperatura;

import javax.swing.JOptionPane;



public class OpcionesTemperatura {
	
	ConvertirTemperatura temperatura = new ConvertirTemperatura();
	
	public void temperatura(double valor) {
		String opcion = JOptionPane.showInputDialog(null, "Elije la Temperatura a Convertir","Temperaturas",
				JOptionPane.PLAIN_MESSAGE, null, new Object[] 
						{"De Grados C° a F°" ,"De F° a C°","De Grados C° a K°","De Grados K° a C°","De Grados F° a K°",
								"De Grados K° a F°"},"selección").toString();
		switch (opcion) {
		case "De Grados C° a F°": 
			temperatura.CelsiusAfarenheit(valor);
			break;
		case "De F° a C°": 
			temperatura.FarenheitACelsius(valor);
			break;
		case "De Grados C° a K°": 
			temperatura.CelsiusAkelvin(valor);
			break;
		case "De Grados K° a C°": 
			temperatura.KelvinACelsius(valor);
			break;
		case "De Grados F° a K°": 
			temperatura.FarenheitAkelvin(valor);
			break;
		case "De Grados K° a F°": 
			temperatura.KelvinAfarenheit(valor);
			break;	
		}
	}
}
