public class user {
    public static void main(String[] args) {
        access Access = new proxyAccess();

        Access.check("admin");

        Access.check("user");
    }
}
