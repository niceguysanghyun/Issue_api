package com.Issue.auth.service.impl;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.Issue.auth.exception.UnauthorizedException;
import com.Issue.auth.service.JwtService;
import com.Issue.user.entity.User;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
@Service
public class JwtServiceImpl implements JwtService{
	private static final String SALT =  "LeeSangHyunSecretOHNOKEYISVERYSHORTOHNOWWWWWW";
	@SuppressWarnings("deprecation")
	@Override
	public <T> String create(User user, String subject) {
        Date expireTime = new Date();
        expireTime.setTime(expireTime.getTime() + 1000 * 60 * 60); //한시간
		
        Map<String, Object> map= new HashMap<String, Object>();
        System.out.println("ExpireTime : "+expireTime);
        map.put("id"   ,user.getId());
        map.put("email",user.getEmail());
        map.put("name" , user.getName());
        
		String jwt = Jwts.builder() 
						 .setHeaderParam("typ", "JWT")
						 .setHeaderParam("regDate", System.currentTimeMillis())
						 .setSubject(subject)
						 .setClaims(map)
						 .setExpiration(expireTime)
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
			Jws<Claims> jjwt = Jwts.parser().
								 setSigningKey(this.generateKey())
								 .parseClaimsJws(jwt);
			
			Claims claims = jjwt.getBody();
			
			System.out.println("claim_id   :"+claims.get("id"));
			System.out.println("claim_name :"+claims.get("name"));
			
			
			return true;
		}catch(UnauthorizedException e) {
			return  false;
		}
	}
	
	 @Override
	 public String getUserId(String jwt) {
		 return Jwts.parser().setSigningKey(this.generateKey()).parseClaimsJws(token).getBody().getId();
	 }

}
