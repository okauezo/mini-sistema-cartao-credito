💳 Sistema de Compras com Cartão de Crédito

Aplicação desenvolvida em Java para simular o controle de compras realizadas em um cartão de crédito.

O sistema permite definir um limite inicial, registrar compras até que o usuário deseje parar ou até que o saldo seja insuficiente, e ao final exibe as compras realizadas ordenadas por valor.

🚀 Funcionalidades

Definição do limite do cartão

Cadastro de compras (descrição e valor)

Validação de saldo antes de aprovar a compra

Armazenamento das compras em uma List

Ordenação automática por valor utilizando Comparable

Exibição do saldo restante

Encerramento automático ao atingir saldo insuficiente

🧠 Conceitos aplicados

Este projeto reforça fundamentos importantes de Java e POO:

Programação Orientada a Objetos

Encapsulamento

Interface List

Implementação ArrayList

Interface Comparable

Ordenação com Collections.sort()

Estrutura de repetição while

Estrutura condicional if/else

Manipulação de entrada com Scanner

Controle de fluxo com break

🏗 Estrutura do Projeto
📦 br.com.Sistema.Cartao
 ┣ 📜 Compra.java
 ┗ 📜 Aplicacao.java
🔹 Compra.java

Classe responsável por representar uma compra.

Contém:

Atributos: descricao e valor

Implementação de Comparable<Compra> para ordenação por valor

Método toString() para exibição formatada

🔹 Aplicacao.java

Classe principal que:

Recebe o limite do cartão

Controla o fluxo de compras

Valida saldo disponível

Ordena as compras realizadas

Exibe o saldo final

▶️ Exemplo de Execução
Digite o limite do cartão: 1000
Digite a descrição da compra: sapato
Digite valor da compra: 50
Compra realizada com sucesso!
Digite 0 para sair ou 1 para continuar: 1

Digite a descrição da compra: camisa
Digite valor da compra: 15
Compra realizada com sucesso!
Digite 0 para sair ou 1 para continuar: 0

COMPRAS REALIZADAS:
camisa - 15.0
sapato - 50.0

Saldo do Cartão: 935.0
🎯 Objetivo do Projeto

Praticar:

Manipulação de listas

Controle de fluxo

Regras de negócio simples

Organização de código em múltiplas classes

Aplicação de conceitos fundamentais para desenvolvimento backend

💡 Possíveis Melhorias Futuras

Formatação monetária com NumberFormat

Tratamento de exceções (try/catch)

Validação para impedir valores negativos

Implementação de limite mínimo

Interface gráfica ou API REST futuramente

👨‍💻 Autor

Kauê Pires Moreira
Estudante de Engenharia de Software
