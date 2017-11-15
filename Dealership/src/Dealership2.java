/**
 * @filename: Dealership2.java
 * @author: Alden Park
 * @date: 11/14/2017
 * @description: Week 12 inClass Assignment
 */

import java.util.ArrayList;

/**
 * This represents an auto retail sale organization
 */
public class Dealership2 {
    private String company;
    private Manager2 manager;
    private ArrayList<SalesPerson2> people = new ArrayList<>();
    private ArrayList<Car> cars = new ArrayList<>();
    
    public Dealership2(String company, Manager2 manager)
    {
        this.company = company;
        this.manager = manager;
    }
    
    public void addCard(Car car)
    {
        cars.add(car);
    }
    
    public void addPerson(SalesPerson2 person)
    {
        people.add(person);
    }
    
    public void printStatus()
    {
        System.out.println(company + "\t" + manager.getName());
        for(SalesPerson2 person : people)
            System.out.println(person.getName());
        for(Car car : cars)
            System.out.println(car.getMake());
    }

}
