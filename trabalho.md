- Envio de arquivos .XML padrão TISS em lotes, das 5 ultimas versoes de padrão do arquivo.

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
