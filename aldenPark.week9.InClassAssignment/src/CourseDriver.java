
import java.util.Scanner;

/**
 * @filename: CourseDriver.java
 * @author: Alden Park
 * @date: 10/24/2017
 * @description: Week 9 In Class Assignment
 */

/**
 * This class crease a Course object and searches for a stud ID with the newly created Course object
 */
public class CourseDriver {
    public static void main(String args[]) 
    {
        Scanner stdIn = new Scanner(System.in);
        int[] ids = {4141, 3001, 6020};
        Course course = new Course("CS101", ids, ids.length);
        int id;         // ID being searched for
        int index;      // index of ID sought or -1 if not found
        
        System.out.print("Enter 4-digit ID: ");
        id = stdIn.nextInt();
        index = course.findStudent(id);
        if(index >= 0) {
            System.out.println("found at index " + index);
        }
        else {
            System.out.println("not found");
        }
    } // end main
} // end class CourseDriver
