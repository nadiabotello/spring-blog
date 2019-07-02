package com.codeup.springblog.repos;

import com.codeup.springblog.models.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<Post, Long>  {
}
