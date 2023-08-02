package CalculadoraConsola;

public class Divicion extends Operacion{

	public Divicion(Integer num1, Integer num2) {
		super(num1, num2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Integer resultado() {
		// TODO Auto-generated method stub
		return super.getNum1()/ super.getNum2();
	}

}
