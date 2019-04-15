package meek.donald.app.addition;

import java.io.Serializable;
import java.math.BigInteger;

public class AdditionModel implements Serializable {

	private static final long serialVersionUID = 1L;
	private BigInteger num1;
	private BigInteger num2;
	
	public AdditionModel() { }
	
	public BigInteger getNum1() {
		return num1;
	}
	public void setNum1(BigInteger num1) {
		this.num1 = num1;
	}
	public BigInteger getNum2() {
		return num2;
	}
	public void setNum2(BigInteger num2) {
		this.num2 = num2;
	} 
}
