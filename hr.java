package hr;

public class Employee {
    public String publicData = "Public Data";
    protected String protectedData = "Protected Data";
    private String privateData = "Private Data";

    public void showPrivate() {
        System.out.println("Private: " + privateData);
    }
}