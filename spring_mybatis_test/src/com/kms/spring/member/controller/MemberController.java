package com.kms.spring.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

public interface MemberController {
	public ModelAndView listMembers(HttpServletRequest request, HttpServletResponse response) throws Exception;
	public void addMember(HttpServletRequest request, HttpServletResponse response) throws Exception;
	public void removeMember(HttpServletRequest request, HttpServletResponse response) throws Exception;
	public ModelAndView memberForm(HttpServletRequest request, HttpServletResponse response) throws Exception;
	public ModelAndView modMember(HttpServletRequest request, HttpServletResponse response) throws Exception;
	public void updateMember(HttpServletRequest request, HttpServletResponse response) throws Exception;
	
}
