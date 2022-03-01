package com.directi.training.srp.exercise_refactored;

import java.util.List;

public interface CarDao {
	public Car findById(String carId);

    public List<Car> findAll();
}
