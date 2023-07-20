import java.io.*;
import java.util.*;

public class Phonebook {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Map<String, Integer> phoneBook = new HashMap<>();

        int numberOfContacts=input.nextInt();
        input.nextLine();
        for(int i=0; i<numberOfContacts; i++){
            String name = input.nextLine();
            int phoneNumber = input.nextInt();

            phoneBook.put(name, phoneNumber);
            input.nextLine();
        }

        while(input.hasNext()){
            String nameToSearch = input.nextLine();
            Integer phoneNumber = phoneBook.get(nameToSearch);

            if(phoneNumber != null){
                System.out.println(String.format("%s=%s", nameToSearch, phoneNumber));
            } 
            else {
                System.out.println("Not found");
            }
        }
    }
}
