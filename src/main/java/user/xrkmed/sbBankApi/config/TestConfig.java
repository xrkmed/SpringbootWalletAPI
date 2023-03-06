package user.xrkmed.sbBankApi.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import user.xrkmed.sbBankApi.entities.Transaction;
import user.xrkmed.sbBankApi.entities.User;
import user.xrkmed.sbBankApi.repositories.TransactionRepository;
import user.xrkmed.sbBankApi.repositories.UserRepository;
import user.xrkmed.sbBankApi.utils.Address;

@Configuration
@Profile(value = "test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository playerRep;
	
	@Autowired
	private TransactionRepository transactionRep;
	
	@Override
	public void run(String... args) throws Exception {
		Address address = new Address("Brazil", "SC", "Florianopolis - R. Teste, 542", "Bloco a APT b", 88150000);
		User testUser = new User(null, "John Wilhelm Milian Martin", "48 99999-9999", "123456", address, "12711111111", 200);
		User testUser2 = new User(null, "Luan Milian Martin", "48 99998-9999", "123456", address, "12811111111", 100);
		
		playerRep.saveAll(Arrays.asList(testUser, testUser2));
		
		Transaction trans1 = new Transaction(null, 1L, "Desktop", 1, 8000, Instant.now());
		Transaction trans2 = new Transaction(null, 1L, "Smartphone", 1, 2000, Instant.now());
		testUser.addTransaction(trans1);
		testUser.addTransaction(trans2);
		transactionRep.saveAll(Arrays.asList(trans1, trans2));
		
	}
	
}
