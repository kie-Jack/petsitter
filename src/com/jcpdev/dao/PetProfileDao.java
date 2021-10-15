package com.jcpdev.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.jcpdev.dto.PetProfile;
import com.jcpdev.mybatis.SqlSessionBean;

public class PetProfileDao {

	
		SqlSessionFactory factory = SqlSessionBean.getSessionFactory();
		private static PetProfileDao dao = new PetProfileDao();
		private PetProfileDao() {}
		public static PetProfileDao getInstance() {
			return dao;
		}
		
		public void p_insert(PetProfile dto) {
			SqlSession mapper = factory.openSession();
			mapper.insert("petprofile.p_insert", dto);
			mapper.commit();
			mapper.close();
		}
		
		public List<PetProfile> getList(){
			List<PetProfile> list=null;
			SqlSession mapper = factory.openSession();
			list = mapper.selectList("petprofile.getAll");
			mapper.close();
			return list;
		}
		
		
}
