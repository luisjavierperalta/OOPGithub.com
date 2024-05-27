package abstraction.MovieInterfaceExercise1;

//1/2 classes which represent specific movies, implementing @Movie Interface
//ALGORITHM OF SEQUENTIAL STEPS
public class ComedyMovie implements Movie {//1 Declare class @ComedyMovie, & add implements K @Movie
    //2 Declare specific @ComedyMovie private fields (2/4 Encapsulation)
    private String title;
    private String director;
    private int year;

    //3 Define @ComedyMovie class Constructor
    public ComedyMovie(String title, String director, int year) {
        this.title = title;
        this.director = director;
        this.year = year;

    }

    //4 MUST Define all the available @Movie Interface methods & add @Override Annotation
    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getDirector() {
        return director;
    }

    @Override
    public String getGenre() {
        return "Comedy";
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public void play() {
        //Simulates playing the movie, print statement act as placeholder
        //REQUIRED BUSINESS LOGIC
        System.out.println("Playing the movie:" + title + "of" + year);
    }
}
