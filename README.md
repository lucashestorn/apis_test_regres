Automação dos testes da API do https://reqres.in/.

O regres disponibiliza vários endpoints para testes de API e estou criando testes automatizados
utilizando Java e RestAssured para validar esses endpoints.

Inicialmente foram validadas o CRUD de sucesso inicial(Pesquisa, Cadastro, Alteração e Exclusão) de users.
Para isso, utilizei Java com o Framework RestAssured e seu modelo prático de interação com APIs: Given, When, Then.

Todos os testes serão escritos utilizando esse modelo.
Por hora está sendo feito as funções das chamadas em si, não tendo sido preparado para aceitar entradas de valores dinâmicas ainda
(como pegar os valores para testar de um BD ou planilha).

Os testes utilizam como base para validação os códigos esperados que sejam retornados da API, sendo eles:
Codigo: 201 -> Sucesso na criação
Código: 204 -> Sucesso na exclusão
Código: 200 -> Sucesso na solicitação

Qualquer código diferente do esperado, irá falhar o teste.
Também foram utilizadas validações de conteúdo da resposta sempre que possível.

Pesquisar: Além do código 200, valida se o conteúdo do JSON é o esperado e realiza o Teste de Contrato com o schema definido.
O Schema foi feito utilizando o https://jsonschema.net/home e não foi alterado.

Create e Update: Além do código, válida a resposta de sucesso.

Devido ao desafio proposto, não me prolonguei em procurar utilizar BDD na escrita dos testes, mas não seria um problema de forma geral.

