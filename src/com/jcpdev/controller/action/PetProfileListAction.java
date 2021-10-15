package com.jcpdev.controller.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jcpdev.dao.PetProfileDao;
import com.jcpdev.dto.PetProfile;

public class PetProfileListAction implements Action{
	
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		PetProfileDao pdao = PetProfileDao.getInstance();
		List<PetProfile> list = pdao.getList();
		
		request.setAttribute("plist", list);
		
		return new ActionForward(false, "pet_insert.jsp");
	}
}
