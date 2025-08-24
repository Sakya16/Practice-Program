package com.example.success.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/string")
public class SuccessController {

     @DeleteMapping("/removeFirstAndLast")
    public String removeFirstAndLastCharacter(@RequestParam String input){

         if (input == null || input.length() <= 2) {
             return "";
         }
         String result = input.substring(1, input.length()-1);
         return result;


         }


     }

