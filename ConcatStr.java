import java.util.Scanner;

public class ConcatStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String str = sc.nextLine();
        String con = "";
        for(int i = 1;i<s.length();i++){
            con+=s.charAt(i);
        }
        for(int i = 1;i<str.length();i++){
            con+=str.charAt(i);
        }
        System.out.println(con);
    }
}
