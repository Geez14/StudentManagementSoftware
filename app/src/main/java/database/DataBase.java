package database;

// to make create objects into stream of data and read stream of data
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

// to read file and write file
import java.io.FileInputStream;
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

    // if used local/University roll number, University roll number is unique for every students
    public void removeStudent(long roll, String section, String branch) {
        for (Student s : studentDatatbase) {
            if (s.getRoll() == roll && s.getBranch().equals(branch) && s.getSection().equals(section)) {
                studentDatatbase.remove(s);
                break;
            }
        }
    }
    public void removeStudent(long roll)
    {
        int count = 0;
        for(Student s : studentDatatbase)
        {
            if(s.getRoll() == roll) {
                count++;
            }
        }
    }
    // public void addStudent(
    //         String name,
    //         long roll,
    //         String section,
    //         String branch,
    //         long phoneNumber,
    //         String address,
    //         long registrationNumber) {

    //     Student o = new Student(name,
    //             roll,
    //             section,
    //             branch,
    //             phoneNumber,
    //             address,
    //             registrationNumber);
    //     o.dateOfAdmission = LocalDate.now().toString();
    //     studentDatatbase.add(o);
    // }

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

        // first Sync all the data
        syncDataBase();


        // To be implement by other Enginneer
        try (ObjectInputStream objPrinter = new ObjectInputStream(new FileInputStream("Main.dat"))) {
            Object o1 = objPrinter.readObject();

            // Fixing Unhandeled/Unchecked TypeCasting

            if (o1 instanceof ArrayList<?>) {
                ArrayList<?> al = (ArrayList<?>) o1;

                for (int i = 0; i < al.size(); i++) {
                    Object obj = al.get(i);
                    if (obj instanceof Student) {
                        Student v = (Student) obj;
                        // implement some code to save the file in csv format
                        // make sure the seperator for any data in csv file is ","(comma)
                        // before writing the csv file you have to add heading
                        // eg:- Name,class,roll,....
                        //      akash,5,23423423,....
                        //      kaustavee,5,23432,....
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
