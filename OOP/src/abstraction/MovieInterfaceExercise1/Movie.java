package abstraction.MovieInterfaceExercise1;

//OOP @Movie Interface within the context of Cinema/Movies
//ALGORITHM SEQUENTIAL CHECKLIST OF STEPS

public interface Movie { //1 Declare Interface class @Movie with access modifier set to @public
    //2 Declare 4x Abstract methods, the @Movie Interface methods, which represent behavior & functionality of each movie @Implementing class
    public String getTitle();
    public String getDirector();
    public String getGenre();
    public int getYear();
    public void play(); //Simulate playing the movie

}
