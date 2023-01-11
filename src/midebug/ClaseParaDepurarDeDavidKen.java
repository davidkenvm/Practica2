/**
 * 
 */
package midebug;
/**
 * @author Profesor
 * asfasdf
 *
 */

import java.util.LinkedList;
import java.util.List;

public class ClaseParaDepurarDeDavidKen {

	private double suma;
	private List<Double> lista;

	public ClaseParaDepurarDeDavidKen() {
		System.out.println("construyendo clase");
	}

	public double echaCuentas(int param1, double res1) {
		char car1 = 'a';
		int contador = 5;
		
		lista = new LinkedList<Double>();
		for (int i = 0; i < 100; i++) {
			lista.add((double) i);
		}
		suma = 0.0;
		for (Double valor : lista) {
			suma += valor;
		}
		echaCuentas(param1, res1);
		return suma;
	}
}
