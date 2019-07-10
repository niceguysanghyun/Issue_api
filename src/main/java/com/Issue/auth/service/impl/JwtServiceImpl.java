package com.Issue.auth.service.impl;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import java.io.UnsupportedEncodingException;

import org.springframework.stereotype.Service;

import com.Issue.auth.exception.UnauthorizedException;
import com.Issue.auth.service.JwtService;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service("jwtService")
public class JwtServiceImpl implements JwtService{
	private static final String SALT =  "LeeSangHyunSecret";
	@SuppressWarnings("deprecation")
	@Override
	public <T> String create(String Key, T data, String subject) {
		
		String jwt = Jwts.builder() 
						 .setHeaderParam("typ", "JWT")
						 .setHeaderParam("regDate", System.currentTimeMillis())
						 .setSubject(subject)
						 .claim(Key, data)
						 .signWith(SignatureAlgorithm.HS256,this.generateKey())
						 .compact();
		return jwt;
	}

	@Override
	public byte[] generateKey() {
		byte[] key= null;
		try {
			key = SALT.getBytes("UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		return key;
	}

	@Override
	public boolean isUsable(String jwt) {
		try
		{
			Jws<Claims> claims = Jwts.parser().
								 setSigningKey(this.generateKey())
								 .parseClaimsJws(jwt);
			return true;
		}catch(UnauthorizedException e) {
			return  false;
		}
	}

}
