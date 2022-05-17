package Tools;

import models.Actor;

import java.util.Scanner;

public class UserInputHandler {
    static Scanner scanner = new Scanner(System.in);
    public static MenuOptions getMenuOptionsFromUser(){
return MenuOptions.values()[getSelectedOptionFromUser() -1];
    }
    private static int getSelectedOptionFromUser(){
        int result = gesIntigerFromUser();
        scanner.nextLine();
        if (result>0 && result < 4){
            return result;
        }
        else {
            System.out.println("You selected wrong option. Pleas try again!");
            return gesIntigerFromUser();
        }
    }

    private static int gesIntigerFromUser() {
        while (!scanner.hasNextInt()){
            scanner.nextLine();
            System.out.println("Wrong! It is no intiger! Try again.");
        }
        return scanner.nextInt();
    }


    public static Actor getActorFromUser() {
        System.out.println("Type an actor: ");
        String[] actors = scanner.nextLine().split(" ");
        return new Actor(actors[0], actors[1]);
    }
}
