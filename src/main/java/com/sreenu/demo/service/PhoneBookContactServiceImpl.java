package com.sreenu.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sreenu.demo.binding.PhoneBookContact;
import com.sreenu.demo.repository.PhoneBookContactRepo;

@Service
public class PhoneBookContactServiceImpl implements PhoneBookContactService {

	@Autowired
	private PhoneBookContactRepo repo;
	
	@Override
	public String saveContact(PhoneBookContact contact) {
		contact = repo.save(contact);	
		
		if (contact.getContactId()!=null) {
			return "Phone Book Contact Saved Successfully";
		}else {
			return "Phone Book Contact is failed to Save";
		}
	}

	@Override
	public List<PhoneBookContact> getAllContacts() {
		List<PhoneBookContact> contacts= repo.findAll();
		
		return contacts;
	}

	@Override
	public PhoneBookContact getContactById(Integer contactId) {
		Optional<PhoneBookContact> findById = repo.findById(contactId);
		if(findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override
	public String updateContact(PhoneBookContact contact) {
		if(repo.existsById(contact.getContactId())) {
			repo.save(contact);
			return "Phone Book Contact Updated Successfully";
		}else
		{
			return "No record found";
		}
	}

	@Override
	public String deleteContactById(Integer contactId) {
		if(repo.existsById(contactId)) {
			repo.deleteById(contactId);
			return "Phone Book Contact Deleted by Successfully";
		}else {
		return "No Record Found";
		}
		
	}
	

}
