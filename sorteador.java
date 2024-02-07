import java.util.*;
public class sorteador{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("SORTEADOR DE NUMEROS MAIS LEGAL DO MUNDO DE 0 A 9!");
        System.out.println("COOLEST NUMBER DRAWER IN THE WORLD FROM 0 TO 9!");
        System.out.println("confirme para começar:");
        System.out.println("confirm to start:");

        sc.nextLine();
        int num1=0,num2=0,num3=0;
        do{
            num1=rand.nextInt(10);
            System.out.print("|"+num1+"|");
            try {
                Thread.sleep(10); // Adiciona um atraso de 1 segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            num2=rand.nextInt(10);
            System.out.print(num2+"|");
            try {
                Thread.sleep(10); // Adiciona um atraso de 1 segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            num3=rand.nextInt(10);
            System.out.println(num3+"|");
            try {
                Thread.sleep(10); // Adiciona um atraso de 1 segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        while(num1!=num2 || num2!=num3 || num1!=num3);
        sc.close();
    }
}