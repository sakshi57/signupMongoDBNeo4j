package com.EntreClub.signup.signup.repository;

import com.EntreClub.signup.signup.model.signup;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface signupRepository extends MongoRepository <signup, String > {

}
