package senai controller
import org.springframework.stereotype.controller;
import org.springframework.web.bind.annotation.GetMapping;

@controller
public class Homecontroller{

    @getMapping("/")
    public String home (){
        return "home";
    }
}