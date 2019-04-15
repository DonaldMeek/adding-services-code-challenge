package meek.donald.app.addition;

import java.math.BigInteger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class AdditionController {
	
	@Autowired
	AdditionService additionService;
	
	@PostMapping("/addition")
	public BigInteger getSumOfTwoIntegers(@RequestBody AdditionModel additionModel) {
		return additionService.getSumOfTwoIntegers(additionModel.getNum1(), 
				additionModel.getNum2());
	}
}
