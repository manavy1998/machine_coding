import java.util.Scanner;


public class Service {

    private static String input(){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();
        str.trim();
        return str;
    }

    public static String scan(){
        String str = input();
        return str;
    }

    public static String scan(String pri){
        print(pri);
        String str = input();
        return str;
    }

    public static void print(String str){
        System.out.println(str);
    }
}
