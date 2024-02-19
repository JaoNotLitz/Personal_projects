//estou terminando o código
//this code is not totality ready yet
import java.util.Random;
import java.util.Scanner;
import java.lang.Thread;

public class helloworld {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        char randomChar;
        System.out.println("digite a palavra");
        String palavra = sc.nextLine();

        String[] array = palavra.split("");
        String formacao = "";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.println(palavra);
            } else{
            if (array[i].charAt(0) == ' ') {
                formacao += ' ';
            } else {
                do {
                    randomChar = (char) ('a' + Math.abs(random.nextInt()) % 26);

                    if (randomChar == array[i].charAt(0)) {
                        formacao += randomChar;
                    }
                    System.out.println(formacao + randomChar);
                    Thread.sleep(10);
                } while (randomChar != array[i].charAt(0));
            }
        }
        sc.close();
    }
}
}
