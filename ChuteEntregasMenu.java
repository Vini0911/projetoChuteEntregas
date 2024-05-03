public class ChuteEntregasMenu {

    public static void main(String[] args) {
        menuPrincipal();
    }


    private static void menuPrincipal() {
        while (true) {
            System.out.println("Bem vindo ao menu Chutes Entregas");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Buscar veículo");
            System.out.println("3 - Em DESENVOLVIMENTO");
            System.out.println("4 - Em DESENVOLVIMENTO");
            System.out.println("5 - Em DESENVOLVIMENTO");
            System.out.println("6 - Em DESENVOLVIMENTO");
            System.out.println("7 - Em DESENVOLVIMENTO");
            System.out.println("8 - Sair");
            System.out.println();
            System.out.print("Digite a sua escolha: ");
            var escolha = LerDados.lerTexto().toUpperCase();
            System.out.println();

            if (escolha.equals("1")) {
                submenuCadastro();
            } else if (escolha.equals("2")) {
                listarVeiculos();
            } else if (escolha.equals("3")) {
                buscarVeiculo();
            } else if (escolha.equals("4")) {
                manutencao();
            } else if (escolha.equals("5")) {
                vendaDePecas();
            } else if (escolha.equals("6")) {
                limpeza();
            } else if (escolha.equals("7")) {
                pintura();
            } else if (escolha.equals("8")) {
                return;
            } else {
                System.out.println("Esta não é uma opção válida. Vamos tentar novamente!");
            }
        }
    }



                    private static void cadastroVeiculo() {

                        System.out.print("Digite o nome completo: ");
                        var nomemotorista = LerDados.lerTexto();
                        
                        System.out.print("Digite o Nº da CNH: ");
                        var cnh2 = LerDados.lerTexto();

                        System.out.print("Digite o Nº do CPF: ");
                        var cpf1 = LerDados.lerTexto();

                        System.out.print("Digite o Nº do RG: ");
                        var rg3 = LerDados.lerTexto();

                        System.out.print("Digite a placa: ");
                        var placa = LerPlaca.validaPlaca();

                        LerPlaca.diaRodizio(placa);

                        System.out.print("Digite a marca: ");
                        var marca = LerDados.lerTexto();

                        System.out.print("Digite o modelo: ");
                        var modelo = LerDados.lerTexto();

                        System.out.print("Digite o ano: ");
                        var ano = LerDados.lerInt("Favor digitar um número inteiro: ");

                        var comprimento = LerDados.lerDouble("Digite o comprimento: ");

                        var largura = LerDados.lerDouble("Digite a largura: ");

                        var altura = LerDados.lerDouble("Digite a altura: ");

                        Double cubagem = comprimento * largura * altura;

                        System.out.println("A metragem cúbica do Bau é:" + cubagem + " m³");

                        //var medidasBau = LerDados.metragemBau();

                        //LerDados.metragemBau(cubagem);

                    salvarVeiculo(nomemotorista, cnh2, cpf1, rg3, placa, marca, modelo, ano, comprimento, largura, altura, cubagem);
                    }

                    private static void salvarVeiculo(String nomemotorista, String cnh, String cpf, String rg, String placa, String cor, String modelo, int ano, Double comprimento, Double largura, Double altura, Double cubagem) {
                        System.out.println("Não fiz isso ainda.");
                    }

                    private static void cadastroCliente() {
                        System.out.print("Digite a Razão Social: ");
                        var nomeCliente = LerDados.lerTexto();

                        System.out.print("Digite o Nº do CNPJ: ");
                        var cnpjCliente = LerDados.lerTexto();

                        System.out.print("Digite o nome da rua: ");
                        var ruaCliente = LerDados.lerTexto();

                        System.out.print("Digite o número da casa: ");
                        var numeroCasa = LerDados.lerInt("Favor digitar um número inteiro: ");

                        System.out.print("Digite o nome do bairro: ");
                        var bairroCliente = LerDados.lerTexto();
                        
                        System.out.print("Digite o nome da Cidade: ");
                        var cidadeCliente = LerDados.lerTexto();
                        
                        System.out.print("Digite o nome do estado: ");
                        var estadoCliente = LerDados.lerTexto();
                        
                        System.out.print("Digite o nome do CEP: ");
                        var cepCliente = LerDados.lerInt("Digite corretamente, por favor! ");

                        salvarCliente(nomeCliente, cnpjCliente, ruaCliente, numeroCasa, bairroCliente, cidadeCliente, estadoCliente, cepCliente);

                    }

                    private static void salvarCliente(String nomeCliente, String cnpjCliente, String ruaCliente, int numeroCasa, String bairroCliente, String cidadeCliente, String estadoCliente, int cepCliente) {
                        System.out.println("Não fiz isso ainda.");
                    }

                    private static void cadastroEntregas(){
                        System.out.print("");
                        var entrega = LerDados.lerTexto();

                        System.out.println("..");
                    }


    private static void listarVeiculos() {
        System.out.println("Não fiz isso ainda. Cenas para os próximos capítulos...");
    }

    private static void buscarVeiculo() {
        System.out.print("Digite a placa: ");
    
        var placa = LerDados.lerTexto();

        System.out.println("Não fiz isso ainda. Cenas para os próximos capítulos...");
    }

    private static void manutencao() {
        System.out.println("Não fiz isso ainda. Cenas para os próximos capítulos...");
    }

    private static void vendaDePecas() {
        System.out.println("Não fiz isso ainda. Cenas para os próximos capítulos...");
    }

    private static void limpeza() {
        System.out.println("Não fiz isso ainda. Cenas para os próximos capítulos...");
    }

    private static void pintura() {
        System.out.println("Não fiz isso ainda. Cenas para os próximos capítulos...");
    }

    private static void submenuCadastro() {
        // Submenu para a opção "Cadastrar"
        while (true) {
            System.out.println("======= Submenu Cadastro =======");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastro Veículo/Motorista");
            System.out.println("2 - Cadastro Cliente");
            System.out.println("3 - Cadastro de Entregas");
            System.out.println("4 - Sair");
            System.out.println();
            System.out.print("Digite a sua escolha: ");
            var subEscolha = LerDados.lerTexto().toUpperCase();
            System.out.println();

            if (subEscolha.equals("1")) {
                cadastroVeiculo();
            }  else if (subEscolha.equals("2")) {
                cadastroCliente();
            }  else if (subEscolha.equals("3")) {
                cadastroEntregas();
            }  else if(subEscolha.equals("4")) {
                break;
            }  else {
                System.out.println("Esta não é uma opção válida. Vamos tentar novamente!");
            }
        }
    }
}
