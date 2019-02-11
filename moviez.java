import javax.swing.JOptionPane;

public class moviez {
public static void main(String[] args) {
	Movie Thor = new Movie("Thor", 4);
	Movie BlackPanther = new Movie("BlackPanther", 3);
	Movie TwilightDragon = new Movie("TwilightDragon", 9999999);
	Movie Flash = new Movie("Flash", 10);
	Movie InfinityWar = new Movie("InfinityWar", 20);
String mov =Thor.getTicketPrice();
String tic =BlackPanther.getTicketPrice();

String tick =TwilightDragon.getTicketPrice();

String ticke =Flash.getTicketPrice();

String ticket =InfinityWar.getTicketPrice();

NetflixQueue Shows= new NetflixQueue();
Shows.addMovie(InfinityWar);
Shows.addMovie(Flash);
Shows.addMovie(TwilightDragon);
Shows.addMovie(BlackPanther);
Shows.addMovie(Thor);

Shows.printMovies();
 JOptionPane.showMessageDialog(null, "The best Movies is" +Shows.getBestMovie() );Shows.getBestMovie();
Shows.sortMoviesByRating();
 JOptionPane.showMessageDialog(null, "The Second best movie is" + Shows.getMovie(1));
}
}
