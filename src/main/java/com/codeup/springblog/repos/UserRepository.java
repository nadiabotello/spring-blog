package com.codeup.springblog.repos;

import com.codeup.springblog.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Post, Long>  {
}
