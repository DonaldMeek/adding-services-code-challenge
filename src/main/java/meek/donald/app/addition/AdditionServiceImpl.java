package meek.donald.app.addition;

import java.math.BigInteger;
import org.springframework.stereotype.Service;

@Service
public class AdditionServiceImpl implements AdditionService{

	public BigInteger getSumOfTwoIntegers(BigInteger num1, BigInteger num2) {
		
		int dummyDebugTestVar = 2;
		
		dummyDebugTestVar++;
		
		dummyDebugTestVar +=5;
		
		System.out.println("This is a debug test");
		
		return num1.add(num2);
	}
}
