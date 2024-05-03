import java.util.Scanner;

public class LerPlaca {
    

    private static final Scanner scanner = new Scanner(System.in);

    public static String validaPlaca () {
        
        
        String entrada;
        
        
        System.out.println("Digite a Placa (Ex1:AAA-0A00 ou AAA-0000): ");
        while (true) {
            entrada = scanner.nextLine();
            if (entrada.matches("[A-Z]{3}+[-]{1}+[0-9]{1}+[A-Z]{1}+[0-9]{2}") || entrada.matches("[A-Z]{3}+[-]{1}+[0-9]{4}")) { 
                System.out.println("Entrada válida: " + entrada);
                break;
            }
            else {
                System.out.println("Entrada inválida. Por favor, digite exatamente 7 caracteres (0-9, A-Z): ");
            }
        }
        
        return entrada;
        
        
    }


    public static void diaRodizio(String placa) {
        char ultimoDigito = placa.charAt(placa.length() - 1);

        switch (ultimoDigito) {
            case '0':
            case '1':
                System.out.println("Rodizio de segunda-feira.");
                break;
            case '2':
            case '3':
                System.out.println("Rodizio de terça-feira.");
                break;
            case '4':
            case '5':
                System.out.println("Rodizio de quarta-feira.");
                break;
            case '6':
            case '7':
                System.out.println("Rodizio de na quinta-feira.");
                break;
            case '8':
            case '9':
                System.out.println("Rodizio de é na sexta-feira.");
                break;
            default:
                System.out.println("Placa inválida.");
                break;
        }
    }
    
}
