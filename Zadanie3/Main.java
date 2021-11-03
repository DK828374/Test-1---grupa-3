package pl.edu.uwm.wmii.ewakot.laboratorium00;
import java.lang.StringBuffer;
import java.util.Scanner;
public class Main {
    public static String delete(String str, char c){

        String ne = new String();
        StringBuffer temp = new StringBuffer();
        int x = 0;

        for(int i = 0; i<str.length(); i++){
            if((str.charAt(i)==c)&&(x ==0)){
                temp.append(str.charAt(i));
                x++;
            }
            if((str.charAt(i)!=c) || ((str.charAt(i) == c) && (x == 0))) temp.append(str.charAt(i));
        }
        ne = temp.toString();
        return ne;
    }
    public static void main(String[] args) {

        System.out.println(delete("Jakies zdanie z wieloma literami a", 'a'));
    }
}
