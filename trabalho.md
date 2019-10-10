- Envio de arquivos .XML padrão TISS em lotes, das 5 ultimas versoes de padrão do arquivo.

## Observação

Acima tem-se uma vaga ideia de um componente de software. É preciso esclarecer:

- O escopo do produto (módulo de software) é vago. O foco é a transferência de arquivos?
- Qual a diferença para o módulo o uso do padrão TISS? O que muda? Se muda alguma coisa, então provavelmente o foco não está apenas na transferência de arquivos e, neste caso, seriam dois módulos. 
- Devem ser produzidas a partir de um documento XML cinco versões diferentes e enviar todas as cinco?
- O envio ocorre quando?
- Algum componente requisita o envio?
- Se não for possível entregar, "destinatário ocupado" ou "simplesmente inacessível", o que deve ocorrer?
- Há alguma tecnologia a ser empregada (restrição de projeto), por exemplo, biblioteca, serviço para troca de mensagens como [ZeroMQ](https://zeromq.org/) ou [ActiveMQ](https://activemq.apache.org/), ou outro?
- A divisão em lotes é para atender qual necessidade? Ou é um requisito expresso, tem que ser assim, em lotes. Se for, como é que os lotes são estabelecidos. 
