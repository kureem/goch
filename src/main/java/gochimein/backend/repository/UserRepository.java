package gochimein.backend.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import gochimein.backend.model.User;

public interface UserRepository extends PagingAndSortingRepository<User, Long> {

	
	public User findByEmail(@Param("email") String email);
}
