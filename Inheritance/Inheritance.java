package week04.Inheritance;

public class Inheritance {

    public static void main(String[] args) {

        Person p = new Person("Alice", "Brown", "Female");
        Student s = new Student("Bob", "Smith", "Male", "S123");
        PhdStudent phd = new PhdStudent("Charlie", "Lee", "Male",
                                        "P456", "Computer Science", "AI");
        Teacher t = new Teacher("David", "Clark", "Male",
                                "Mathematics", "Algebra");

        System.out.println(p);
        System.out.println(s);
        System.out.println(phd);
        System.out.println(t);

        Student s2 = new Student("Bob", "Smith", "Male", "S123");
        System.out.println("Students equal? " + s.equals(s2));
    }
}


class Person {

    private String firstName;
    private String lastName;
    private String gender;

    public Person(String firstName, String lastName, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getGender() { return gender; }

    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setGender(String gender) { this.gender = gender; }

    @Override
    public String toString() {
        return "Person[firstName=" + firstName +
               ", lastName=" + lastName +
               ", gender=" + gender + "]";
    }

    public boolean equals(Person p) {
        if (p == null) return false;
        return firstName.equals(p.firstName)
            && lastName.equals(p.lastName)
            && gender.equals(p.gender);
    }
}


class Teacher extends Person {

    private String department;
    private String courses;

    public Teacher(String firstName, String lastName, String gender,
                   String department, String courses) {
        super(firstName, lastName, gender);
        this.department = department;
        this.courses = courses;
    }

    public String getDepartment() { return department; }
    public String getCourses() { return courses; }

    public void setDepartment(String department) { this.department = department; }
    public void setCourses(String courses) { this.courses = courses; }

    @Override
    public String toString() {
        return super.toString() +
               ", Teacher[department=" + department +
               ", courses=" + courses + "]";
    }

    public boolean equals(Teacher t) {
        if (t == null) return false;
        return super.equals(t)
            && department.equals(t.department)
            && courses.equals(t.courses);
    }
}


class Student extends Person {

    private String studentId;

    public Student(String firstName, String lastName, String gender, String studentId) {
        super(firstName, lastName, gender);
        this.studentId = studentId;
    }

    public String getStudentId() { return studentId; }
    public void setStudentId(String studentId) { this.studentId = studentId; }

    @Override
    public String toString() {
        return super.toString() +
               ", Student[studentId=" + studentId + "]";
    }

    public boolean equals(Student s) {
        if (s == null) return false;
        return super.equals(s)
            && studentId.equals(s.studentId);
    }
}


class PhdStudent extends Student {

    private String department;
    private String courses;

    public PhdStudent(String firstName, String lastName, String gender,
                      String studentId, String department, String courses) {
        super(firstName, lastName, gender, studentId);
        this.department = department;
        this.courses = courses;
    }

    public String getDepartment() { return department; }
    public String getCourses() { return courses; }

    public void setDepartment(String department) { this.department = department; }
    public void setCourses(String courses) { this.courses = courses; }

    @Override
    public String toString() {
        return super.toString() +
               ", PhdStudent[department=" + department +
               ", courses=" + courses + "]";
    }

    public boolean equals(PhdStudent pStud) {
        if (pStud == null) return false;
        return super.equals(pStud)
            && department.equals(pStud.department)
            && courses.equals(pStud.courses);
    }
}