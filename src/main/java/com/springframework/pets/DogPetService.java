package com.springframework.pets;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//@Profile({"dog", "default"})  // commenting out to configure with a java configuration class
//@Service                      // commenting out to configure with a java configuration class
public class DogPetService implements PetService {
    public String getPetType(){
        return "Dogs are the best!";
    }
}
