# CapyLunch

That is the final project of the A3 of Programming of Computational Solutions of the Computer Science Course, at UAM - Universidade Anhembi Morumbi.



## ❓ A3 Project Specifications

* The system must be a desktop solution with a graphical interface;
* Database (optional);
* A graphical interface must be developed using the javax.swing package classes;
* The system must have access control: only authenticated users can have access to its features;
* There must be two types of users in the system: administrators and attendants;
* An administrator user will be registered directly in the database, in advance;
* Administrators must have access to the following features:
  - Registration of new administrators and attendants;
  - Registration of people or products;
  - Removal of administrators and attendants;
  - Report generation. The system should generate the following type of report. Given a period (with start and end date) chosen by the user, the report must present at least two statistics from the database.
* Attendants must have access to the following features:
  - Viewing people or products.
* The group is free to add new features inherent to the selected theme.



## 💻 Technologies

* JDK version 17.0.2
* Java with Ant



## 🌐 Services

* Github



## ❗ Observations

This project hasn't a database, for functions like CRUD we used ArrayLists.

We use JOptionPane to make error alerts when some information is wrong, such as in the login interface, and confirmation messages, such as when you will perform the register, edit and delete function.



## ✍️ How to use

### 1 - When you start the system, will appears the login interface.

![login image](https://github.com/kauassilva/CapyLunch/blob/main/CapyLunch/src/assets/readme/interfaceLogin.png)


### 1.1 - If you type "2140" in the Código de Usuário field and "2305" in the Senha field and press the Acessar button or the Enter key, will appear the Interface do Gerente with some functions.

![interface do gerente image](https://github.com/kauassilva/CapyLunch/blob/main/CapyLunch/src/assets/readme/interfaceGerente.png)


### 1.1.1 - In the Gerenciar Funcionários interface, there is a registration form and functions to edit data and remove the employee. In addition to a table with data of registered employees.

![gerenciar funcionarios image](https://github.com/kauassilva/CapyLunch/blob/main/CapyLunch/src/assets/readme/interfaceGerenciarFuncionario.png)


### 1.1.2 - In the Gerenciar Alimentos interface, there is a registration form and functions to edit data and remove food. In addition to a table with registered food data.

![gerenciar alimentos image](https://github.com/kauassilva/CapyLunch/blob/main/CapyLunch/src/assets/readme/interfaceGerenciarAlimento.png)


### 1.1.3 - In the Emitir Relatório Interface, there is a table with two statistics. In addition to two JComboBoxes to the departure date and end date. When a valid period has been selected, simply click the Issue button for the data to appear.

![emitir relatorio image](https://github.com/kauassilva/CapyLunch/blob/main/CapyLunch/src/assets/readme/interfaceEmitirRelatorio.png)


### 1.2 - If you type "1234" in the Código de Usuário field and "5678" in the **Senha field** and press the Acessar button or the Enter key, will appear the Interface do Atendente with two buttons that do the same thing.

![interface do atendente image](https://github.com/kauassilva/CapyLunch/blob/main/CapyLunch/src/assets/readme/interfaceAtendente.png)


### 1.2.1 - After clicking on one of the buttons, independently, the Menu interface will appear, with some JCheckBoxes and their JSpinners to make the order.

![menu image](https://github.com/kauassilva/CapyLunch/blob/main/CapyLunch/src/assets/readme/interfaceMenuPedido.png)


### 1.2.2 - In the Pedido interface, Random methods were used so that the order number is always different. plus there is a process of adding and multiplying to correctly calculate the order price.

![pedido image](https://github.com/kauassilva/CapyLunch/blob/main/CapyLunch/src/assets/readme/interfacePedido.png)


### 1.2.3 - After completing the order, the Pagamento interface will appear, with two payment options: cash or card.

![pagamento image](https://github.com/kauassilva/CapyLunch/blob/main/CapyLunch/src/assets/readme/interfacePagamento.png)



## 👨‍💻 Authors 👩‍💻

* Kauã dos Santos Silva
  - LinkedIn: https://www.linkedin.com/in/kaua-santos/
  - GitHub: https://github.com/kauassilva
  
* Pedro Henrique Martins Kinoshita
  - LinkedIn: https://www.linkedin.com/in/pedro-kinoshita
  - GitHub: https://github.com/PedroKino

* Maria Clara Moura Maciel
  - LinkedIn: https://www.linkedin.com/in/maria-clara-moura-/
  - GitHub: https://github.com/MariaClara23

* Sofia Manuela Maggiuzzo Furlanetto
