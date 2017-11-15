/**
 * @filename: DealershipDriver.java
 * @author: Alden Park
 * @date: 11/14/2017
 * @description: Week 12 inClass Assignment
 */

/**
 * This class demonstrates the car dealership composition
 */
public class DealershipDriver2 {
    public static void main(String args[])
    {
        Manager2 ryne = new Manager2("Ryne Mendez");
        SalesPerson2 nicole = new SalesPerson2("Nicole Betz");
        SalesPerson2 vince = new SalesPerson2("Vince Sola");
        Dealership2 dealership = new Dealership2("OK Used Cars", ryne);
        
        dealership.addPerson(nicole);
        dealership.addPerson(vince);
        dealership.addCard(new Car("GMC"));
        dealership.addCard(new Car("Yugo"));
        dealership.addCard(new Car("Dodge"));
        dealership.printStatus();
    }
}
