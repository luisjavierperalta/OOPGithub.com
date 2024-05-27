package abstraction.MovieInterfaceExercise1;

//2/2 specific movie class implementing the @Movie Interface
//ALGORITHM OF SEQUENTIAL STEPS
public class ActionMovie implements Movie { //1 Declare class @ActionMovie, and add the implements k @Movie

    //2 Declare any private field required by the @ActionMovie
    private String title;
    private String director;
    private String franchise; //Catalog movie can be part of franchises @Avatar1/2
    private int year;

    //3 Define @ActionMovie class Constructor
    public ActionMovie(String title, String director, String franchise, int year) {
        this.title = title;
        this.director = director;
        this.franchise = franchise;
        this.year = year;

    }

    //4 MUST implement all the available @Movie Interface methods with own specifics of @ActionMovie by using @Override annotation
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
        return "Action";
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public void play() {
        //PLACEHOLDER, REQUIRE BUSINESS LOGIC FOR VIDEO PLAYING
        System.out.println("Playing the movie:" + title + "of" + year);
    }


    }


