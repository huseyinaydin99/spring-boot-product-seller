package com.huseyinaydin.sha.springbootproductseller.service;

import java.util.Optional;

import com.huseyinaydin.sha.springbootproductseller.model.Role;
import com.huseyinaydin.sha.springbootproductseller.model.User;

/**
 * @author Hüseyin Aydın
 * @date 18.12.2021
 * @time 12:22
 */
public interface UserService
{
    User saveUser(User user);

    Optional<User> findByUsername(String username);

    void changeRole(Role newRole, String username);
}
