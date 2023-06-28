public class greetMe {
    public static String greet(String name) {
        String Name = name.toLowerCase();
        String cap = Name.substring(0, 1).toUpperCase() + Name.substring(1);

        return "Hello " + cap + "!";
    }
}

/*
Write a method that takes one argument as name and then greets that name, capitalized and ends with an exclamation point.

Example:

"riley" --> "Hello Riley!"
"JACK"  --> "Hello Jack!"
 */