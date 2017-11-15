/**
 * @filename: Person.java
 * @author: Alden Park
 * @date: 11/14/2017
 * @description: Week 12 inClass Assignment
 */

/**
 * This is abase class or an inheritance hierarchy
 */
public class Person {
    private String name = "";
    
    public Person()
    { }
    
    public Person(String name)
    {
        this.name = name;
        
    }
    public String getName()
    {
        return this.name;
    }
}
