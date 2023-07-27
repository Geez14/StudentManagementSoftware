package database;

// to make create objects into stream of data and read stream of data
// import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

// to read file and write file
// import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
// implementing linklist datastructure
// import java.util.List;
import java.util.ArrayList;

// to add some important detail
import java.time.LocalDate;
// import java.time.LocalTime;

// importing the Student class
import container.Student;

public class DataBase {
    private ArrayList<Student> studentDatatbase = new ArrayList<Student>();

    public void addToDataBase(Student obj) {
        studentDatatbase.add(obj);
    }

    public void removeStudent(int roll, String section, String branch) {
        for (Student s : studentDatatbase) {
            if (s.roll == roll && s.branch.equals(branch) && s.section.equals(section)) {
                studentDatatbase.remove(s);
                break;
            }
        }
    }

    public void addStudent(
            String name,
            int roll,
            String section,
            String branch,
            long phoneNumber,
            String address,
            long registrationNumber) {

        Student o = new Student(name,
                roll,
                section,
                branch,
                phoneNumber,
                address,
                registrationNumber);
        o.dateOfAdmission = LocalDate.now().toString();

        studentDatatbase.add(o);
    }

    public void display() {
        // to be implement by other Enginneer
    }

    public void syncDataBase() throws IOException {
        try (ObjectOutputStream objReader = new ObjectOutputStream(new FileOutputStream("Main.dat"))) {
            objReader.writeObject(studentDatatbase);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void saveInCsv() throws IOException {
        // To be implement by other Enginneer
    }


}
