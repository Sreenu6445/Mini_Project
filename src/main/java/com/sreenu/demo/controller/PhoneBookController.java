package com.sreenu.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sreenu.demo.binding.PhoneBookContact;
import com.sreenu.demo.service.PhoneBookContactService;

@RestController
public class PhoneBookController {
	
	@Autowired
	PhoneBookContactService service;
	
	@PostMapping("/phonebookcontact")
	public String contactSave(@RequestBody PhoneBookContact contact) {
		return service.saveContact(contact);
	}
	
	@GetMapping("/phonebookcontacts")
	public List<PhoneBookContact> getAllContacts() {
		return service.getAllContacts();
	}
	
	@GetMapping("/contact/{contactId}")
	public PhoneBookContact getContactById(@PathVariable Integer contactId) {
		return service.getContactById(contactId);
	}
	@PutMapping("/updatecontact")
	public String updateContact(@RequestBody PhoneBookContact contact) {
		return service.updateContact(contact);
	}
	
	@DeleteMapping("/deletecontact/{contactId}")
	public String deleteContact(@PathVariable Integer contactId) {
		return service.deleteContactById(contactId);
	}

}
