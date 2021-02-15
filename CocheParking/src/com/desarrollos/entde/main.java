package com.desarrollos.entde;

public class main {
	/**
	 * Method that is being always invoked when the program is running
	 * 
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {

		Garage g = new Garage();
		Car car = new Car(g);
		car.accelerate();
		car.slowDown();
		car.moveDown();
		car.accelerate();
		g.printGarage();

	}

}
