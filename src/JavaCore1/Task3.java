package JavaCore1;

//There is a class Person that has two fields: name and age. Your task is to implement the method changeIdentities. It should swap all information (age and name) between two persons p1 and p2.
//It is known that objects p1 and p2 can't be null.
public class Task3 {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        p1.name = "John";
        p2.name = "Jane";
        p1.age = 20;
        p2.age = 30;

        System.out.println(p1 + " | " + p2);
        MakingChanges.changeIdentities(p1, p2);
        System.out.println(p1 + " | " + p2);
    }

    static class Person {
        String name;
        int age;

        @Override
        public String toString() {
            return name + " " + age;
        }
    }

    static class MakingChanges {
        public static void changeIdentities(Person p1, Person p2) {
            String tempName = p1.name;
            int tempAge = p1.age;
            p1.name = p2.name;
            p1.age = p2.age;
            p2.name = tempName;
            p2.age = tempAge;
        }
    }
}
