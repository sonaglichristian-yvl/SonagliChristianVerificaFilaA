/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sonaglichristianverifica;
import java.util.Scanner;
/*
FILA A
*/
/**
 * 
 * @author sonagli.christian
 */
public class SonagliChristianVerifica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       Prodotto P1;
       Prodotto P2;
       
       P1 = new Prodotto("Lampada", 10, 80, 0);
       P2 = new Prodotto("Divano", 60, 200, 0);
       
       System.out.println("Quale prodotto vuoi gestire? (1 o 2)");
       int prod = scan.nextInt();
   
       int n = 0;     
       while(n == 0)
       {
       System.out.println("\nGESTIONE PRODOTTI");
       System.out.println("1| Vendi prodotto");
       System.out.println("2| Rifornisci");
       System.out.println("3| Info");
       System.out.println("4| Confronta");
       System.out.println("5| Esci");
      
        int i = scan.nextInt();
        switch(i)
        {
            case 1:
                System.out.println("Inserisci quantita' da vendere: ");
                int numV = scan.nextInt();
                if (prod == 1)
                {
                    P1.vendiProdotto(numV);
                } else
                {
                    P2.vendiProdotto(numV);
                }
                break;
            case 2:
                System.out.println("Inserisci quantita' da rifornire: ");
                int numR = scan.nextInt();
                 if (prod == 1)
                {
                    P1.rifornisci(numR);
                } else
                {
                    P2.rifornisci(numR);
                }
                break;
            case 3:
                 if (prod == 1)
                {
                   System.out.println(P1.toString());
                } else
                {
                    System.out.println(P2.toString());
                }
                break;
            case 4:
                if (prod == 1)
                {
                Object obj = P1;
                System.out.println(P1.equals(obj));
                } else
                {
                 Object obj = P2;
                System.out.println(P1.equals(obj));
                }
                break;
            default:
                System.out.println("Esco...");
                n = 1;
                break;

        }
       }

       
       
       
    }
    
}
