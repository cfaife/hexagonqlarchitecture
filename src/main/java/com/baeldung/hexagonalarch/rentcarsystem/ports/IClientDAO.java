package com.baeldung.hexagonalarch.rentcarsystem.ports;

import com.baeldung.hexagonalarch.rentcarsystem.logic.Client;

public interface IClientDAO {
	
	Client findClientByName(String name); 

}
