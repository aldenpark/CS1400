/**
 * @filename: DealershipDriver.java
 * @author: Alden Park
 * @date: 11/14/2017
 * @description: Week 12 inClass Assignment
 */

/**
 * This class demonstrates the car dealership composition
 */
public class DealershipDriver {
    public static void main(String args[])
    {
        Manager ryne = new Manager("Ryne Mendez");
        SalesPerson nicole = new SalesPerson("Nicole Betz");
        SalesPerson vince = new SalesPerson("Vince Sola");
        Dealership dealership = new Dealership("OK Used Cars", ryne);
        
        dealership.addPerson(nicole);
        dealership.addPerson(vince);
        dealership.addCard(new Car("GMC"));
        dealership.addCard(new Car("Yugo"));
        dealership.addCard(new Car("Dodge"));
        dealership.printStatus();
    }
}
