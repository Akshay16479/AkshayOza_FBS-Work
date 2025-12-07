package practiceworkjava;
import java.util.Scanner; 

public class MovieBooking {

    int movieChoice;
    int tickets;
    double totalAmount;

    static int ticketPrice = 200;
    static int maxAvailableTickets = 50;

    String[] movies = {
            "3 Idiots",
            "Dangal",
            "Bahubali 2: The Conclusion",
            "Kabir Singh",
            "Chhichhore",
            "Zindagi Na Milegi Dobara",
            "Tanhaji",
            "Uri: The Surgical Strike",
            "War",
            "Bajrangi Bhaijaan"
    };
    
    
    

    void bookTickets(int movieChoice, int tickets)
            throws InvalidMovieSelectionException,
            InvalidTicketNumberException,
            TicketsSoldOutException
    {

        if (movieChoice < 1 || movieChoice > movies.length) {
            throw new InvalidMovieSelectionException();
        } else {
            System.out.println(movies[movieChoice - 1]);
        }

        if (tickets <= 0) {
            throw new InvalidTicketNumberException();
        } else {
            System.out.println(tickets);
        }

        if (tickets > maxAvailableTickets) {
            throw new TicketsSoldOutException();
        } else {
            System.out.println("Available: " + maxAvailableTickets);
        }

        this.movieChoice = movieChoice;
        this.tickets = tickets;
        this.totalAmount = tickets * ticketPrice;

        maxAvailableTickets -= tickets;

        System.out.println("Booking Successful for \"" + movies[this.movieChoice - 1] + "\"");
        System.out.println("Tickets booked: " + this.tickets);
        System.out.println("Total amount: " + this.totalAmount);
    }

    static int getRemainingTickets() {
        return maxAvailableTickets;
    }
}



class TestMovieBooking {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        MovieBooking m1 = new MovieBooking();

        while (MovieBooking.getRemainingTickets() > 0) {

            System.out.println("\n-------movie menuu------");
            System.out.println("1. 3 Idiots");
            System.out.println("2. Dangal");
            System.out.println("3. Bahubali 2: The Conclusion");
            System.out.println("4. Kabir Singh");
            System.out.println("5. Chhichhore");
            System.out.println("6. Zindagi Na Milegi Dobara");
            System.out.println("7. Tanhaji");
            System.out.println("8. Uri: The Surgical Strike");
            System.out.println("9. War");
            System.out.println("10. Bajrangi Bhaijaan");

            System.out.println("Remaining Tickets: " + MovieBooking.getRemainingTickets());
            System.out.print("Enter movie choice: ");
            int movieChoice = sc.nextInt();

            System.out.print("Enter number of tickets: ");
            int tickets = sc.nextInt();

            try {
                m1.bookTickets(movieChoice, tickets);
            }
            catch (InvalidMovieSelectionException e) {
                System.out.println(e);
            }
            catch (InvalidTicketNumberException e) {
                System.out.println(e);
            }
            catch (TicketsSoldOutException e) {
                System.out.println(e);
            }
        }

        System.out.println("\nSorry! Tickets are sold out.");
    }
}

