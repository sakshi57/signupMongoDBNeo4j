package com.EntreClub.signup.signup.resource;

import com.EntreClub.signup.signup.model.Entrepreneur;
import com.EntreClub.signup.signup.model.signup;
import com.EntreClub.signup.signup.repository.EntrepreneurRepository;
import com.EntreClub.signup.signup.repository.signupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class signupController {

    @Autowired
    private signupRepository repository;
    @Autowired
    private EntrepreneurRepository repository2;



    @PostMapping("/signUp")
    public String registerEntrepreneur(@RequestBody signup Signup){

        Entrepreneur e=new Entrepreneur();
        e.setName(Signup.getFirstname());
        e.setId(Signup.getemailid());
        System.out.println(e.getId());

        repository.save(Signup);
        repository2.save(e);
        return e.getId();

    }

 /*   public Entrepreneur addEntrepreneur(@RequestBody Entrepreneur entrepreneur) {
        repository2.save(entrepreneur);
        return "Entrepreneur Added";
    }*/

}
