package com.huseyinaydin.sha.springbootproductseller.security.jwt;

import org.springframework.security.core.Authentication;

import com.huseyinaydin.sha.springbootproductseller.security.UserPrinciple;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Hüseyin Aydın
 * @date 18.12.2021
 * @time 13:13
 */
public interface JwtProvider
{
    String generateToken(UserPrinciple auth);

    Authentication getAuthentication(HttpServletRequest request);

    boolean isTokenValid(HttpServletRequest request);
}
