package CovertirTemperatura;

import javax.swing.JOptionPane;

public class ConvertirTemperatura {

	public void CelsiusAfarenheit(double valor) {
		double farenheit = (valor-32) * 5/9;
		farenheit = (double) Math.round(farenheit * 100d)/100;
		JOptionPane.showMessageDialog(null, "La emperatura es:" + farenheit + " F°");
	}
	public void FarenheitACelsius(double valor) {
		double Celsius = (valor*9/5) +32; 
		Celsius = (double) Math.round(Celsius * 100d)/100;
		JOptionPane.showMessageDialog(null, "La emperatura es:" + Celsius + " C°");
	}
	public void CelsiusAkelvin(double valor) {
		double Kelvin = (valor+273.15); 
		Kelvin = (double) Math.round(Kelvin * 100d)/100;
		JOptionPane.showMessageDialog(null, "La emperatura es:" + Kelvin + " K°");
	}
	public void KelvinACelsius(double valor) {
		double Celsius = (valor-273.15); 
		Celsius = (double) Math.round(Celsius * 100d)/100;
		JOptionPane.showMessageDialog(null, "La emperatura es:" + Celsius + " C°");
	}
	public void FarenheitAkelvin(double valor) {
		double Kelvin = (valor-32)*5/9 + 273.15; 
		Kelvin = (double) Math.round(Kelvin * 100d)/100;
		JOptionPane.showMessageDialog(null, "La emperatura es:" + Kelvin + " K°");
	}
	public void KelvinAfarenheit(double valor) {
		double farenheit = (valor-273.15)*9/5 + 32;
		farenheit = (double) Math.round(farenheit * 100d)/100;
		JOptionPane.showMessageDialog(null, "La emperatura es:" + farenheit + " F°");
	}
}
