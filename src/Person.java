public class Person {
    private String name;

    public Person(String name) {
        setName(name);
    }

    // returns the person's name
    public String getName() {
        return this.name;
    }

    // changes the name property to the passed value
    public void setName(String name) {
        this.name = name;
    }

    // prints a message to the console using the person's name
    public void sayHello() {
        System.out.println("My name is " + name);
    }

    public static void main(String[] args) {
        Person jeff = new Person("Jeff");
        jeff.sayHello();
    }
}
