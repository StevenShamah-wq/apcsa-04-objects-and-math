public class ObjectLab {
    public static void main(String[] args) {
        // 1. Create rex (Rex, 3) and mia (Mia). Print names and ages.
        // 2. Alias: Pet copy = rex; copy.birthday(); print both ages.
        // 3. A separate Pet twin with the same values. Print its age.
        // 4. copy = null; then try copy.getName().
    }
}

// Given class. Read it, do not edit it. You will write classes like this in Unit 5.
class Pet {
    private String name;
    private int age;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Pet(String name) {
        this.name = name;
        this.age = 1;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public void birthday() { age++; }
}
