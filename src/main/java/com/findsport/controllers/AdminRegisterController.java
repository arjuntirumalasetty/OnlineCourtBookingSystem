package com.findsport.controllers;

import com.findsport.DataAccessor.StadiumDAO;
import com.findsport.DataObjects.Stadium;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Arjun on 12/28/2016.
 */
@RestController
public class AdminRegisterController {

    @RequestMapping(value= "/stadium/", method = RequestMethod.GET)
    public ResponseEntity<Void> createAdmin(@RequestBody Stadium stadium ){
        boolean reslut = StadiumDAO.insertData(stadium);
        if(reslut){
            return new ResponseEntity<Void>(HttpStatus.CREATED);
        }
        else{
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }
    }
}
