
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int containerOne = 0;
        int containerTwo = 0;
        int maxNumOfLiquid = 100;
        
        while (true) {
            
            System.out.println("First: " + containerOne + "/" + maxNumOfLiquid);
            System.out.println("Second: " + containerTwo + "/" + maxNumOfLiquid);
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
             String[] arg = input.split(" ");
            int numOfLiquid = Integer.valueOf(arg[1]);
            
            if(arg[0].equals("add")){
                for (int i = 1; i <= maxNumOfLiquid; i++) {
                   if (containerOne < 100) {
                      containerOne++;
                   }
                   if (i == numOfLiquid) {
                       break;
                    }
                }
            } else if(arg[0].equals("move")) {
                int auxiliar = containerOne;
                int contAuxiliar = 0;
                for (int i = containerOne - 1; i >= 0; i--) {
                    if (containerOne > 0) {
                       containerOne--;
                       contAuxiliar++;
                    }

                    if (i == (auxiliar - numOfLiquid)) {
                       break;
                    }
                }
                for (int i = 1; i <= maxNumOfLiquid; i++) {
                      if (containerTwo < 100) {
                        containerTwo++;
                      }
                      if (i == contAuxiliar) {
                         break;
                      }
                   }
                 } else if(arg[0].equals("remove")) {
                     int auxiliar = containerTwo;
                    for (int i = containerTwo - 1; i >= 0; i--) {
                        if (containerTwo > 0) {
                            containerTwo--;
                        }

                        if (i == (auxiliar - numOfLiquid)) {
                            break;
                        }
                    }
                 }
         System.out.println();

        }
    }

}
