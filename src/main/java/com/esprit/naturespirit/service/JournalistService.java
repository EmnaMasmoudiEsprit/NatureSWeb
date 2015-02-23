package com.esprit.naturespirit.service;


import java.util.List; 
import javax.ejb.Remote;

import com.esprit.naturespirit.domain.SimpleUser;


@Remote
public interface JournalistService {
 void add(SimpleUser simpleuser); 
 void delete (SimpleUser simpleuser) ; 
 void update (SimpleUser simpleuser) ; 
 void validateUser (SimpleUser simpleUser); 
 List<SimpleUser> findAll();
SimpleUser findById(int Id); 

 
 

}
