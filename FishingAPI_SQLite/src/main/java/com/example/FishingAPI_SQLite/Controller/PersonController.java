package com.example.FishingAPI_SQLite.Controller;


import com.example.FishingAPI_SQLite.Entities.Person;
import com.example.FishingAPI_SQLite.Services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping
    public String info(){
        return "info";
    }

    @PostMapping
    public Person save (@RequestParam("name") String name , @RequestParam("mail") String mail , @RequestParam("password") String password , @RequestParam("tel_no") String tel_no,@RequestParam("catagories") String catagories,@RequestParam("ip") String ip,@RequestParam("location") String location){
        return personService.newPerson(name,mail,password,tel_no,catagories,ip,location);
    }

    @GetMapping("/getAll")
    public List<Person> getPerson(){


        return personService.getAll();

    }


}
