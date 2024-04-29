package edu.igor.firstWeek.FluxControl.estructureRepetitions.exeptionalsSctructure;

import java.text.ParseException;

public class formatadorDeCep {

   public static void main(String[] args) {
      try {
         String cepFormatado = formatarCep("71687434");
      } catch (CepInvalidoException e) {
         System.out.println("O cep precisa está de acordo com as regras");
      }
      
   }

   static String formatarCep(String cep) throws CepInvalidoException {
      if (cep.length() != 8)
         throw new CepInvalidoException();

      // simulando um cep formatado
      return "23.765-064";
   }
}
