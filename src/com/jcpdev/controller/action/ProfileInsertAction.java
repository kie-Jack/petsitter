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
		int idx = 1;
		String pet = request.getParameter("pet");
		String p_name = request.getParameter("p_name");
		String p_gender = request.getParameter("p_gender");
		double p_weight = Double.parseDouble(request.getParameter("p_weight"));
		String p_birth = request.getParameter("p_birth");
		String p_neu = request.getParameter("p_neu");
		
		PetProfile dto = new PetProfile();
		dto.setIdx(idx);
		dto.setPet(pet);
		dto.setP_name(p_name);
		dto.setP_gender(p_gender);
		dto.setP_weight(p_weight);
		dto.setP_birth(p_birth);
		dto.setP_neu(p_neu);
		
		System.out.println(dto);
		PetProfileDao dao = PetProfileDao.getInstance();
		dao.p_insert(dto);
		
		ActionForward forward = new ActionForward();
		forward.isRedirect = true;
		forward.url = "petlist.jsp";
		return forward;
	}
}
