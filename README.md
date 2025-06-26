# 📦 Sistema de Pedidos com Simulação de Notificações

## 📜 Descrição
Este projeto consiste em um sistema simples para gerenciar pedidos de uma loja virtual via terminal.  
Ele permite:
- Cadastro de clientes e produtos
- Criação de pedidos com cálculo de frete
- Simulação do envio de notificações (E-mail, SMS, WhatsApp)
- Geração de relatórios em texto e JSON (simulado)

> O objetivo é colocar em prática conceitos de orientação a objetos e estruturação de classes sem uso de frameworks externos.

---

## 🧑‍💻 Como Compilar e Executar
- **Versão do Java:** 24
- A classe principal (`Main.java`) está dentro do pacote `SistemaPedidos`.
- Para executar o projeto no VSCode:
  1. Instale as extensões para suporte a Java (ex.: `Extension Pack for Java`).
  2. Abra o projeto e selecione a classe `Main.java` no explorador.
  3. Clique em **Run** (▶️) para executar o programa.

> Também é possível compilar e executar pelo terminal:
> ```bash
> javac -d bin src/SistemaPedidos/Main.java
> java -cp bin SistemaPedidos.Main
> ```

---

## ✅ Funcionalidades Implementadas
- 🧑‍💼 **Cadastro de Clientes** (nome, CPF, e-mail, telefone)
- 📦 **Cadastro de Produtos** (nome, preço, peso)
- 🧾 **Criação de Pedidos** associando cliente e produtos (Obrigatorio ter 1 criado em ambos)
- 🚚 **Cálculo do Frete** por peso total ou distância
- 🔔 **Simulação de Notificações** por e-mail, SMS ou WhatsApp
- 📝 **Relatórios** em texto simples e JSON simulado

---

## ⚠️ Desafios Encontrados
- 🔗 **Integração entre classes**: garantir que as classes e métodos "conversem entre si" quando necessário.
- 🐛 **Uso do `Scanner`**: algumas leituras precisavam de chamadas duplas a `scanner.nextLine()` para evitar quebras de linha remanescentes.
- 🧠 **Responsabilidades das classes**: entender claramente o que cada classe deveria fazer e evitar que algo essencial ficasse de fora.
- 📂 **Arquivo `Entrada.java`**: dificuldade em lembrar a função dele e, depois de muito tempo, perceber que ele poderia ter sido excluído sem prejuízo.

---

## 📄 Licença
Este projeto foi desenvolvido apenas para fins educacionais. 