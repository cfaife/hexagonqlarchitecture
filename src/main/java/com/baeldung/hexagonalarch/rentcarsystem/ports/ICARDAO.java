package com.baeldung.hexagonalarch.rentcarsystem.ports;

 
import com.baeldung.hexagonalarch.rentcarsystem.logic.Car;

public interface ICARDAO {
	
	  Car findCarByMake(String make);
	
}
