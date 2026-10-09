// 4. Design a robust student management system using exception
// handling with given instructions and features.
// ○ Create custom exceptions: InvalidMarksException,
// InvalidRollNumberException, StudentNotFoundException.
// ○ Student class with roll number, name, marks in three subjects.
// ○ Method validateMarks(int marks) throws InvalidMarksException
// if marks <0 or >100.
// ○ Method findStudent(int roll, Student[] students) throws
// StudentNotFoundException.
// ○ In main, accept student details using Scanner, handle
// exceptions with proper messages.
// ○ Use finally to close the Scanner resource.

import java.util.Scanner;

// ---------- Custom Exceptions ----------
class InvalidMarksException extends Exception {

    public InvalidMarksException(String message) {
        super(message);
    }
}

class InvalidRollNumberException extends Exception {

    public InvalidRollNumberException(String message) {
        super(message);
    }
}

class StudentNotFoundException extends Exception {

    public StudentNotFoundException(String message) {
        super(message);
    }
}

// ---------- Student Class ----------
class Student {

    private int rollNumber;
    private String name;
    private int[] marks = new int[3]; // three subjects

    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setMark(int subjectIndex, int mark) {
        marks[subjectIndex] = mark;
    }

    public int[] getMarks() {
        return marks;
    }

    public double getAverage() {
        int sum = 0;
        for (int m : marks) {
            sum += m;
        }
        return sum / 3.0;
    }

    // Validates a single mark value
    public static void validateMarks(int marks) throws InvalidMarksException {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException(
                    "Invalid marks: " + marks + ". Marks must be between 0 and 100."
            );
        }
    }

    // Validates roll number is positive
    public static void validateRollNumber(int roll) throws InvalidRollNumberException {
        if (roll <= 0) {
            throw new InvalidRollNumberException(
                    "Invalid roll number: " + roll + ". Roll number must be positive."
            );
        }
    }

    // Searches for a student by roll number in the array
    public static Student findStudent(int roll, Student[] students) throws StudentNotFoundException {
        for (Student s : students) {
            if (s != null && s.getRollNumber() == roll) {
                return s;
            }
        }
        throw new StudentNotFoundException("No student found with roll number: " + roll);
    }

    public void display() {
        System.out.println("Roll No: " + rollNumber + " | Name: " + name
                + " | Marks: " + marks[0] + ", " + marks[1] + ", " + marks[2]
                + " | Average: " + String.format("%.2f", getAverage()));
    }
}

// ---------- Main Class ----------
public class StudentManagementSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalStudents = 0;
        Student[] students = null;

        try {
            System.out.print("Enter number of students: ");
            totalStudents = Integer.parseInt(scanner.nextLine().trim());

            if (totalStudents <= 0) {
                System.out.println("Number of students must be positive. Exiting.");
                return;
            }

            students = new Student[totalStudents];

            // ---- Data entry loop ----
            for (int i = 0; i < totalStudents; i++) {
                System.out.println("\n--- Entering details for Student " + (i + 1) + " ---");

                int roll = 0;
                boolean validRoll = false;

                // Keep asking until a valid roll number is entered
                while (!validRoll) {
                    try {
                        System.out.print("Enter roll number: ");
                        roll = Integer.parseInt(scanner.nextLine().trim());
                        Student.validateRollNumber(roll);
                        validRoll = true;
                    } catch (InvalidRollNumberException e) {
                        System.out.println("Error: " + e.getMessage() + " Please try again.");
                    } catch (NumberFormatException e) {
                        System.out.println("Error: Roll number must be a whole number. Please try again.");
                    }
                }

                System.out.print("Enter name: ");
                String name = scanner.nextLine().trim();

                Student student = new Student(roll, name);

                // Enter marks for 3 subjects, each individually validated
                for (int subject = 0; subject < 3; subject++) {
                    boolean validMark = false;
                    while (!validMark) {
                        try {
                            System.out.print("Enter marks for subject " + (subject + 1) + ": ");
                            int mark = Integer.parseInt(scanner.nextLine().trim());
                            Student.validateMarks(mark);
                            student.setMark(subject, mark);
                            validMark = true;
                        } catch (InvalidMarksException e) {
                            System.out.println("Error: " + e.getMessage() + " Please re-enter.");
                        } catch (NumberFormatException e) {
                            System.out.println("Error: Marks must be a whole number. Please try again.");
                        }
                    }
                }

                students[i] = student;
            }

            // ---- Display all students ----
            System.out.println("\n=== All Student Records ===");
            for (Student s : students) {
                s.display();
            }

            // ---- Search for a student ----
            System.out.print("\nEnter roll number to search: ");
            int searchRoll = Integer.parseInt(scanner.nextLine().trim());

            try {
                Student found = Student.findStudent(searchRoll, students);
                System.out.println("Student found:");
                found.display();
            } catch (StudentNotFoundException e) {
                System.out.println("Error: " + e.getMessage());
            }

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid numeric input.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            System.out.println("\nClosing Scanner resource.");
            scanner.close();
        }

        System.out.println("Program execution completed.");
    }
}
