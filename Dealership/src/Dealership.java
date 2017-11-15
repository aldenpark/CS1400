/**
 * @filename: Dealership.java
 * @author: Alden Park
 * @date: 11/14/2017
 * @description: Week 12 inClass Assignment
 */

import java.util.ArrayList;

/**
 * This represents an auto retail sale organization
 */
public class Dealership {
    private String company;
    private Manager manager;
    private ArrayList<SalesPerson> people = new ArrayList<>();
    private ArrayList<Car> cars = new ArrayList<>();
    
    public Dealership(String company, Manager manager)
    {
        this.company = company;
        this.manager = manager;
    }
    
    public void addCard(Car car)
    {
        cars.add(car);
    }
    
    public void addPerson(SalesPerson person)
    {
        people.add(person);
    }
    
    public void printStatus()
    {
        System.out.println(company + "\t" + manager.getName());
        for(SalesPerson person : people)
            System.out.println(person.getName());
        for(Car car : cars)
            System.out.println(car.getMake());
    }
}
