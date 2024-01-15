package lec10_03_java_oop_abstraction_final;

public class VehicleTestFinal {

	public static void main(String[] args) {
		System.out.println("\n--------------------- Regular class Toyota ------------------------\n");
		Toyota toyota = new Toyota(); 
		toyota.toyotaInfo();
		toyota.start();
		toyota.stop();
		toyota.price();
		toyota.brake("abc");
		toyota.battery();
		toyota.honk();
		
		System.out.println("\n--------------------- Interface Car ------------------------\n");
		Car car = new Toyota();
		car.start();
		car.stop();
		car.brake("def");
		car.honk();
		Car.gear();
		
		System.out.println("\n--------------------- Abstract class ElectricCar ------------------------\n");
		ElectricCar electricCar = new Toyota();
		electricCar.battery();
		electricCar.price();
		
		

	}

}
