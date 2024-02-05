import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        //Instância de criar conta bancária
        ArrayList<ContaBancaria> listaContas = new ArrayList<>();
        boolean continuarPrograma=true;

        while (continuarPrograma){

            System.out.println("--------------------------------");
            System.out.println("Escolha a operação a realizar:");
            System.out.println("1 - Criar conta Bancária");
            System.out.println("2 - Depositar");
            System.out.println("3 - Levantar");
            System.out.println("4 - informações de conta");
            System.out.println("5 - Sair");

            int escolha = scanner.nextInt();
            scanner.nextLine();// limpar buffer

            switch (escolha){
                case 1 -> {
                    System.out.println("Defina o nome do Titular:");
                    String nomeTitular = scanner.nextLine();

                    int numeroConta = random.nextInt(1000000);
                    ContaBancaria conta1 = new ContaBancaria(); // Criar objeto conta bancaria
                    conta1.setNomeTitular(nomeTitular);
                    conta1.setNumeroConta(numeroConta);
                    listaContas.add(conta1);

                    System.out.println("Conta criada com sucesso.");
                }
                case 2 -> {
                    System.out.println("Introduza o nome de titular da conta:");
                    String nomeTitular = scanner.nextLine();

                        for (int i = 0; i < listaContas.size(); i++){
                            if(listaContas.get(i).getNomeTitular().equals(nomeTitular)) {
                                System.out.println("Introduza o valor a depositar:");
                                Double valorDepositar = scanner.nextDouble();
                                listaContas.get(i).depositar(valorDepositar);
                            }
                            else{
                                System.out.println("Nome titular não é válido.");
                            }
                        }
                }
                case 3 -> {
                    System.out.println("Introduza o nome de titular da conta:");
                    String nomeTitular = scanner.nextLine();

                    for (int i = 0; i < listaContas.size(); i++) {
                        if (listaContas.get(i).getNomeTitular().equals(nomeTitular)) {
                            System.out.println("Introduza o valor a levantar:");
                            Double valorLevantar = scanner.nextDouble();
                            listaContas.get(i).levantar(valorLevantar);
                        }
                    }
                }
                case 4 ->{
                    System.out.println("Introduza o nome de titular da conta:");
                    String nomeTitular = scanner.nextLine();

                    for (int i = 0; i < listaContas.size(); i++){
                        if (listaContas.get(i).getNomeTitular().equals(nomeTitular)){
                            listaContas.get(i).info();
                        }
                    }
                }
                case 5 ->{
                    System.out.println("Até à próxima...");
                    continuarPrograma = false;
                }
                default -> System.out.println("Opção inválida.");
            }
        }
    }
}