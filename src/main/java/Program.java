import Models.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        //Loads the arraylist with test data "Method is at the bottom for test data"
        ArrayList<People> peoples = testData();

        //Gets the user input
        String searchInput = searchPerson();

        //Creates an empty arraylist to add people with the same name or phone number
        ArrayList<People> foundPeoples = new ArrayList<People>();

        People people = new People();

        //Runs through loop if the method findPerson doesnt return null
        //Adds the people value to the new arraylist and removes from the old value.
        //If the value isnt removed, it will find the same output over and over
        while ((people = findPerson(peoples, searchInput)) != null){
            foundPeoples.add(people);
            peoples.remove(people);
        }
        printPeoples(foundPeoples);
    }
    //Prints out the list of peoples, if the list is empty another message will appear
    private static void printPeoples(ArrayList<People> peoples){
        if(peoples.isEmpty())
            System.out.println("Couldnt find any matching persons");
        else {
            for (People people : peoples) {
                System.out.println("Full name: " + people.getFullName());
                System.out.println("Phone number: " + people.getPhoneNumber());
                if (people.getWorkNumber() != null)
                    System.out.println("Work number: " + people.getWorkNumber());
                System.out.println("Adress: " + people.getAdress());
                System.out.println("Date of birth: " + people.getDateOfBirth());
                System.out.println();
            }
        }
    }
    //Loops through all of the peoples and returns the an object when the user input matches either
    // fullname, worknumber or phonenumber
    private static People findPerson(ArrayList<People> peoples, String searchInput){
        for (People people: peoples) {
            if(searchInput.contains(people.getFullName()) || searchInput.equals(people.getPhoneNumber())
                || searchInput.equals(people.getWorkNumber()))
                    return people;
        }
        return null;
    }
    //The user will search for either phonenumber or the fullname
    private static String searchPerson(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Search for person either by phonenumber or their fullname: ");
        String searchInput = scanner.nextLine();
        return searchInput;
    }
    //Returns a list of test data
    private static ArrayList<People> testData() {
        ArrayList<People> peoples = new ArrayList<People>();
        peoples.add(new People("David Stjernqvist", "Roslagsgatan 58", "0761332431", 980122));
        peoples.add(new People("Filip Andersson", "Torpgatan 9", "0761332142", "0722345134", 980907));
        peoples.add(new People("John Doe", "Kungsgatan 4", "0713132111", "07021333333", 720112));
        peoples.add(new People("David Stjernqvist", "Hökvägen 84", "052314214", "0761331111", 980122));
        peoples.add(new People("David Stjernqvist", "Gärdhemsvägen 26", "0761332431", 980122));
        peoples.add(new People("Filip Andersson", "Gärdhemsvägen 10", "0761332142", 980907));
        peoples.add(new People("John Smith", "Drottninggatan 3", "07132112434", "071623131", 890231));
        peoples.add(new People("Daniella Andersson", "Gärdhemsvägen 20", "0761332423", 981122));
        peoples.add(new People("Filip Smith", "Gärdhemsvägen 10", "0761332142", 980907));
        peoples.add(new People("John Johnson", "Drottninggatan 1", "07132112421", "071623113", 810231));
        return peoples;
    }
}
