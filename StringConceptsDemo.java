public class StringConceptsDemo {
    public static void main(String[] args) {
        // Interning
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");

        System.out.println("Interning:");
        System.out.println("str1 == str2: " + (str1 == str2)); 
        System.out.println("str1 == str3: " + (str1 == str3));
        System.out.println("str1.equals(str3): " + str1.equals(str3)); 
        System.out.println();

    
        String original = "Java";
        String modified = original.concat(" Programming");

        System.out.println("Immutability:");
        System.out.println("original: " + original);
        System.out.println("modified: " + modified);
        System.out.println();

        // equals vs ==
        String a = "Test";
        String b = new String("Test");

        System.out.println("equals vs ==:");
        System.out.println("a == b: " + (a == b)); 
        System.out.println("a.equals(b): " + a.equals(b)); 
        System.out.println();

       
        String[] fruits = {"apple", "banana", "cherry"};
        System.out.println("Original array:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

  
        fruits[1] = "blueberry";
        System.out.println("\nModified array:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
