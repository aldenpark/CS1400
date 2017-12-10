/**
 * @filename: NewCar.java
 * @author: Alden Park
 * @date: 11/16/2017
 * @description: Week 12 Homework Assignment
 */

public class NewCar extends Car {
    private String Color;
    
    public NewCar(double price, String Color)
    {
        super(price);
        this.Color = Color;
    }
    
    public boolean equals(NewCar car) {
        return (car instanceof Car) && getPrice() == car.getPrice() && Color.equals(car.Color);
    }
    
    public void display()
    {
        System.out.println("price = " + getPrice() + ", color = " + Color);
    }
}
