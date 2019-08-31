package com.baeldung.hexagonalarch.rentcarsystem.ports;
 
import com.baeldung.hexagonalarch.rentcarsystem.logic.Car;
import com.baeldung.hexagonalarch.rentcarsystem.logic.Client;
 
public interface IRentDAO {
	
	void createRent(Car car,  Client client);

}
