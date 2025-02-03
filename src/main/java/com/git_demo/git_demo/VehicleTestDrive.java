public class VehicleTestDrive {
    // Method to test drive a vehicle
    public static void vehicleTestDrive(Vehicle vehicle) {
        vehicle.startEngine();
    }

    public static void main(String[] args) {
        // Creating objects of Car and Motorcycle
        Vehicle myCar = new Car();
        Vehicle myMotorcycle = new Motorcycle();
        
        // Test driving the vehicles
        System.out.println("Test Driving Car:");
        vehicleTestDrive(myCar);
        
        System.out.println("\nTest Driving Motorcycle:");
        vehicleTestDrive(myMotorcycle);
    }
}
