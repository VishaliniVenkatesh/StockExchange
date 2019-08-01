package com.premium.stc.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.premium.stc.model.Company;

public class CompanyDaoImpl implements CompanyDao{

	public Company insertCompany(Company company) throws SQLException  {
		/*		Connection conn=DriverManager.getConnection("","test","test123");
		PreparedStatement ps=conn.prepareStatement("insert into company (clo) value(?,?,?,?,?)")
		ps.setInt(1, company.getCompanyId());
		ps.executeUpdate();
		*/
		return null;
	}

	
	public List<Company> getCompanyList() throws SQLException {
		List <Company> companyList=new ArrayList<Company>();
		try{
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/stock_db","root","root");
		PreparedStatement ps=conn.prepareStatement("select * from company");
		ResultSet rs=	ps.executeQuery();
		Company company=null;
		while(rs.next()){
			 company=new Company();
			 int companyId=rs.getInt("company_code");
			company.setCompanyId(companyId);;
			company.setBoardOfDirectors(rs.getString("boardofdirectors"));
			companyList.add(company);
		}
		}catch(SQLException e){
			System.out.println(e);
			throw e;
		}
		return companyList;
	}

	
	
	
	
	
	
	@Override
	public Company updateCompany(Company company) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void main(String []args) throws Exception{
		CompanyDaoImpl dao=new CompanyDaoImpl();
		//Company compnay=new Company();
		//compnay.setCompanyId(1001);
		//dao.insertCompany(compnay);
		
		System.out.println(dao.getCompanyList());
	}

}
