package com.jcpdev.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jcpdev.dao.PetProfileDao;
import com.jcpdev.dto.PetProfile;

public class ProfileInsertAction implements Action{
	
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String pet = request.getParameter("pet");
		String p_name = request.getParameter("p_name");
		String p_gender = request.getParameter("p_gender");
		int p_weight = Integer.parseInt(request.getParameter("p_weight"));
		String p_birth = request.getParameter("p_birth");
		String p_neu = request.getParameter("p_neu");
		
		PetProfile dto = new PetProfile();
		dto.setPet(pet);
		dto.setP_name(p_name);
		dto.setP_gender(p_gender);
		dto.setP_weight(p_weight);
		dto.setP_birth(p_birth);
		dto.setP_neu(p_neu);
		
		PetProfileDao dao = PetProfileDao.getInstance();
		dao.p_insert(dto);
		
		ActionForward forward = new ActionForward();
		forward.isRedirect = true;
		forward.url = "";
		return forward;
	}
}
