## Descrição do Problema
Amazon S3 e Azure Blob Storage são serviços “equivalentes” para armazenamento de dados. Contudo, cada um deles oferece uma API específica para acesso aos serviços que oferecem. Em consequência, para usufruir destes serviços é necessário escrever código distinto para cada um destes fornecedores.

### Atividades
- Levantar requisitos iniciais das soluções(S3 e Azure);
- Requisitos do usuário em relação a utilização da aplicação;
- Elencar atores da aplicação;
- Realizar um teste com as aplicações semelhantes já atuantes no mercado;

#### Atores 
- Desenvolvedor;
- Amazon S3;
- Azure Blob;

#### Requisitos - Primeira Revisão
- O usuário da solução será um desenvolvedor;
- O usuário como consumidor da solução deseja que a inserção dos dados de arquivos sejam feitos de forma unificada. Ou seja, o mesmo padrão de chamada para diferentes tipos de arquivos;
- O usuário como consumidor da solução deseja ver e inserir os dados de arquivos em uma estrutura semelhante a arvore de arquivos dos sistemas operacionais convencionais;
- O usuário como consumidor da solução deverá fornecer dados iniciais sobre as aplicações de armazenamento;
- O usuário como consumidor da solução deseja saber em qual aplicação de armazenamento ficou o arquivo(REFINAR);
- O usuário como consumidor da aplicação deseja realizar busca pelos arquivos através do nome dos arquivos;
