package CalculadoraConsola;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Calculadora {
	
	private Integer resultado =0;
	
	public void caturarOperacion() {
		String valor;
		try (Scanner leer = new Scanner(System.in)) {
			System.out.println("=-=-=-=-=Calculadora=-=-=-=-=");
			System.out.println("Digite la opercion");
			valor = leer.next();
		}
		resolverOperaciones(valor);
		System.out.println("=  "+this.resultado);
		
	}
	
	private void resolverOperaciones(String valor) {
		
		OperacionStr  opStr = new OperacionStr();
		List<String> elementos = separarCadena(valor,"(\\d+|[+\\-*/])" );		
		this.resultado = opStr.getOperaciones(elementos);
	}
	
	private List<String> separarCadena(String cadena, String patron) {
		List<String> elementos = new ArrayList<>();
	    Pattern pattern = Pattern.compile(patron);
	    Matcher matcher = pattern.matcher(cadena);

	    while (matcher.find()) {
	    	elementos.add(matcher.group());
	    }

	    return elementos;
	 }
	

}
