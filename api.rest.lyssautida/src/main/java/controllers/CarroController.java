package controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarroController {
    @RequestMapping(value="/carros", method = RequestMethod.GET) //expor url e o tipo da requisição
    public String HelloWorld() {
        return "Hello World";
    }
}
