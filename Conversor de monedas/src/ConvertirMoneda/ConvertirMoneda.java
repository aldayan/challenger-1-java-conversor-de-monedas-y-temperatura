package ConvertirMoneda;

import javax.swing.JOptionPane;

public class ConvertirMoneda {
	
	public void PesoDolar(double valor) {
		double monedaDolar = valor/ 52.75;
		monedaDolar = (double) Math.round(monedaDolar * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaDolar + " Dolares");
	}

	public void PesoEuro(double valor) {
		double monedaEuro = valor/53.14;
		monedaEuro = (double) Math.round(monedaEuro * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaEuro + " Euros");
	}

	public void PesoLibrasEsterlina(double valor) {
		double monedaLibraEsterlina = valor/61.31;
		monedaLibraEsterlina = (double) Math.round(monedaLibraEsterlina * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaLibraEsterlina + " Libras Esterlinas");
	}

	public void PesoYenJapones(double valor) {
		double monedaYenJapones = valor/0.37;
		monedaYenJapones = (double) Math.round(monedaYenJapones * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaYenJapones + " Yen Japones");
}

	public void PesoWonSurCoreano(double valor) {
		double monedaWonSurCoreano = valor/0.038;
		monedaWonSurCoreano = (double) Math.round(monedaWonSurCoreano * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaWonSurCoreano + " Won sul-coreano");
	}

	public void DolarPeso(double valor) {
		double monedaPesoAr = valor * 52.75;
		monedaPesoAr = (double) Math.round(monedaPesoAr * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaPesoAr + " Pesos");
	}

	public void EuroPeso(double valor) {
		double monedaPesoAr = valor*53.14;
		monedaPesoAr = (double) Math.round(monedaPesoAr * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaPesoAr + " Pesos");
	}

	public void LibrasEsterlinaPeso(double valor) {
		double monedaPesoAr = valor*61.31;
		monedaPesoAr = (double) Math.round(monedaPesoAr * 100d)/100;
	JOptionPane.showMessageDialog(null, "Tienes $" + monedaPesoAr + " Pesos");
	}

	public void YenJaponesPeso(double valor) {
		double monedaPesoAr = valor*0.37;
		monedaPesoAr = (double) Math.round(monedaPesoAr * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaPesoAr + " Pesos");
	}

	public void WonSurCoreanoPeso(double valor) {
		double monedaPesoAr = valor*0.038;
		monedaPesoAr = (double) Math.round(monedaPesoAr * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaPesoAr + " Pesos");
	}


}
