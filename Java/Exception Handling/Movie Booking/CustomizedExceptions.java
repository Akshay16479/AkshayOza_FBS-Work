package practiceworkjava;

public class InvalidMovieSelectionException extends Exception {
    public String toString() {
        return "Invalid movie selection! Please choose a valid movie.";
    }
}



package practiceworkjava;

public class InvalidTicketNumberException extends Exception {
    public String toString() {
        return "Invalid ticket number! Enter more than 0.";
    }
}



package practiceworkjava;

public class TicketsSoldOutException extends Exception {
    public String toString() {
        return "Tickets not available for requested quantity!";
    }
}

