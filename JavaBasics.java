public class JavaBasics {
    public static void main(String[] args){
        System.out.println("Hello World");
        String firstName = "bobby";
        String lastName = "brown";
        System.out.println(firstName + " " + lastName);
        int age = 54;
        boolean isBald = false;
        double weight = 175;
        char grade = 'D';
        System.out.println("Name: " + firstName + " " + lastName + "\n" + "Age: " + age +isBald + grade);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        // System.out.println(age.MIN_VALUE);

        if(weight < 100){
            System.out.println("You need to gain weight.");
        } else {
            System.out.println("You good.");
        }

        System.out.println(weight < 100 ? "Need to gain" : "You good.");

        String fullName = "Bobby Brown";
        System.out.println(fullName.length());

        String greeting = String.format("Hi %s, you are %d years old.", fullName, age);
        System.out.println(greeting);
    }
}