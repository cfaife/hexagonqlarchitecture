package com.baeldung.hexagonalarch.rentcarsystem.adapter;
 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.baeldung.hexagonalarch.rentcarsystem.logic.Car;
import com.baeldung.hexagonalarch.rentcarsystem.logic.Client;
import com.baeldung.hexagonalarch.rentcarsystem.logic.Rent;
import com.baeldung.hexagonalarch.rentcarsystem.logic.RentCreator;
import com.baeldung.hexagonalarch.rentcarsystem.ports.IRentDAO;

public class RentDAOImpl implements IRentDAO{
	 
	@Override
	public  void createRent(Car car,  Client client) {
		Rent rent = RentCreator.createRent(car, client);
		
		try (Connection conn = new  ConfigConnection().getConnetion();
				PreparedStatement stmt = conn.prepareStatement("insert into  rent values ('"+rent.getRentTime()+"',1,1,'"+rent.getCode()+"')"))
		{ 
			stmt.executeUpdate();	
	 		
		} catch (SQLException e) {
			// implemetatation here
			 
		}	
 		
	}

}
