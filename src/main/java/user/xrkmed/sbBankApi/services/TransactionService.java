package user.xrkmed.sbBankApi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import user.xrkmed.sbBankApi.entities.Transaction;
import user.xrkmed.sbBankApi.repositories.TransactionRepository;
import user.xrkmed.sbBankApi.repositories.UserRepository;

@Service
public class TransactionService {
	
	@Autowired
	private TransactionRepository repository;
	
	public List<Transaction> findAll(){
		return repository.findAll();
	}
	
	public Transaction findById(Long id) {
		Optional<Transaction> obj = repository.findById(id);
		return obj.get();
	}

}
