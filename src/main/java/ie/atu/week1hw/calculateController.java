package ie.atu.week1hw;

import  org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class calculateController {
    private float result;
    private String sumoperator;
    @GetMapping("/calculate")
    public String calculation( @RequestParam("num1") int num1,
                             @RequestParam("num2") int num2)
    {
    switch (sumoperator){
        case "add": new calculateController(num1+num2,sumoperator);
        case "subtrat":new calculateController(num1-num2,sumoperator);
        case "multiply":new calculateController(num1*num2,sumoperator);
        case "divide":new calculateController(num1/num2,sumoperator);

    }



           // return;
        }

    }

