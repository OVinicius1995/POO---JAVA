public class Pacientes extends Cadastro {

    public void atribuirNome(String nome){

        this.nome = nome;
    }

    public String pegarNome(){
        return nome;
    }

    public void atribuirCpf(double cpf){
        this.cpf = String.valueOf(cpf);
    }

    public double pegarCpf(){
        return Double.parseDouble(cpf);
    }

    public void AtribuirPrimeira(String primeiraData){

        this.primeiraD = primeiraData;
    }

    public String pegoPrimeira(){
        return primeiraD;
    }

    public void AtribuirSegunda(String segundaData){

        this.segundaD = segundaData;
    }

    public String pegoSegunda(){
        return segundaD;
    }

    public void AtribuirTerceira(String terceiraData){

        this.terceiraD = terceiraData;
    }

    public String pegoTerceira(){
        return terceiraD;
    }

    public void AtribuirQuarta(String quartaData){

        this.quartaD = quartaData;
    }

    public String pegoQuarta(){
        return quartaD;
    }

}
