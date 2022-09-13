import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // CONDITIONAL STATEMENTS AND LOOPS
//        for(i=1; i < 6; i ++){
//            System.out.print(i + "\t");
//        }
//        int i = 1;
//        do{
//            System.out.print((i++) + "\t");
//        }while(i < 6);
//
//        for(int i = 0; i < 5; i++ ){
//            for(int j = i; j < 5; j++){
//                System.out.print("x");
//            }
//            System.out.println();
//        }


//        int sum=0;
//        for(int i = 1; i <= 10; i++ ){
//            sum += i;
//        }
//        System.out.println("The sum of first ten natural numbers is: " + sum);


        //CIRCLE IN JAVA

//        int rad = 20;
//        double dist;
//
//        for(int i = 0; i <= 2*rad; i++){
//            for(int j = 0; j <= 2*rad; j++){
//                dist = Math.sqrt((i - rad)*(i - rad) + (j - rad)*(j - rad));
//                if(dist > rad - 0.5 && dist < rad + 0.5)
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
//            System.out.println();
//        }


//        int a, sum=0, x;
//        a = sc.nextInt();
//        x = a;
//        while(a > 0){
//            sum = sum*10 + a%10;
//            a/=10;
//        }
//
//        if(sum == x) System.out.println("Palindrome!!");
//        else System.out.println("Not Palindrome!!");

//

        // STRING CONCATENATION

//        String name, age;
//        System.out.print("Enter the name and age :");
//        name = sc.next();
//        age = sc.next();
//        System.out.println("Your Name is : "+name);
//        System.out.println("Your age is : " + age);


        //CURRENCY CONVERTER
//        float inr;
//        inr = sc.nextFloat();
//        System.out.println("USD : "+ (inr/79.17) + "\nBritish Pound : " + (inr/92.52) + "\nZEN : " + (inr/70));

//        String str;
//        char ch;
//        str = sc.next();
//        String result = "";
//        for (int i=0; i<str.length(); i++)
//        {
//            ch= str.charAt(i);
//            result = ch + result;
//        }
//        System.out.println("Reversed word: "+ result);


        //EXCEPTION HANDLING

//        try{
//            int i;
//            int[] arr = new int[3];
//            for(i = 0; i < 10; i++){
//                arr[i] = sc.nextInt();
//            }
//        }
//        catch(Exception e){
//            System.out.println("SOMETHING WENT WRONG! ");
//        }

//        int x = 27;
//        double y = Math.sqrt((double)27);
//        System.out.println("Root mean square is : " + y);

        //CUSTOM METHODS using . notation or ()notation
        //sum(189, 274);
        //sum(198.90f, 278.87f);


//    public static void sum(int a, int b) {
//        int sum = a + b;
//        System.out.println("Integer sum : " + sum);
//    }
//
//    public static void sum(float a, float b){
//        float sum = a + b;
//        System.out.println("Float sum : " + sum);

        //===============================================
        //===============================================



        //1
//        String str, str2 = "";
//        char temp;
//        str = sc.next();
//        int i;
//        for(i = 0; i<str.length(); i++){
//            temp = str.charAt(i);
//            str2 = temp + str2;
//        }
//
//        System.out.print("Original String: " + str);
//        System.out.print("New String : " + str2);




        //===================================================

//        //3
//        int n , first = 0, second = 1, flag;
//        System.out.print("Enter the value of n : ");
//        n = sc.nextInt();
//        System.out.println("The Fibonacci Series till " + n + "number of terms: ");
//        int i = 1;
//        for (i = 1; i <= n; ++i)
//        {
//            System.out.print(first + "  ");
//            flag = first + second;
//            first = second;
//            second = flag;
//        }

        //===================================================

        //5

        int n, i, temp;
        System.out.print("Enter the number of terms in the array : ");
        n = sc.nextInt();
        int j = n-1;
        int x = n;
        int[] arr = new int[n];
        int[] res = new int[n];
        for(i = 0; i < n; i++){
            System.out.print("Enter no. " + (i+1) + " : ");
            arr[i] = sc.nextInt();
            res[j] = arr[i];
            j--;
        }
        System.out.println("THE NEW ARRAY: ");
        for(i = 0; i < x; i++){
            System.out.print(" " +res[i]+" ");
        }


        //=========================================================


        // 7
//        int x;
//        System.out.println("Enter an integer : ");
//        x = sc.nextInt();
//        String str;
//        System.out.println("Enter a String : ");
//        str = sc.next();
//        String y = Integer.toString(x);
//        System.out.println("Integer to String : " + y);
//        int str2 = Integer.parseInt(str);
//        System.out.println("String to Integer : " + str2);


        //=======================================================

        //9

//        int n, i, temp;
//        System.out.print("Enter the number of element in the array: \n=================================\n");
//        n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.println("ENTER THE VALUES : \n======================================");
//        for(i = 0; i < n; i++){
//            temp = sc.nextInt();
//            arr[i] = temp;
//        }
//        System.out.println("\n=============================== \n THE ARRAY IS : \n=============================== ");
//
//        for(int flag : arr)
//        {
//            System.out.print(" " + flag + ",");
//        }

    }
}