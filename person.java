class Person {
    String name;
    int age;
    String address;

    public Person(String personName, int personAge, String personAddress) {
        name = personName;
        age = personAge;
        address = personAddress;
    }

    public void display() {
        System.out.println(name + " - " + age);
    }
}

public class PersonMain {
    public static void main(String[] args) {
        Person p1 = new Person("Dick", 25, "Bludhaven");
        Person p2 = new Person("Wally", 26, "Keystone");
        Person p3 = new Person("Garth", 24, "Atlantis");
        Person p4 = new Person("Donna", 150, "Themyscira");
        Person p5 = new Person("Roy", 28, "Star");
        
        p1.display();
        p2.display();
        p3.display();
        p4.display();
        p5.display();
    }
}