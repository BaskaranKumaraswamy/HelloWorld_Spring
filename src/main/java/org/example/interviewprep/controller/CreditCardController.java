package org.example.interviewprep.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class CreditCardController {

    @GetMapping(value = "bankdetails",produces = MediaType.APPLICATION_JSON_VALUE)
    public String getMyDetails(){
        HashMap bankDetails=new HashMap();
        //ArrayList bankDetails = new ArrayList();
        bankDetails.put("name","Deshvakumarbaskar");
        bankDetails.put("acc","4");
        bankDetails.put("bal","5000");
        if (bankDetails.containsKey("name1")){

            return bankDetails.get("name").toString();

        } else {
            return "no key present";
        }

    }
}
