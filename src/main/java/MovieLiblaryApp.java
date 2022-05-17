import Tools.Menu;
import Tools.UserInputHandler;
import models.Actor;
import models.MovieLibrary;
import models.RandomDataProvider;

public class MovieLiblaryApp {

    public static void main(String[] args) {
            MovieLibrary movieLiblary = new MovieLibrary();
            movieLiblary.fillMovieList();
        while (true){
        Menu.printMenu();
        switch (UserInputHandler.getMenuOptionsFromUser()) {
            case DISPLAYINFORMATIONABOUTRANDOMMOVIE:
                movieLiblary.getRandomMovieInformation();
                break;
            case DISPLAYACTORS:
                movieLiblary.printActorFilmography();
                break;
            case QUIT:
                System.out.println("Bybyby");
                System.exit(1);

        }
        }
    }
}