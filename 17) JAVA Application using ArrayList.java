import java.util.ArrayList;
public class ArrayListExample {
public static void main(String[] args) {
ArrayList<String> programmingLanguages = new ArrayList<>(); programmingLanguages.add("C++");
programmingLanguages.add("Java");
programmingLanguages.add("C");
programmingLanguages.add("python");
String languageAtIndex2 = programmingLanguages.get(2); System.out.println("String at index 2: " + languageAtIndex2); // Change the string at index position 2 to "programming" programmingLanguages.set(2, "programming");
System.out.println("Array list after changing element at index 2: " + programmingLanguages);
// Remove the string at index position 0
programmingLanguages.remove(0);
System.out.println("Array list after removing element at index 0: " + programmingLanguages);
}
}
