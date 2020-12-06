import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; 

public class encryptDecrypt {

   public static String strToEncrpt;
   public static List<Integer> encryptedStr = new ArrayList<>();

   public encryptDecrypt() {
       // Default construtor
   }

   // Method to encrypt string
   public String toEncrypt() {
       //char[] chars = strToEncrpt.toCharArray();
       for (int i=0; i < strToEncrpt.length(); i++ ) {
            if (i==0) 
            {
                encryptedStr.add((int)(strToEncrpt.charAt(i)));
            }
            else
            {
                //System.out.println("" + (int)strToEncrpt.charAt(i) + " & " + encryptedStr.get(i-1));
                encryptedStr.add((int)strToEncrpt.charAt(i) - (int)strToEncrpt.charAt(i-1));
            }
        }
        System.out.println("The encrypted string is: " );
        System.out.println(encryptedStr);
       return null;
   }

   // Method to decrypt string
   public String toDecrypt() {
       return null;
   }

   // Get string to encrypt method
   public String getStr() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the string to encrypt: ");
        strToEncrpt=sc.nextLine();
        sc.close();
        return null;
    }

   // Main
   public static void main(String args[]) {
       encryptDecrypt newCrypt = new encryptDecrypt();
       newCrypt.getStr();
       //System.out.println(strToEncrpt);
       newCrypt.toEncrypt();

    }


}
