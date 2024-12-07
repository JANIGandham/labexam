package com.klef.jfsd.exam;

public class ClientDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        // Insert Vehicle Record
        Vehicle vehicle = new Vehicle() {
            {
                setName("Generic Vehicle");
                setType("Utility");
                setMaxSpeed(100);
                setColor("White");
            }
        };
        session.save(vehicle);

        // Insert Car Record
        Car car = new Car();
        car.setName("Sedan");
        car.setType("Car");
        car.setMaxSpeed(180);
        car.setColor("Red");
        car.setNumberOfDoors(4);
        session.save(car);

        // Insert Truck Record
        Truck truck = new Truck();
        truck.setName("Freightliner");
        truck.setType("Truck");
        truck.setMaxSpeed(120);
        truck.setColor("Blue");
        truck.setLoadCapacity(15000);
        session.save(truck);

        transaction.commit();
        session.close();

        System.out.println("Records inserted successfully!");
    }
}
