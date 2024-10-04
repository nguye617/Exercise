package studentlist;

/**
 *
 * @author DongNguyen
 */
public class Student {

   private String name;
   private String studentID;
   private String address;

   // Constructor to initialize the student with a name
   public Student(String givenName) {  // Make the constructor public
       this.name = givenName;
   }

   // Getter for 'name'
    public String getName() {
        return name;
    }

    // Setter for 'name'
    public void setName(String name) {
        this.name = name;
    }

    // Getter for 'studentID'
    public String getStudentID() {
        return studentID;
    }

    // Setter for 'studentID'
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    // Getter for 'address'
    public String getAddress() {
        return address;
    }

    // Setter for 'address'
    public void setAddress(String address) {
        this.address = address;
    }
}
