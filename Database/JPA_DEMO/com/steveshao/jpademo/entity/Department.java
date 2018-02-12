package com.steveshao.jpademo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(query = "Select d from Department d", name = "find all deparments")
public class Department {

   @Id 
   @GeneratedValue( strategy=GenerationType.AUTO )

   private int id;
   private String name;

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getName( ){
      return name;
   }

   public void setName( String deptName ){
      this.name = deptName;
   }
}
    