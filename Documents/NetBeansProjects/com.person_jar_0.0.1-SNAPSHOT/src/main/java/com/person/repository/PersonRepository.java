/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.person.repository;

/**
 *
 * @author Muzamiru.Mbaziira
 */
import org.springframework.data.repository.CrudRepository;

import com.person.model.Person;
public interface PersonRepository extends CrudRepository<Person, String>
{
}
