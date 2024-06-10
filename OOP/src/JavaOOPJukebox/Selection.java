package JavaOOPJukebox;

/*
@JavaOOPJukebox package contains classes of @Jukebox OOP CodingChallenge for practice
OOP concepts linked to OOD (Process of Software design development Guidelines using OOD)
for developing robust, enterprise-level, scalable applications.

The @Jukebox Software Design, leverages:
Basic core functionalities optimized with modularity
Open Foundation for future upgrade and to new extensions of features
1 OOP 4/4 concepts
2 Classes represent real-world entities mapped to real-world @Jukebox:
2.1 Song @Storing song's information @OOD' S SOLID (@SRP)
2.3 Playlist @Manages song queue (@Queue Data Structure)
2.4 CDPlayer @Simulate playing
2.5 User @Interact with the @Jukebox
3 @Selection Interface for selecting songs, and allow multiple implementations

4 To test integrating an external music library via @Selection Interface


 */

public interface Selection { //1
    //2
    public Song selectSong(); //Implemented by all selection mechanics like @RandomSelection @ExternalMusicLibrary
}
