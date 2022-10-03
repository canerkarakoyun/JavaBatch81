package recap01;

import java.util.Locale;
import java.util.Scanner;

public class Q12_IfStatement03 {
    public static void main(String[] args) {
        /*
        Kullanicidan is unvaninin kisaltmasini isteyin ve jobTitle veraiable'ina atayin
        QA = Quality Analyst
        DEV = Developer
        BA = Business Analyst
        PM = Project Manager
        yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen is unvaninizi giriniz");
        String jobTitle= scan.nextLine().toUpperCase(Locale.ROOT);

        if (jobTitle.equals("QA")){
            System.out.println("Quality Analyst");
        } else if (jobTitle.equals("DEV")){
            System.out.println("Developer");
        } else if (jobTitle.equals("BA")){
            System.out.println("Business Analyst");
        } else if (jobTitle.equals("PM")){
            System.out.println("Project Manager");
        } else System.out.println("Lutfen gecerli bir is unvani giriniz");

      switch (jobTitle){
          case "QA":
              System.out.println("Quality Analyst");
              break;
          case "DEV":
              System.out.println("Developer");
              break;
          case "BA" :
              System.out.println("Business Analyst");
              break;
          case "PM":
              System.out.println("Project Manager");
              break;
          default:
              System.out.println("Lutfen gecerli bir is unvani giriniz");
      }
    }
}
