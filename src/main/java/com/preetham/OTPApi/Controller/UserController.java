package com.preetham.OTPApi.Controller;

import com.preetham.OTPApi.Model.User;
import com.preetham.OTPApi.Repo.UserRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    public UserRep userRep;

    @GetMapping("/home")
    public String getMsg(){
        return "Welcome to OTPAPI!";
    }
    @PostMapping("/save")
    public String saveUser(@RequestBody User user){
        //String a= String.valueOf('a'+'b');
        String b=user.getFirstName();
        String c=user.getLastName();
        Character d=b.charAt(0);
        Character e=c.charAt(0);
        String a= String.valueOf(d+e);
        user.setOtp(a);
        userRep.save(user);
        return "Save user details!";
    }

}
