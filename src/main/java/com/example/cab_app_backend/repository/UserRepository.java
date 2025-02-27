package com.example.cab_app_backend.repository;
import com.example.cab_app_backend.Model.Car;
import com.example.cab_app_backend.Model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findByEmail(String email);
    List<User> findByUserrole(int userrole);


}
