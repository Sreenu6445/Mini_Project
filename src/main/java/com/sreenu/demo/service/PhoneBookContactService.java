package com.sreenu.demo.service;

import java.util.List;

import com.sreenu.demo.binding.PhoneBookContact;

public interface PhoneBookContactService {
	public String saveContact(PhoneBookContact contact);
	public List<PhoneBookContact> getAllContacts();
	public PhoneBookContact getContactById(Integer contactId);
	public String updateContact(PhoneBookContact contact);
	public String deleteContactById(Integer contactId);
	

}
