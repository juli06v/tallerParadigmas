Jerarquía de cuentas bancarias
* Creamos un sistema para un banco que tiene diferentes tipos de cuentas: básica, ahorros y corriente.
La clase principal es Account. Esta clase es abstracta ya que es el molde para crear los otros tipos de cuentas bancarias. Esta clase tiene todo lo que las demás cuentas necesitan; name, address, balance. (nombre, dirección y saldo). Y también tiene sus métodos; deposit, withdraw, changeAddress, getBalance. Todos estos son los métodos que las cuentas que van a heredar de esta necesitan. Esta clase principal también tiene un método especial y abstracto llamado printStatement(), es el que van a sobreescribir las demás clases.

* BasicAccount:
Esta es la cuenta más sencilla. Hereda sus atributos y métodos de la cuenta principal y definimos el método printStatement.

* SavingsAccount:
Esta es la cuenta de ahorros. Tiene todo lo anterior más un método propio que calcula el saldo básandose en los intereses. 

* CurrentAccount:
Esta es la cuenta corriente. También hereda de Account pero tiene varias cosas extra:
 1. overdraftLimit (límite de sobregiro); en esta cuenta se puede retirar más dinero del que se tiene, por lo tanto, se puede quedar debiendo dinero (hasta cierto límite)
 2. pin; para verificar que el pin sea correcto. compara el pin guardado con el que la persona ingresó
 3. método printCheckbook; al ser una cuenta corriente, se necesitan cheques. este método mprime el número de cheque 