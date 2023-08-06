public class Student {
    private static long lastRoll = 33200121000L;

    public long regNo;
    public long rollNo;

    public String name;

    Student() {}

    Student(String name) {
        this.name = name;
        regNo = Magic.genRegNo();
        rollNo = ++lastRoll;
    }
}
