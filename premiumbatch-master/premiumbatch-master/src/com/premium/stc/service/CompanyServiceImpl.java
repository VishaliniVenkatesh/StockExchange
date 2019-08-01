package com.premium.stc.service;

import java.sql.SQLException;
import java.util.List;

import com.premium.stc.dao.CompanyDao;
import com.premium.stc.dao.CompanyDaoImpl;
import com.premium.stc.model.Company;

public class CompanyServiceImpl implements CompanyService {

	private CompanyDao companyDao=new CompanyDaoImpl();
	
	@Override
	public Company insertCompany(Company company) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Company updateCompany(Company company) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Company> getCompanyList() throws SQLException {
		return companyDao.getCompanyList();
	}

}
