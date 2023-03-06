package user.xrkmed.sbBankApi.resources;

import java.time.Instant;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import user.xrkmed.sbBankApi.entities.Transaction;
import user.xrkmed.sbBankApi.entities.User;
import user.xrkmed.sbBankApi.services.UserService;
import user.xrkmed.sbBankApi.utils.Address;

@RestController
@RequestMapping(value = "/user")
public class UserResources {
	
	@Autowired
	private UserService service;
	
	@GetMapping
	public ResponseEntity<List<User>> getUser(){
		return ResponseEntity.ok(service.findAll());
	}

}
