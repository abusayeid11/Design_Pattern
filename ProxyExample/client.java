import java.util.Scanner;

public class client {
    public static void main(String[] args) {
        int input;
        Scanner sc = new Scanner(System.in);
        proxyAccess req = new proxyAccess();
        while (true) {
            System.out.println("Select role or exit:");
            System.out.println("0(admin)   1(user)   2(exit)");
            System.out.print("PowerShell>");
            input = sc.nextInt();
            sc.nextLine();
            if(input == 2){
                System.out.println("Termianl closed successfully!!!");
                break;
            }
            user.updateRole(input);
            System.out.print("Output ("+ user.role +") > ");
            req.exe(sc.nextLine());

        }
    }
}
