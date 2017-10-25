/**
 * @filename: Course.java
 * @author: Alden Park
 * @date: 10/24/2017
 * @description: Week 9 In Class Assignment
 */

/**
 * This class represents a particular course in school
 */
public class Course {
    private String courseName;  // name of the course
    private int[] ids;          // IDs for students in the course
    private int filledElements; // number of filled-in elements
    
    public Course(String courseName, int[] ids, int filledElements)
    {
        this.courseName = courseName;
        this.ids = ids;
        this.filledElements = filledElements;
    } // end construct
    
    /**
     * This method return index of found ID or -1 if not found
     */
    public int findStudent(int id)
    {
        for(int i=0; i<filledElements; i++) {
            if(ids[i] == id) {
                return i;
            }
        } // end for
        return -1;
    } // end findStudent
} // end class Course
