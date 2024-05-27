package abstraction.MovieInterfaceExercise1;

import com.sun.jdi.VMOutOfMemoryException;

//Main class of the java program, phase for use the @Movie Interface
public class MoviePlayer { //1 Only required class def, don't implement @Movie Interface
    //2 Declare Java's program main method (entry point of the app)
    public static void main(String[] args) {
        //3 Create two objects instances of @ComedyMovie @ActionMovie classes by passing args
        //Obj reference variables will hold @Movie Interface DT
        Movie comedy = new ComedyMovie("The Big Lebowski", "Joel Coen", 1998);
        Movie action = new ActionMovie("Fast & Furious", "Justin Lin", "Fast & Furious", 2009);

        //4 Within main method of the program call @playMovie() method, next (comedy) (action);
        playMovie(comedy);
        playMovie(action);
    }

    //5 Declare & init @playMovie method outside of main
    public static void playMovie(Movie movie) { //Display Movies information, and trigger @play() functionality on each movie
        System.out.println("Title:" + movie.getTitle());
        System.out.println("Director:" + movie.getDirector());
        System.out.println("Genre:" + movie.getGenre());
        System.out.println("Year" + movie.getYear());

        //5.1 Call @play() method (functionality) for simulates video playing movie
        movie.play(); //@play() method connect with OOP 2/4 concept of Polymorphism @Shared Behavior of @ComedyMovie @ActionMovie
        System.out.println();
    }
}
