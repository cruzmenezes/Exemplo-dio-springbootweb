package com.edson.dio.springbootweb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
   public String mensagem(){
       return ("Ninguem como Deus!!!!!");
   }
}
