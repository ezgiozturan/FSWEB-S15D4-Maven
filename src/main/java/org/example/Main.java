package org.example;


public class Main {
    public static void main(String[] args) {

        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("Racecar"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Was it a car r a cat I saw ?"));


        WorkintechList<String> list = new WorkintechList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Watermelon");
        list.add("Cherry");
        list.add("Apple");

        System.out.println("List:" + list);

        list.sort();
        System.out.println("Sorted List:" + list);

         list.remove("Banana");
        System.out.println("After remove list:" + list);

    }

    public static boolean checkForPalindrome(String input) {
        String cleanInput = input.replaceAll("[^a-zA-Z]", "").toLowerCase();

        String reversed = new StringBuilder(cleanInput).reverse().toString();
        return cleanInput.equals(reversed);
    }

    public static String convertDecimalToBinary(int decimalNumber) {
       return Integer.toBinaryString(decimalNumber);


    }

}