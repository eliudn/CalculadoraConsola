package CalculadoraConsola;

public abstract class Operacion {
	private Integer num1, num2;
	
	public Operacion(Integer num1, Integer num2) {
		this.setNum1(num1);
		this.setNum2(num2);
	}
	
	public abstract Integer resultado();

	public Integer getNum1() {
		return num1;
	}

	public void setNum1(Integer num1) {
		this.num1 = num1;
	}

	public Integer getNum2() {
		return num2;
	}

	public void setNum2(Integer num2) {
		this.num2 = num2;
	}

}
