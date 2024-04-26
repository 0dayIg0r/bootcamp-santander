package edu.igor.firstWeek.FluxControl;

public class simpleFluxControl {
    public static void main(String[] args) {
        double balance = 25.0;
        double withDrawal = 17.0;

        if(withDrawal < balance){
            balance = balance - withDrawal;

            System.out.println(balance);
        }
        
    }
}
