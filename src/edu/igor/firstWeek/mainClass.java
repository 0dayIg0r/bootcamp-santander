public class mainClass {
    public static void main(String[] args) {
        String firstName = "Igor";
        String lastName = "Freitas";

        String FullName = fullName(firstName, lastName);
        

    }

    public static String fullName(String firstName, String lastName){
        return firstName.concat(" ").concat(lastName);
    }
}
