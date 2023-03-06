package user.xrkmed.sbBankApi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import user.xrkmed.sbBankApi.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
