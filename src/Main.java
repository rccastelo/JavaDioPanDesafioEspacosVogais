import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strSplit = str.split(" ");
        char[] arrVogais = {'a', 'e', 'i', 'o', 'u'};
        int espacosEmBranco = strSplit.length - 1, quantVogais = 0;

        for (String item : strSplit) {
            int qtdLetras = item.length();

            for (int i = 0; i < qtdLetras; i++) {
                char letra = item.charAt(i);
                char min = Character.toLowerCase(letra);

                for (char c : arrVogais) {
                    if (c == min) {
                        quantVogais++;
                        break;
                    }
                }
            }
        }

        System.out.println("Espacos em branco: " + espacosEmBranco + " Vogais: " + quantVogais);

        sc.close();
    }
}
