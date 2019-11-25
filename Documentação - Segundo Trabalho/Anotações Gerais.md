## Observação

Acima tem-se uma vaga ideia de um componente de software. É preciso esclarecer:

- O escopo do produto (módulo de software) é vago. O foco é a transferência de arquivos?
    Não.
- Qual a diferença para o módulo o uso do padrão TISS? O que muda? Se muda alguma coisa, então provavelmente o foco não está apenas na transferência de arquivos e, neste caso, seriam dois módulos. 
    O padrão TISS é o padrão nacional implementado para trocas eletronicas de dados relacionados a saúde.
- Devem ser produzidas a partir de um documento XML cinco versões diferentes e enviar todas as cinco?
    A partir de um documento XML, produzir outro documento XML no padrão definido pelo cliente(eu).
- O envio ocorre quando?
    O envio do arquivo, neste escopo, poderá ser feito a qualquer momento.
- Algum componente requisita o envio?
    Um outro componente precisará receber o arquivo.
- Se não for possível entregar, "destinatário ocupado" ou "simplesmente inacessível", o que deve ocorrer?
    Em caso de destinatario ocupado será necessário escrever o arquivo em diretorio especifico.
- Há alguma tecnologia a ser empregada (restrição de projeto), por exemplo, biblioteca, serviço para troca de mensagens como [ZeroMQ](https://zeromq.org/) ou [ActiveMQ](https://activemq.apache.org/), ou outro?
    A priori, ainda não definido.
- A divisão em lotes é para atender qual necessidade? Ou é um requisito expresso, tem que ser assim, em lotes. Se for, como é que os lotes são estabelecidos. 
    O prestador(ator que envia o arquivo), já porta um outro software que gera esse arquivo em lotes(guias de mesmo tipo).


###Descrição
Existe o desejo de normalizar a estrutura de arquivos TISS das versões 03.04.00, 03.03.03 e 03.02.02 para uma versão canonica para a empresa a fim de persistir estas informações em banco de dados. A solução deve ser capaz de receber um arquivo no formato XML com a especificação TISS, e gerar um novo arquivo em especificacao canonica e formato XML.

###Requisitos
- A solução deve receber um arquivo XML;
- O arquivo XML deve estar especificado conforme as normas de TISS para sua respectiva versão;
- A solução deve produzir um arquivo XML;
- O novo arquivo deve ser persistido em diretorio raiz no diretorio especificado ../tiss/processados/;

###Primeira Definição

- Identificada a classe #identificador. Que realiza a identificação da versão do arquivo;
- Criação de uma Interface #Filtro, que contera o metodo _filtrar(arquivo: xml)_ , que terá como resposta uma _list<Guia>_;
- Classe guia, que conterá os atributos que representam os campos do arquivo XML
- CLasse #Escrever, que receberá um _list<Guia>_ como parametro e deverá escrever um arquivo .XML;

## Atividades da Primeira Iteração
- Definir os atributos da classe #Guia;
- Produzir diagrama de sequencia;
- Revisar requisitos;

## Realizações da Primeira Iteração
- Definida através de diagrama o conceito da solução;
- Requisitos reavaliados

## Atividades da Segunda Iteração
- Definir especificação em formato de texto. Complementar ao diagrama.
- Reavaliar o design;

