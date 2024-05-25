package com.example.facebookapi.Repository;
import com.example.facebookapi.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    ArrayList<User> findAll();
    User save(User user);
   // User findAllByUserId(String userName);



}
