package ie.atu.week1hw;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class calculateController {


    @GetMapping("/calculate")
    public String calculation(
            @RequestParam("num1") int num1,
            @RequestParam("num2") int num2,
            @RequestParam("sumOperator") String sumOperator) {

        double result = 0.0; // Initialize the result variable

        switch (sumOperator) {
            case "add":
                result = num1 + num2;
                break; // Don't forget to break after each case
            case "subtract":
                result = num1 - num2;
                break;
            case "multiply":
                result = num1 * num2;
                break;
            case "divide":
                if (num2 != 0) { // Check for division by zero
                    result = (double) num1 / num2;
                } else {
                    return "Division by zero is not allowed.";
                }
                break;
            default:
                return "Invalid operator: " + sumOperator;
        }

        // Create a DataStorage object with the result and sumOperator
        DataStorage dataStorage = new DataStorage(result, sumOperator);

        return dataStorage.toString();
    }

}

