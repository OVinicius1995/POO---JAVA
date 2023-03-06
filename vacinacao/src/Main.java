import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws ParseException {

        //Instancio o scanner para leitura do que é digitado
          Scanner ler = new Scanner(System.in);
        //Instancio a classe de cadastro de enfermagem
          Enfermagem enf = new  Enfermagem();
        //Instancio o cadastro de vacinas
           VacinarCidadao vac = new VacinarCidadao();
        //Cria o array para salvar os dados
          ArrayList<Enfermagem> cadEnf = new ArrayList();

        System.out.print("Por gentileza informe seu CPF: ");
        double cpfEnf = ler.nextDouble();

        System.out.print("Por gentileza informe seu nome: ");
        String nome_enf = ler.next();

        //Faz o cadastro da enfermagem no arraylist
        enf.atribuirNome(nome_enf);
        cadEnf.add(enf);

        if(cpfEnf != 0){

        boolean rodando = true;
        while (rodando){

            System.out.println("\n");
            System.out.println("Bem vindo(a): " + "\t" + nome_enf);
            System.out.println("|---------------------------------------|");
            System.out.println("|      [1-]Vacinar cidadão              |");
            System.out.println("|      [2-]Listar cidadãos vacinados    |");
            System.out.println("|      [3-]Sair                         |");
            System.out.println("|---------------------------------------|");
            System.out.println("\n");
            System.out.print("Selecione uma opção: ");
            String opcoes = ler.next();
            int validaOpcoes = Integer.parseInt(opcoes.toString());

            if((validaOpcoes != 1) && (validaOpcoes != 2) && (validaOpcoes != 3) ){

                System.out.println("\n \tOpção inválida você precisa escolher entre as opções: [-1]Vacinar cidadão, " +
                        "[-2]Listar cidadãos vacinados, [3]Sair");


            } else {

            switch (opcoes) {

                case "1": {

                    vac.cadastraVacina();

                    break;
                }

                case "2": {

                        vac.listarCidadao();

                        break;

                    }

                case "3":{

                    System.out.println("Saindo...");

                    rodando = false;

                    break;
                }

                }

            }
        }

        } else {

            System.out.println("O CPF não foi encontrado ou é igual a 0" +
                    " por isso o sistema será encerrado tente novamente " +
                    "com um cpf válido. Obrigado!");

        }
    }
}