import java.util.Scanner;

public class LerDados {

    private static final Scanner scan = new Scanner(System.in);

    public static int lerInt(String tenteNovamente) {
        while (true) {
            var linha = scan.nextLine();
            try {
                return Integer.parseInt(linha);
            } catch (NumberFormatException erro) {
                System.out.print(tenteNovamente);
            }
        }
    }

    public static double lerDouble(String tenteNovamente) {
        while (true) {
            var linha = scan.nextLine();
            try {
                return Double.parseDouble(linha);
            } catch (NumberFormatException erro) {
                System.out.print(tenteNovamente);
            }
        }
    }

    public static String lerTexto() {
        return scan.nextLine();
    }
/*     public static double metragemBau() {

        double comprimento = lerDouble("Digite o comprimento: ");

        double largura = lerDouble("Digite a largura: ");

        double altura = lerDouble("Digite a altura: ");

        double cubagem = comprimento * largura * altura;

        return cubagem;
    }

    public static void cubagemBau(Double medidasBau){

        Double m3 = LerDados.metragemBau(cubagem);

        return m3;
    }*/
    

}