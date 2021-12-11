import java.util.regex.Pattern;

public class Account {
    // admin, customer, project mangager and service provider
    public static String[] validTypes = {"AD", "CU", "PM", "SP"}; // admin, customer, project mangager and service provider
    public static final String accountVaidationRegex = "[A-z0-9\\._]+@(AD|CU|PM|SP)\\.(eventus)\\.\\w{3}";

    // --------------- static methods ----------------
    public static boolean isValid(String accountString) {
            return Pattern.matches(accountVaidationRegex, accountString);
        }

    // ------------- data members -----------------
    private String acc;
    private String password;
    private String type;
    private Human owner;


    // ------------- constructors -----------------
    Account(String acc, String password) {
        this.acc = acc;
        this.password = password;
    }

    Account(String acc, String password, String type) {
        this(acc, password);
        this.type = type;
    }

    Account(String acc, String password, String type, Human owner) {
        this(acc, password, type);
        this.owner = owner;
    }

    // ------------------- getters and setters --------------

    // acc
    public String getAcc() {
        return this.acc;
    }

    public void setAcc(String acc) {
        this.acc = acc;
    }

    // password
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // type
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // owner
    public Human getOwner() {
        return this.owner;
    }

    public void setOwner(Human owner) {
        this.owner = owner;
    }

    // ------------- methods ------------------
    public void delete() {
        this.acc = "";
        this.password = "";
        this.type = "";
    }

}
