package org.studyeasy;

import org.studyeasy.vehicles.Bike;

public class Demo {

	public static void main(String[] args) {
		Bike bike =new Bike("long", "Deisel", 4, 5, 40, "LED");
		System.out.println("Handle :"+ bike.getHandle());
		System.out.println("Engine type :"+ bike.getEngine());
		System.out.println("Number of seats :"+ bike.getSeats());
		System.out.println("Number og wheels :"+ bike.getWheels());
		System.out.println("fuel tank capacity :"+ bike.getFuleTank());
		System.out.println("Head lamp type :"+ bike.getLights());
		

	}

}
