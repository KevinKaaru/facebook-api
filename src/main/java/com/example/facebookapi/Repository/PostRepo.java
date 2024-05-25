package com.example.facebookapi.Repository;

import com.example.facebookapi.Entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
@Repository
public interface PostRepo extends JpaRepository<Post,Integer> {

    ArrayList<Post> findAll();
    Post save(Post post);


  void deleteById(Integer postID);

}
