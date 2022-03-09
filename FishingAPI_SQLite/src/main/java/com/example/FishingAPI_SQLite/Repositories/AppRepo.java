package com.example.FishingAPI_SQLite.Repositories;

import com.example.FishingAPI_SQLite.Entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppRepo extends JpaRepository<Person,Long> {


}
