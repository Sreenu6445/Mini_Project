package com.sreenu.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sreenu.demo.binding.PhoneBookContact;

public interface PhoneBookContactRepo  extends JpaRepository<PhoneBookContact, Integer>{
	

}
