package gochimein.backend.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import gochimein.backend.model.Post;

public interface PostRepository extends PagingAndSortingRepository<Post, Long>{
	
	public Page<Post> findByCreatorEmail(@Param("email") String email, Pageable page);
	
	
	public Page<Post> getMyWall(@Param("email") String email, Pageable page);
	
	
	public Page<Post> getPublicWall(@Param("email") String email, Pageable page);

}
