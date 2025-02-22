class Dog {
    String name;
    String breed;

    public Dog(String dogName, String dogBreed) {
        name = dogName;
        breed = dogBreed;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setBreed(String newBreed) {
        breed = newBreed;
    }

    public void display() {
       System.out.println("Dog Name: " + name);
        System.out.println("Breed: " + breed);
        System.out.println();
    }
}

public class DogInfo {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Ace", "Great Dane");
        Dog dog2 = new Dog("Krypto", "Labrador Retriever");

        dog1.setName("Lockjaw");
        dog1.setBreed("Bulldog");
        
        dog1.display();
        dog2.display();
    }
}
