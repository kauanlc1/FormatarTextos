import java.util.Scanner;

public class Formatador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um texto: ");
        String texto = scanner.nextLine();

        String textoFormatado = formatarTexto(texto);
        System.out.println("Texto formatado: " + textoFormatado);

        scanner.close(); 
    }

    public static String formatarTexto(String texto) {
        String[] palavras = texto.split(" ");
        StringBuilder textoFormatado = new StringBuilder();

        for (String palavra : palavras) {
            String primeiraLetra = palavra.substring(0, 1).toUpperCase();
            String restanteDaPalavra = palavra.substring(1).toLowerCase();
            textoFormatado.append(primeiraLetra).append(restanteDaPalavra).append(" ");
        }

        return textoFormatado.toString().trim();
    }
}
