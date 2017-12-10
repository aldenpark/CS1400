/**
 * @filename: UsedCar.java
 * @author: Alden Park
 * @date: 11/16/2017
 * @description: Week 12 Homework Assignment
 */

public class UsedCar extends Car {
    private double mileage = 0;
    
    public UsedCar(double price, double mileage)
    {
        super(price);
        this.mileage = mileage;
    }
    
    public boolean equals(UsedCar car) {
        return (car instanceof Car) && getPrice() == car.getPrice() && mileage == car.mileage;
    }
    
    public void display()
    {
        System.out.println("price = " + getPrice() + ", mileage = " + mileage);
    }
}
