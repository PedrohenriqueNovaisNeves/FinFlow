package com.example.Finflow.domain.user.services;

import com.example.Finflow.domain.user.dto.UserRecord;
import com.example.Finflow.domain.user.repository.UserRepository;
import com.example.Finflow.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServices {

    private final UserRepository userRepository;

    public UserServices(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public Object saveUser(UserRecord userRecord){

        Optional<UserEntity> findUser = userRepository.findByCpfUser(userRecord.cpfUser());

        if(findUser.isPresent()){
            return "Este usuario ja esta cadastrado em nosso sistema";
            throw new RuntimeException("Este usuario ja esta cadastrado em nosso sistema");
        }


    }
}
