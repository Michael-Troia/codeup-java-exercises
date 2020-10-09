package movies;

public class Movie {
// Create a class named Movie. It should have private fields for name and category
    private String name;
    private String category;

// and a constructor that sets both of these.
    public Movie(String aName, String aCategory){//defines the class Movie todo this is a constructor
        this.name = aName;
        this.category = aCategory;
    }
// Create methods to access these properties and change them (getters and setters).
    //todo getters
    public String getName(){ //todo getters don't have parameters (we have access to name)
        return this.name;
    }
    public String getCategory(){
        return this.category;
    }
    //todo setters
    public void setName(String aName){ //todo setters are passed an argument to do something with it
        this.name = aName;
    }
    public void setCategory(String aCategory){
        this.category = aCategory;
    }

}

//    Inside of src, create a directory named movies. Create all of the classes described below in this directory.
//        Download the MoviesArray file and save it as MoviesArray.java inside of movies. This class has a static method named findAll that will return an array of Movie objects.
//        Create a class named MoviesApplication that has a main method.
//        Give the user a list of options for viewing all the movies or viewing movies by category.
//        Use your Input class to get input from the user, and display information based on their choice. (Remember to import your Input class)
//        If a category is selected, only movies from that category should be displayed.
//        Your application should continue to run until the user chooses to exit.
