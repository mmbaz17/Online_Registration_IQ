/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.person.service;

/**
 *
 * @author Muzamiru.Mbaziira
 */
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.person.model.Person;
import com.person.repository.PersonRepository;
//defining the business logic
@Service
public class PersonService 
{
@Autowired
PersonRepository personRepository;
//getting all individual record by using the method findaAll() of CrudRepository
public List<Person> getAllPerson() 
{
List<Person> person = new ArrayList<Person>();
personRepository.findAll().forEach(individual1 -> person.add(individual1));
return person;
}
//getting a specific record by using the method findById() of CrudRepository
public Person getPersonsById(String id) 
{
return personRepository.findById(id).get();
}
//saving a specific record by using the method save() of CrudRepository
public void saveOrUpdate(Person person) 
{
personRepository.save(person);
}

}