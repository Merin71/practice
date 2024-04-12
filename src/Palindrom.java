import java.util.Scanner;

public class Palindrom {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value:");
        int n = sc.nextInt();

        int reversedNumber = 0;
        int originalNumber = n;
        while(n>0){
            int i = n % 10;
            reversedNumber = (reversedNumber * 10) + i;
            n = n / 10;
        }
        if(originalNumber == reversedNumber){
            System.out.println(reversedNumber + " is a palindrom");
        }
        else{
            System.out.println(reversedNumber + " not a palindrom");
        }
// similar for reverse number
        // enter new value use scanner
        // reversvalue = 0;
        // while( n!=0){
        //  int i = n % 10;
        // reversValue = reverseValue * 10 + i;
        // n = n / 10;
        //sout("reversevalue " + reverseValue);

        int r,sum=0,temp;
        int a = 242;
        temp = a;
        while(a>0){
            r = a % 10;
            sum = sum * 10 + r;
            a = a / 10;
        }
        if(temp == sum){
            System.out.println( sum + " palindrome number");
        }
        else{
            System.out.println("not a palindrome");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = scanner.nextLine();
        String reverseStr = "";
        for(int i = str.length() - 1 ; i >= 0; i--){
            reverseStr += str.charAt(i);
        }
        if(str.toLowerCase().equals((reverseStr.toLowerCase()))){
            System.out.println(reverseStr + " is a palindrome");
        }
        else{
            System.out.println("not palindromre");
        }

        String str2 = "Hello World"; // The string to be reversed
        String reversedStr2 = "";

        // Iterate through the characters of the string in reverse order
        for (int i = str2.length() - 1; i >= 0; i--) {
            reversedStr2 += str2.charAt(i); // Append each character to the reversed string
        }

        System.out.println("Original string: " + str2);
        System.out.println("Reversed string: " + reversedStr2);

}
}
