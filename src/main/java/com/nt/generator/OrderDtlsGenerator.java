package com.nt.generator;


import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class OrderDtlsGenerator implements IdentifierGenerator {

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
         Connection con=null;
         int val=0;
         String prefix="OD";
        
         
         
         try {
        	 //create Connection to session
        	 con=session.connection();
        	 //create Ststement
        	java.sql.Statement stmt = con.createStatement();
        	//execute the query
        	ResultSet rs = stmt.executeQuery("SELECT ORDER_ID_SEQ.NEXTVAL FROM DUAL");
        	if(rs.next()) {
        		val=rs.getInt(1);
        		
        	}
        			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return prefix + val;
	}
	

}//class
