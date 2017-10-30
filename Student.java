
/**
 * Write a description of class Student here.
 *
 * @author (Milan Oppermann)
 * @version (10/30/17)
 */
public class Student
{
    // instance variables - replace the example below with your own
    private String name;
    private int idNumber;
    private Student bestFriend;

    /**
     * Constructor for objects of class Student
     */
    public Student()
    {
        // initialise instance variables
        
    }
    public Student(int num,String nm) {
        this.idNumber = num;
        this.name = nm;
    }
    
    public int getID() {
        return this.idNumber;
    }
    
    public String toString() {
        return "The student's name is " + this.name;
    }
    
    public int combineIDnumbers() {
        return this.idNumber + bestFriend.idNumber;
    }
    
    public Student newStudent(Student other) {
        Student temp = new Student(other.idNumber, this.name);
        return temp;
    }
    

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */

}
