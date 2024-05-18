Descrição
Este projeto é uma aplicação simples de simulação de um sistema bancário utilizando Java Swing para a interface gráfica. A aplicação permite que o usuário realize operações bancárias básicas como salvar o nome do cliente, depositar e sacar valores, além de visualizar o saldo atual.

Funcionalidades
Salvar Nome do Cliente: O usuário pode inserir seu nome que será salvo e exibido em um diálogo.
Depositar Valor: O usuário pode depositar um valor na conta.
Sacar Valor: O usuário pode sacar um valor da conta.
Visualizar Saldo: O saldo atual da conta é exibido na interface gráfica.
Estrutura do Código
Classe Tela
A classe Tela é uma extensão de JFrame que representa a interface gráfica da aplicação.

Atributos:
cliente: Instância da classe Banco que gerencia as operações bancárias.
panel: Painel principal onde os componentes gráficos são adicionados.
jLabel, textField, salvarButton: Componentes para salvar o nome do cliente.
jButton2, jButton: Botões para as operações de depósito e saque, respectivamente.
jLabel2, jLabel3: Labels para exibir o saldo atual.
Construtor:
Configura o título da janela, tamanho, layout e cor do painel.
Adiciona componentes ao painel principal.
Configura os ActionListener para os botões de salvar, depositar e sacar.
Métodos:
salvarButton: Salva o nome do cliente e exibe um diálogo com o nome salvo.
jButton2 (Depositar): Solicita ao usuário um valor para depositar, valida o valor e atualiza o saldo.
jButton (Sacar): Solicita ao usuário um valor para sacar, valida o valor e atualiza o saldo.
Classe Banco
getNome: Retorna o nome do cliente.
setNome: Define o nome do cliente.
getSaldo: Retorna o saldo atual da conta.
depositar: Adiciona um valor ao saldo.
sacar: Subtrai um valor do saldo, se possível.
