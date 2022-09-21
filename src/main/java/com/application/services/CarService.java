package com.application.services;

import com.application.entities.Car;
import com.application.repositories.CarRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class CarService {
    
	@Autowired
	private CarRepository carRepository; 
	

	
	public void createOrder(Car car) {
		carRepository.save(car);
	}

    public CarService() { }



	
}
