import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int resposta;

        do{
            int fatorial = 1;
            int i = 1;

            System.out.print("Digite o número que deseja fazer o fatorial: ");
            int numero = scanner.nextInt();

            if (numero >= 0) {
                do {
                    fatorial *= i;
                    i++;
                }while (i <= numero);

                System.out.println(fatorial);
            }else{
                System.out.println("Digite um valor acima de 0");
                }
            System.out.print("Deseja calcular outro fatorial? Digite 1 para sim, 0 para não: ");
            resposta = scanner.nextInt();
        }while(resposta == 1);
    }
}