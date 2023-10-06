#language: pt

Funcionalidade: os usuários vem os resultados de acordo com a operação desejada

Esquema do Cenário: mostrar o resultado quando executar uma operação na calculadora
 Dado que "Maria" esteja na calculadora
 Quando pressionar o primeiro numero <numero1>
 E pressionar o segundo numero <numero2>
 E escolher a <operacao>
 Então o sistema deverá mostrar o <resultado>

Exemplos:
 | numero1 | numero2  | operacao      | resultado|
 | 4       | 2        | soma          | 6        |
 | 4       | 2        | subtracao     | 2        |
 | 4       | 2        | multiplicacao | 8        |
 | 4       | 2        | divisao       | 2        | 