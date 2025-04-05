package com.preetham.OTPApi.Repo;

import com.preetham.OTPApi.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRep extends JpaRepository<User,Long> {

}
