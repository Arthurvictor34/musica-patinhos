import java.util.Scanner;

public class Musica { 
  
  // canção dos patinhos 

  public static void main(String[] args ) {
   Scanner scanner = new Scanner(System.in);
   
   int patinhossumidos = 0;
   int quantidade;

   System.out.print(" Digite a quantidade: ");
   quantidade = scanner.nextInt();

    System.out.println(" ");
   int i = quantidade;

   do {
     patinhossumidos = i - 1;
     System.out.println( " " + i + " patinhos foram passear");
     System.out.println(" Além das montanhas");
     System.out.println(" Para brincar");
     System.out.println(" A mamãe gritou: Quá, quá, quá, quá");
     System.out.println(" Mas só " + patinhossumidos + " patinhos voltaram de lá");
     System.out.println(" ");
     i--;
   } while ( i > 0 );
   
   System.out.println(" ");

   int j = quantidade;
   do {
    System.out.println(" A mamãe patinha foi procurar ");
    System.out.println(" Além das montanhas ");
    System.out.println(" Na beira do mar ");
    System.out.println(" A mamãe gritou: Quá, quá, quá, quá ");
    System.out.println(" E os " + j + " patinhos voltaram de lá.");
    System.out.println(" ");
   } while ( false );
}
} 