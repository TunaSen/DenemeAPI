package com.example.FishingAPI_SQLite.Services;

import com.example.FishingAPI_SQLite.Entities.Person;
import com.example.FishingAPI_SQLite.Repositories.AppRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private AppRepo repo;

    @Transactional
    public Person newPerson(String name, String mail, String password, String tel_no, String catagories, String ip, String location) {
        Person person= new Person();
        person.setName(name);
        person.setPassword(password);
        person.setCatagories(catagories);
        person.setIp(ip);
        person.setLocation(location);
        person.setMail(mail);
        person.setTel_no(tel_no);
        return repo.save(person);
    }


    public List<Person> getAll(){


            return repo.findAll();

    }

}
