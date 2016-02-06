package com.test;

import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import junit.framework.TestCase;

public class PasswordHash extends TestCase {

	public void testMD5Hash() {
		String password = "ilarum";
		Md5PasswordEncoder encoder = new Md5PasswordEncoder();
		String hashedPassword = encoder.encodePassword(password, null);
		System.out.println("password = " + hashedPassword);
	}
	
	public void testBcryptHash() {
		String password = "ilarum";
		
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String hashedPassword = encoder.encode(password);
		System.out.println("password = " + hashedPassword);
	}
	
}
