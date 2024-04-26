package edu.igor.firstWeek.FluxControl;

public class compostedCondition {
    public static void main(String[] args) {
        int note = 6;

        if (note >= 7) {
            System.out.println("APROVADO");
        } else if (note >= 5 && note < 7) {
            System.out.println("RECUPERAÇÃO");
        }
    }
}
