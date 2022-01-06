package OPPRevision.generics;

class Student<T>{
    T age;
    Student(T age){
        this.age = age;
    }
    public void display() {
        System.out.println("Value of age: "+this.age);
    }

    public static void main(String[] args) {
        Student<Float> std = new Student<Float>(25.5f);
        std.display();
    }
}