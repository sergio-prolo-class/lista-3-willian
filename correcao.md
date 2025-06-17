# Correção

| Questão     | Legibilidade | P1 | P2 | Total |
|-------------|--------------|----|----|-------|
| Nota máxima | 15           | 35 | 50 | 100   |
| Nota        | 8            | 12 | 0  | 20    |

## Diagramas

- o catálogo possui um objeto Filme no atributo filmes?
- associação sem multiplicidade entre Catalogo e Filme
- composição é correto?
  - se o Catalogo recebe objetos do tipo Filme na hora de adicionar ou remover...
  - então ele não controla o ciclo de vida desses objetos! alguém cria e passa pra ele.
  - logo, composição provavelmente não é o tipo de associação correta

## P1

- como existe um Set de objetos Filme, como o método Set.add() sabe que um Filme já está presente na coleção?
  - sua solução implementa uma verificação manual (Catalogo.java linha 16)
  - contudo, quando que filmes.contais(filme) é true?
- filmes.forEach(println) vai executar em ordem alfabética? tem certeza?

### Requisitos Funcionais
- [x] Adicionar filmes
- [x] Remover filmes
- [ ] Listar filmes por ordem alfabética de título
- [ ] Listar filmes por ordem alfabética de gênero
- [ ] Listar filmes por ordem de lançamento
- [ ] Buscar filmes de um ano

## P2

### Requisitos Funcionais
- [ ] Registrar dados de um cliente quando é sua primeira solicitação
- [ ] Registrar novas solicitações vinculadas a um cliente
- [ ] Listar os telefones dos clientes registrados
- [ ] Imprimir o nome do próximo cliente
- [ ] Atender o próximo cliente
- [ ] Listar as idades dos clientes já atendidos
- [ ] Listar os telefones dos clientes em espera