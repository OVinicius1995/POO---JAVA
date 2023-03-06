public class Enfermagem extends Cadastro{


    public void atribuirNome(String nome){

        this.nome = nome;
    }

    public String pegaNome(){
        return nome;
    }

    public void atribuirCpf(String cpf){
        this.cpf = cpf;
    }

    public String pegaCpf(){
        return cpf;
    }


}