class Login {
    private String password;

    Login(String password) {
        this.password = password;
    }

    public boolean checkPassword(String input) {
        return password.equals(input);
    }
}

class LoginDemo {
    public static void main(String[] args) {
        Login user = new Login("abc123");

        System.out.println(user.checkPassword("abc123"));
        System.out.println(user.checkPassword("wrong"));
    }
}