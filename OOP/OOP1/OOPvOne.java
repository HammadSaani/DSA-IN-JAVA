package OOP.OOP1;

public class OOPvOne {
    public static void main(String[] args) {
        Student Hammad = new Student("Hamad", 56, 90);
        Student Hassan = new Student("Hassan", 2, 96);
        Student random = new Student(Hammad);
        System.out.println("---");
        random.greeting();
//        System.out.println(Hammad);
        Hammad.changeName("Hammad");
//        Hammad.greeting();
//        Hassan.greeting();
        Student random2 = new Student();
        System.out.println("------");
        random2.greeting();
        System.out.println("Reference Checking");
        Student random3 = Hassan;
        random3.changeName("Random3 Name");
//        System.out.println(Hassan.name);
        Hassan.greeting();
    }
}

class   Student{
    String name;
    int rollNumber;
    int marks;

//    String nam,int rollNum,int mrks
    Student(String nam,int rollNum,int mrks) {
        this.name = nam;
        this.rollNumber = rollNum;
        this.marks = mrks;
    }

    void greeting(){
        System.out.println("My name is " + this.name);
    }

    void changeName(String nam){
        this.name = nam;
    }

    Student (Student othertest){
        this.name = othertest.name;
        this.rollNumber = othertest.rollNumber;
        this.marks = othertest.rollNumber;
    }

//  Constructor Calling other Constructor
    Student (){
        this ("NoName", 0, 0);
    }

}
