/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.person.model;

/**
 *
 * @author Muzamiru.Mbaziira
 */
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import javax.validation.constraints.Pattern;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "user")
public class Person {
 
  private Long id;

  @NotBlank(message="Name is mandatory")
 
  private String name;

  @NotBlank(message="ID Number is mandatory")
 
  @Pattern(regexp="^[0-9]{13}$")
  @NotNull
  private String card_id;

   @NotBlank
//  @Pattern(regexp="^[0-9]{10}$")

  private String phone;
  
  @Column(name = "card_id", nullable = false)
  public String getCard_id() {
	return card_id;
  }

  public void setCard_id(String card_id) {
	this.card_id = card_id;
  }

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }
  
    @Column(name = "name", nullable = false)
  public String getName() {
    return name;
  }

  
  public void setName(String name) {
    this.name = name;
  }


  @Column(name = "phone", nullable = false)
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }
}