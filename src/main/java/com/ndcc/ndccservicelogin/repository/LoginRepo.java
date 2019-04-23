package com.ndcc.ndccservicelogin.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.ndcc.ndccservicelogin.model.UserLogin;

@Repository
public interface LoginRepo extends JpaRepository<UserLogin, String> {

    UserLogin findByUserIdAndPasswordAndEmail(String userName, String password, String email);

}
