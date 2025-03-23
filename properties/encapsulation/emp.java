package opps.properties.encapsulation;

class Detail {
    private String name;  // Private variables
    private int age;

    // Setter method (Correct way)
    public void setDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method (Separate methods for name & age)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class emp {
    public static void main(String[] args) {
        Detail obj = new Detail();  // Object creation

        // Setting values using setter
        obj.setDetails("John", 25);

        // Getting values using getter
        System.out.println("Name: " + obj.getName()); // ✅ Output: Name: John
        System.out.println("Age: " + obj.getAge());   // ✅ Output: Age: 25
    }
}
