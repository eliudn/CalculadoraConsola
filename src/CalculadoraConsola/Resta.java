package CalculadoraConsola;

public class Resta extends Operacion {

	public Resta(Integer num1, Integer num2){
		super(num1, num2);
	}

	@Override
	public Integer resultado(){return this.getNum1()- this.getNum2();}

}
