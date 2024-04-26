package edu.igor.firstWeek.FluxControl.estructureRepetitions;

public class ForArray {
    public static void main(String[] args) {
        String students[] = { "A", "B", "C", "D" };

        // for (int x = 0; x<students.length; x++){
        // System.out.println("NOME DO ALUNO: " + students[x]);
        // //UTILIZAR BREAKPOINT
        // }

        for (String student : students) {
            System.out.println("Nome do aluno: " + student);
        }
    }
}
