package com.ecommerce.reository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.model.Role;

public interface RoleRepositery extends JpaRepository<Role, Integer> {

}
