import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class VacinarCidadao {

    // Instancio o scanner da util para ler os dados digitados
    Scanner ler = new Scanner(System.in);

    //Instancio um formatador em decimal
    //Crio o array para cadastrar os pacientes
    ArrayList<Pacientes> cadPac = new ArrayList();

    DecimalFormat format = new DecimalFormat();

    public void cadastraVacina() throws ParseException {

        System.out.println("\n====== Cadastro de usuários =======");
        System.out.print("Digite o nome: ");
        String nome = ler.next();
        System.out.print("Digite o CPF: ");
        double cpf = Double.parseDouble(ler.next());
        System.out.print("Digite a data da primeira dose: ");
        String primeiraD = ler.next();
        System.out.print("Digite a data da segunda dose: ");
        String segundaD = ler.next();
        System.out.print("Digite a data da terceira dose: ");
        String terceiraD = ler.next();
        System.out.print("Digite a data da quarta dose: ");
        String quartaD = ler.next();

        //Faz calculo de datas
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date primeiraData = sdf.parse(primeiraD);
        Date segundaData = sdf.parse(segundaD);
        Date terceiraData = sdf.parse(terceiraD);
        Date quartaData = sdf.parse(quartaD);

        //Direferença entre primeira e segunda
        long diffEmMil = Math.abs(segundaData.getTime() - primeiraData.getTime());
        long diff = TimeUnit.DAYS.convert(diffEmMil, TimeUnit.MILLISECONDS);
        //Diferença entre terceira e quarta
        long diffEmMil2 = Math.abs(quartaData.getTime() - terceiraData.getTime());
        long diff2 = TimeUnit.DAYS.convert(diffEmMil2, TimeUnit.MILLISECONDS);

        if ((diff < 120) || (diff2 < 120)) {

            System.out.println("\n \t A diferença entre as vacinas são menores do que 4 meses" + " o paciente não pode ser vacinado!");


        } else {

            Pacientes pac = new Pacientes();

            pac.atribuirNome(nome);
            pac.atribuirCpf(cpf);
            pac.AtribuirPrimeira(primeiraD);
            pac.AtribuirSegunda(segundaD);
            pac.AtribuirTerceira(terceiraD);
            pac.AtribuirQuarta(quartaD);

            cadPac.add(pac);

            System.out.println("\n\tPaciente " + nome + " vacinado! *_*");
        }

    }

    public void listarCidadao() {


        if (cadPac.size() == 0) {

            System.out.println("\n \tAinda não houe entrada de cidadãos" + " vacinados por favor digite os cidadãos!");

        } else {

        for (int count = 0; count < cadPac.size(); count++) {


            Pacientes pacientesCad = cadPac.get(count);
            //System.out.println(cadPac.toString());
            System.out.println("\n");
            System.out.println("Paciente " + count + ": " + pacientesCad.pegarNome()
                    +
                    "\n \tO cpf informado foi: " + format.format(pacientesCad.pegarCpf()) +
                    "\n \tA primeira dose foi: " + pacientesCad.pegoPrimeira() +
                    "\n \tA segunda dose foi: " + pacientesCad.pegoSegunda() +
                    "\n \tA terceira dose foi: " + pacientesCad.pegoTerceira() +
                    "\n \tA quarta dose foi: " + pacientesCad.pegoQuarta());

           }

          }

        }

}
