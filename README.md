<div align="center"><h1>POO em Java</h1></div>

<div>
  <h3>Projeto de orientação de objetos com Java</h3>
  <p><h4>Bom mas o que seria esse tópico tão assustador entre os desenvolvedores? 
  Apesar de ser um tópico que gera bastante dúvidas aos demais, para mim eu acho que
  o entendimento foi mais tranquilo.</h4></p>
  <p><h4>Quando falamos de POO ou orientação a objetos temos 4 pilares que são: Abstração, Encapsulamento, Herança, Polimorfismo. </h4></p>
  <p>
    <ul>
      <li>Abstração</li> - Esse primeiro pilar diz sobre a capacidade de absorver uma única informação de um montante. Como assim? Seria basicamente resumir uma informação tirando os pontos mais importantes, por exemplo uma pessoa pode ter várias características porem para o sistema informações como peso, altura, ou se a pessoa fala alguma lingua além da nativa não importa, então abstraimos essas informações, e criamos variáveis mais constantes rsrs. Se a pessoa efetuará login no sistema então precisarems armazenar um identificador único, uma senha, e um logim, e deixamos de fora todas as outras informações, criando assim um objeto abstraído de uma pessoa. 
      <li>Encapsulamento</li> - O encapsulamento é mais simples de ser entendido, seria como um remédio você sabe para qual sintoma ele serve porem o que está dentro somente a empresa que o criou sabe. Esse pilar acrescenta segurança à aplicação pois todas as informações estão encapsuladas (lacradas) dentro de uma classe privada que somente as heranças, ou as instâncias poderão ter acesso as informações contidas nela.
      <li>Herança</li> - Esse diria também ser fácil de entender. Tipo assim digamos que vamos construir um carro e dentro do carro temos um assento que possui todas as características que usaremos nos demais, como já foi criado um podemos fazer o molde e pegar o que foi passado nas características do primeiro. 
      <li>Polimorfismo</li> - Esse foi o mais chato para eu entender mas bora lá. Ainda nos moldes dos bancos do nosso carro (espero ser um lindo Mustang :horse_racing:) rsrsrs suponhamos que criamos os dois bancos da frente do carro pois são exatamente iguais, a partir disso temos os bancos traseiros que tem uma leve diferença, aí está o polimorfismo vamos herdar algumas características porem precisaremos fazer algumas alterações para adequar ao que precisamos.  
    </ul>
  </p>
</div>
<hr size="50" width="100%" align="center" noshade></hr>

<div align="center"> <h3>Critérios de aceite</h3> </div>

<div>
 <p> 1 - Ao entrar no sistema o usuário deve informar o CPF e o nome da enfermeira que está aplicando a vacina.</p>
 <p> 2 - Após informado os dados da enfermeira o sistema deve apresentar a opção de vacinar cidadão, listar cidadãos vacinados e sair.</p>
 <p> 3 - Ao escolher a opção vacinar cidadão o sistema deve solicitar o CPF do cidadão, o nome do cidadão, a data de vacinação da primeira dose, a data de vacinação da         segunda dose, a data de vacinação da terceira dose e a data de vacinação da quarta dose.</p>
 <p> 4 - Caso a data de vacinação das doses 2, 3 e 4 forem inferiores a 4 meses da data de vacinação da dose anterior o sistema deve informar que o cidadão ainda não            tem   direito a uma nova data e retornar para as opções do requisito número 2. (não é necessário salvar esse registro na lista de cidadãos vacinados).</p>
 <p> 5 - Ao escolher a opção listar cidadãos vacinados o sistema deve mostrar uma lista dos cidadãos cadastrados no requisito número 3 e as datas de vacinação das 4            doses</p> 
 <p> 6 - Ao escolher a opção sair o sistema deve ser finalizado.</p>
 <p> 7 - Utilize os conceitos de Herança, Classe Abstrata e Encapsulamento aprendidos na disciplina.</p>
 <p> 8 - Não é necessário salvar os dados em banco de dados ou arquivo, guarde todos os objetos em memória.</p>
<div>
<hr>
<div align="center"> <h3>Classes</h3> </div>

[Classe abstrata](https://github.com/OVinicius1995/POO---JAVA/blob/main/vacinacao/src/Cadastro.java) Esta é a classe abstrata que foi criada para receber as informações dos nomes dos pacientes, de infermagem, e as datas das vacinações.

[Classe pacientes](https://github.com/OVinicius1995/POO---JAVA/blob/main/vacinacao/src/Pacientes.java) Desse classe acima temos duas heranças, uma delas é o cadastro de pacientes onde são passadas as informações dos pacientes e as respectivas datas das vacinas.

[Classe enfermagem](https://github.com/OVinicius1995/POO---JAVA/blob/main/vacinacao/src/Enfermagem.java) E a outra é a classe de infermagem onde são passados os dados da enfermagem.

[Classe VacinarCidadao](https://github.com/OVinicius1995/POO---JAVA/blob/main/vacinacao/src/VacinarCidadao.java) Classe onde é feita a validação das datas e a listagem dos pacientes.
<hr>
<div align="center"> <h3>UML</h3> </div>

<div align="center">
  <img src="https://github.com/OVinicius1995/POO---JAVA/blob/main/assets/imagem_2023-03-06_120339499.png">
</div>
<hr>

<div align="center"> <h3>Demonstração</h3> </div>

<div align="center">
  <img src="https://github.com/OVinicius1995/POO---JAVA/blob/main/assets/breve_demonstracao.gif">
</div>
