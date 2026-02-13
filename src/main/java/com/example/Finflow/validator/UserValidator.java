package com.example.Finflow.validator;

import org.springframework.stereotype.Component;

import com.example.Finflow.domain.user.dto.UserRecord;

@Component
public class UserValidator {

    public boolean validationCpf(String cpf){

        if(cpf == null || cpf.isBlank()){
            return false;
        }

        char[] convertStringToChar = cpf.toCharArray();
        int numbersOfaCharacters = convertStringToChar.length;

        if(numbersOfaCharacters != 11){
            return false;
        }
    }
}
