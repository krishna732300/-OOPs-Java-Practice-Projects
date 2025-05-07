class Person {

  String nationality = "Indian";

  Person() {
    System.out.println("in constructor");
  }

}

class StudentRecord extends Person {
  String StudentName;
  int rollNo;
  int[] marks;

  StudentRecord(String StudentName, int rollNo, int[] marks) {
    super();
    this.StudentName = StudentName;
    this.rollNo = rollNo;
    this.marks = marks;
  }

  public double calavg() {
    int s = 0;
    for (int mark : marks) {
      s += mark;
    }
    return (double) s / marks.length;
  }

  public void displayStudentDetails() {
    System.out.println("Name: " + StudentName);
    System.out.println("Roll No: " + rollNo);
    System.out.print("Marks: ");
    for (int mark : marks) {
      System.out.print(mark + " ");
    }
    System.out.println();
    System.out.println("Average: " + calavg());
  }

  // Static method to show grading rules
  public static void displayGradingRules() {
    System.out.println("\n📘 Grading Rules:");
    System.out.println("Above 90   = A");
    System.out.println("80 - 89    = B");
    System.out.println("70 - 79    = C");
    System.out.println("60 - 69    = D");
    System.out.println("Below 60   = F");
  }
}

public class Main {
  public static void main(String[] args) {
    int[] marks = { 95, 88, 91, 85, 90 }; // Sample marks

    StudentRecord student1 = new StudentRecord("Ravi Kumar", 101, marks);
    student1.displayStudentDetails();

    StudentRecord.displayGradingRules();
  }

}
