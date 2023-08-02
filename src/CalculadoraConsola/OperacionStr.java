package CalculadoraConsola;

import java.util.List;

public class OperacionStr {
	
	public Integer getOperaciones(List<String> operaciones){
		//List<Operacion> opes = new ArrayList<Operacion>();
		int respuesta = 0;
		int num1=0;
		int num2=0;
		String sig ="";
		for (int i=0; i<operaciones.size(); i++) {
			 String operacion = operaciones.get(i);
			
			if (i==0) {
				num1=Integer.parseInt(operacion) ;
				sig = operaciones.get(i+1);
				num2= Integer.parseInt( operaciones.get(i+2));
				Operacion op =opercionIndividual(num1,sig,num2);
				
				i = i+2;
				respuesta = op.resultado();
				num1=op.resultado();
			}
			else {
				sig =  operaciones.get(i);
				num2= Integer.parseInt( operaciones.get(i+1));
				Operacion op =opercionIndividual(num1,sig,num2);
				respuesta = op.resultado();
				num1 =op.resultado();
				i++;
			}
			
		}
		return respuesta;
	}
	
	
	
	public Operacion opercionIndividual(int d1, String sig, int d2) {
        switch (sig) {
            case "+":
                return new Suma(d1, d2);
            case "-":
                return new Resta(d1, d2);
            case "*":
                return new Multiplicacion(d1, d2);
            case "/":
                return new Divicion(d1, d2);
            default:
               return null;
        }
    }
}
