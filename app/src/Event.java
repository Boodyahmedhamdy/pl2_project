import java.time.LocalDate; // to use date
import java.util.ArrayList; // to make list of customers that they will attend the Event
import java.util.List; // important interface to use ArrayList

public class Event {

    // static members of the class itself
    private static int idOFCurrentEvent = 0;


    // data members for objects from this class
    private int id;

    private String name;
    private String subject;
    private String description;

    private LocalDate date;

    private int numberOfTickets;
    private int numberOfAvailableTickets = numberOfTickets;

    private ServiceProvider maker;
    private ProjectManager manager;


    private List<Customer> attendees = new ArrayList<Customer>();
    private List<Integer> attendeesIDs = new ArrayList<Integer>();



    // constructors

    Event() {
        // in case of empty fields .. the default values

        this.id = idOFCurrentEvent;

        this.name = "eventName";
        this.description = "eventDescription";
        this.subject = "eventSubject";

        this.date = LocalDate.now();
        this.numberOfTickets = 0;
        this.numberOfAvailableTickets = 0;

        idOFCurrentEvent++;
    }

    Event(String name) {
        this.id = idOFCurrentEvent;
        this.name = name;
        idOFCurrentEvent++;
    }

    Event(String name, String subject) {
        this(name);
        this.subject = subject;
    }

    Event(String name,String subject, String description) {
        this(name, subject);
        this.description = description;
    }

    Event(String name,String subject, String description, int numberOfTickets) {
        this(name, subject, description);
        this.numberOfTickets = numberOfTickets;
    }

    // end of constructors
    // -------------------------------------

    // getters and setter of all private members
    // -------------------------------------
    // id
    public int getId() {
        return this.id;
    }


    // name
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // subject
    public String getSubject() {
        return this.subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }

    // description
    public String getDescription() {
        return this.description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    // date
    public LocalDate getDate() {
        return this.date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }

    // number of tickets
    public int getNumberOfTickets() {
        return this.numberOfTickets;
    }
    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    // number of available tickets
    public void setNumberOfAvailableTickets(int numberOfAvailableTickets) {
        this.numberOfAvailableTickets = numberOfAvailableTickets;
    }
    public int getNumberOfAvailableTickets() {
        return this.numberOfAvailableTickets;
    }

    // attendees
    public List<Customer> getAttendees() {
        return this.attendees;
    }

    // attendees id
    public List<Integer> getAttendeesIDs() {
        return this.attendeesIDs;
    }

    // project manager
    public void setProjectManager(ProjectManager manager) {
        this.manager = manager;
    }
    public ProjectManager getManager() {
        return this.manager;
    }

    // service provider
    public ServiceProvider getMaker() {
        return this.maker;
    }
    public void setMaker(ServiceProvider maker) {
        this.maker = maker;
    }

    // end of getters and setters
    // ------------------------------------------
    // the functionality of the class .. working with data members



    public void showAllAttendees() {
//        for(Customer attendee : this.attendees)
//        {
//            System.out.println(attendee.show());
//        }
    }



}