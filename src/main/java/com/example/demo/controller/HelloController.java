package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

	@RequestMapping(value= {"/un-secure"})
	public String hello(HttpServletRequest req, HttpServletResponse res) {
		return "It is not a secure access";
	}
	
	@RequestMapping(value = {"/secure"})
	public String secureAccess(HttpServletRequest req, HttpServletResponse res) {
		return "It is a secure Access";
	}
	
	@RequestMapping(value = {"/admin"})
	public String admin(HttpServletRequest req, HttpServletResponse res) {
		return "It is a administration access";
	}
}
