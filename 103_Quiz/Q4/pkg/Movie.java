package pkg;
public class Movie
{
    String movieName;
    double rating;
    int numRatings;
    int revenue;
    public Movie()
    {
        movieName="Avengers";
        rating=8.0;
        numRatings=33;
        revenue=623357910;
    }
    public Movie(String movieName, double rating, int numRatings, int revenue)
    {
        this.movieName=movieName;
        this.rating=rating;
        this.numRatings=numRatings;
        this.revenue=revenue;
    }

    public void movieToString()
    {
        System.out.println();
        System.out.println("Movie: " + movieName);
        System.out.println("Rating: " + rating);
        System.out.println("Number of Ratings: " + numRatings);
        System.out.println("Revenue: " + revenue);
        System.out.println();
    }
    public String getMovieName()
    {
        return movieName;
    }
    public int getRevenue()
    {
        return revenue;
    }
    public double getRating()
    {
        return rating;
    }
    public void addRating(double rating)
    {
        numRatings++;
        this.rating=(this.rating*(numRatings-1)+rating)/numRatings;
        
    }
    public boolean compareRatings(Movie otherMovie)
    {
       double rating2=otherMovie.getRating();
       if (rating>rating2)
       {
            return true;
       } 
       else
       {
            return false;
       }
    }
    public String revenueToString()
    {
        String revenueString="";
        int rev=revenue;
       while (revenue!=1000)
       {
            int three=rev%1000;
            revenueString=","+three+revenueString;
            rev=rev/1000;
       }
       revenueString=rev+revenueString;
        
        return revenueString;
    }
    public Movie pirateMovie()
    {
        Movie pirated=new Movie(movieName, rating, numRatings, revenue);
        return pirated;
    }

}