import java.util.Scanner;

public class Main {

    private static final String START_SEQUENCE = "I like";
    private static final String END_SEQUENCE = "!!!";
    private static final String CONTAINS_SEQUENCE = "Java";

    public static void main(String[] args) {
        Scanner inputStream = new Scanner(System.in);
        System.out.println("Введите строку I like Java!!!:");
        String variable = inputStream.nextLine();

        if(variable.startsWith(START_SEQUENCE) && variable.contains(CONTAINS_SEQUENCE) && variable.endsWith(END_SEQUENCE)){
            System.out.println(variable.toUpperCase());
            String replacedString = variable.replace('a', 'o');
            System.out.println(replacedString.substring(replacedString.indexOf("J"), replacedString.indexOf("!")));
        }
    }
}