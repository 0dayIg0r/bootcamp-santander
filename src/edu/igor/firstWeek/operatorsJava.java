package edu.igor.firstWeek;

/**
 * operatorsJava
 */
public class operatorsJava {

    public static void main(String[] args) {
        String FullName = "LINGUAGEM" + "JAVA";

        String concat ="?"; 

        concat = 1+"1"+1+1;
        concat = 1+1+1+"1";
        concat = 1+"1"+1+"1";
        concat = "1"+1+1+1;
        concat = "1"+(1+1+1);

        // System.out.println(concat);


         int number = 5;
         
         number = number + 1;;
         number ++;
        //  number --;

        boolean variable = true;
        variable = !variable;

        // System.out.println(variable);


        int a, b;

        a = 5;
        b = 6;

        // String result = "";

        // if(a==b){
        //     result = "True";
        // } else {
        //     result = "False";
        // }

        String result = a==b ? "True" : "False";

        // System.out.println(result);

        int n1 = 1;
        int n2 = 2;

        boolean is = n1 == n2;
        is = n1 < n2;
        is = n1 != n2;
        is = n1 >= n2;
        is = n1 <= n2;

        // System.out.println("N1 É IGUAL A N2 ?" + is);

        String name1 = "Igor";
        String name2 = "Igor";

        // System.out.println(name1.equals(name2));

         boolean condition1 = true;
         boolean condition2 = false;

        if (condition1 && condition2) {
            System.out.println(true);
        }

        if (condition1 || condition2) {
            System.out.println("One of is true");
        }



        

    }

}
