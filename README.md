# Diagrama de Classes

## Classes e Atributos

| Classe       | Atributos                                                                 |
|--------------|---------------------------------------------------------------------------|
| **Cliente**  | `cpf`: String <br> `nome`: String <br> `eMail`: String [0..1] <br> `telefone`: String [0..1] |
| **Pedido**   | `numPedido`: int <br> `dataEmissao`: Date <br> `dataCancelamento`: Date [0..1] <br> `status`: String |
| **Fatura**   | `numFatura`: int <br> `dataEmissao`: Date <br> `dataCancelamento`: Date |
| **ItemFaturado** | `qtdFaturada`: int |
| **ItemPedido** | `qtdPedida`: int <br> `precoCobrado`: double |
| **Livro** | `isbn`: String <br> `titulo`: String <br> `descricao`: String <br> `qtdEstoque`: int <br> `preco`: double |

## Relacionamentos

| Origem      | Destino         | Multiplicidade                                       |
|-------------|-----------------|-----------------------------------------------------|
| **Cliente** | **Pedido**      | Cliente faz 0..* Pedidos                             |
| **Pedido**  | **ItemPedido**  | Pedido contém 1..* ItemPedido                       |
| **Pedido**  | **Fatura**      | Pedido gera 0..* Faturas                            |
| **Fatura**  | **ItemFaturado** | Fatura contém 1..* ItemFaturado                    |
| **ItemFaturado** | **ItemPedido** | ItemFaturado refere-se a 1 ItemPedido          |
| **ItemPedido** | **Livro**     | ItemPedido refere-se a 1 Livro                      |

## Notas

- Uma fatura deve faturar itens de um mesmo Pedido.

