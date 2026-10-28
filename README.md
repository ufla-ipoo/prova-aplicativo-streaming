# 2ª Prova - IPOO - 2026-2

## Instruções

- **Não desligue** o computador ao terminar a prova!
- Deixe um documento de identificação com foto (RG, CNH ou Carteirinha da UFLA)
  sobre a bancada durante toda a prova.
- A prova é individual e sem consulta.
- Durante a prova você poderá usar apenas o BlueJ na máquina do laboratório.
- Não é permitido o uso de construções de Programação Funcional em Java 
  (como comandos stream e operador ->).
- Desligue e guarde celulares e quaisquer outros aparelhos eletrônicos.
- Leia atentamente todo o enunciado antes de responder cada questão.
- Questões teóricas devem ser respondidas neste mesmo arquivo.
- Quando solicitado, respostas sem justificativa serão desconsideradas.
- Questões práticas devem ser respondidas alterando o código do projeto fornecido.

Para entregar a prova:

1. A pasta da prova deve ser compactada em um arquivo ZIP.
2. **O aluno é responsável por verificar** se os arquivos foram salvos e o 
   arquivo ZIP foi gerado corretamente.
2. Clique com o botão direito do mouse no atalho `Enviar Prova` na Área de 
   Trabalho e acesse a opção `Permitir Iniciar`.
3. Em seguida clique duas vezes no atalho `Enviar Prova`.
4. Preencha o login usando a primeira parte do seu e-mail (ou seja, sem `@estudante.ufla.br`).
5. Preencha a senha usando seu número de matrícula (chame o professor se não se lembrar).
6. Escolha o arquivo ZIP que você gerou no passo 1.
7. Clique em enviar e confira se apareceu a mensagem `Upload Recebido`.
  - Se aparecer outra mensagem a prova não foi entregue!
8. Após fazer a entrega, avise o professor e **NÃO** desligue o computador.

## ATENÇÃO

**Não desligue** o computador ao terminar a prova!


## Identificação do Aluno

Digite abaixo seu nome completo:

> 

## Questão 1 (Peso 15)

Para cada situação abaixo indique se o atributo deve ser estático ou de 
instância e também se ele deve ser constante ou mutável. 
Justifique suas respostas.

a. Atributo saldo de uma classe Conta.

Resposta:

b. Atributo quantidade de jogadores de uma classe Esporte (quantidade
   no início das partidas, de acordo com as regras do esporte).

Resposta:

c. Atributo nome da espécie de uma classe Leão. 

Resposta: 


## Questão 2 (Peso 15) 

Suponha que uma classe Carro tenha um método estático chamado obterVelocidadeMaxima, 
que não receba parâmetros e retorne um valor inteiro. 

a. Escreva um exemplo de chamada ao método obterVelocidadeMaxima, feita de fora 
da classe, e que não utilize uma instância da classe Carro.

**Responda abaixo:**

> 

b. Suponha que você precise implementar um novo método na classe Carro que indique 
o  quanto a velocidade de um carro ainda pode aumentar. Por exemplo: suponha que 
a velocidade  máxima dos carros seja de 150 km/h, e que um carro esteja a 90 km/h; 
nesse caso, o método criado deveria retornar 60, que é o quanto a velocidade atual 
do carro pode aumentar até chegar ao máximo de 150. 

Este novo método poderia ser declarado como estático? Justifique sua resposta.

**Responda abaixo:**

> 

## Questão 3 (Peso 20) 

Para cada par de classes abaixo, e, de acordo com as boas práticas de OO, indique 
qual deve ser o relacionamento entre as classes (composição, agregação, associação 
ou herança).

Na sua resposta você deve explicar claramente o contexto que considerou de forma 
a justificar o relacionamento escolhido.

a. Bebida e Cerveja

Resposta:

b. Rua e Bairro

Resposta:

c. Dipirona e Remédio

Resposta:

d. Geladeira e Alimento

Resposta:


## Questão 5 (Peso 50)

Faça as alterações pedidas a seguir no código do presente projeto, que traz a 
implementação incompleta de um sistema de uma plataforma de streaming.

Estude atentamente o código e os comentários das classes fornecidas antes de 
fazer suas implementações. É recomendável que estude o código nessa ordem: 
Filme, Usuario, PlataformaDeStreaming e TestePlataforma.

Lembre-se que você deve fazer suas implementações utilizando um bom design de 
classes.

a. (Peso 10) O atributo tempoAssistido da classe Usuario está ficando sempre 
com o valor zero. Considerando que o usuário sempre assiste o filme inteiro,
atualize o valor do atributo tempoAssistido quando o usuário assistir a um 
filme. 

b. (Peso 10) Altere o método obterInfoUsuario da classe PlataformaDeStreaming 
para incluir a informação do tempo total assistido pelo usuário. O retorno seria 
algo assim: “Usuário fulano assistiu 800 minutos de 3 filmes”.

c. (Peso 10) Altere o construtor da classe TesteAplicativo de forma que o usuário 
Tião assista a um filme, antes que suas informações sejam exibidas no terminal.

d. (Peso 10) Crie um novo método na classe Usuario que receba por parâmetro um 
gênero e retorne a quantidade de filmes, daquele gênero, assistidos pelo usuário. 

e. (Peso 10) Complete o método filmesAssistidos da classe PlataformaDeStreaming de 
forma que ele use o método que você criou no item anterior. Dica: fique atento para
evitar replicação de código. Por fim, acrescente código na classe TesteAplicativo 
para testar sua implementação.




