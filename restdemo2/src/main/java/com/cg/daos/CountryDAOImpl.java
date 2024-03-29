package com.cg.daos;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;


import org.springframework.stereotype.Repository;

import com.cg.entities.Country;

@Repository
public class CountryDAOImpl implements CountryDAO {

    List<Country> countries = new LinkedList<Country>();
    
    
    @PostConstruct
    public void populateSample() {
        countries.add(new Country("IN", "India", "Asia", "New Delhi"));
        countries.add(new Country("SK","Sri Lanka","Asia","Colambo"));
        countries.add(new Country("USA","United States of America","North America","Washington DC"));
    }
    
    
    
   

    
   

	public void save(Country country) {
		// TODO Auto-generated method stub
		countries.add(country);
		
	}

	public Country findByCode(String code) {
		// TODO Auto-generated method stub
		Country cn = null;
        Optional<Country> opt = countries.stream().filter( c -> c.getCode().equalsIgnoreCase(code)).findFirst();
        if(opt.isPresent()) {
            cn = opt.get();
        }
        return cn;
	}

	public List<Country> findByContinent(String continent) {
		// TODO Auto-generated method stub
		 List<Country> list= countries.stream().filter(c -> c.getContinent().equalsIgnoreCase(continent)).collect(Collectors.toList());
     return list;
	}

	public void update(Country country) {
		// TODO Auto-generated method stub
		Country temp = findByCode(country.getCode());
        if(temp != null) {
            temp.setCapital(country.getCapital());
            temp.setContinent(country.getContinent());
        }
		
	}
}