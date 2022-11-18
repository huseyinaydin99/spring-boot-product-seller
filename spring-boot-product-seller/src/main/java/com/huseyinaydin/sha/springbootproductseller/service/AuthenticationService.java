package com.huseyinaydin.sha.springbootproductseller.service;

import com.huseyinaydin.sha.springbootproductseller.model.User;

/**
 * @author Hüseyin Aydın
 * @date 18.12.2021
 * @time 13:42
 */
public interface AuthenticationService
{
    User signInAndReturnJWT(User signInRequest);
}
