A continuación, presentamos una breve documentación sobre los códigos realizados.

Código N.1: Choose a programming language (such as FORTRAN or PASCAL) that has built-in features for text input/output. Design (but do not implement) a package that provides equivalent functionality. The user of your package should be able to achieve all of your language’s text input/output capabilities without using any
of the language’s built-in features. 

Básicamente, en el lenguaje de preferencia (en este caso ELM), debíamos hacer una interfaz de usuario. Diseñarla más no implementarla, sólo declaramos funciones o procedimientos que tendría nuestro paquete.

El código que pertenece a este punto es puntoUno; empezamos con el diseño del módulo llamado TextIO, en este, definimos qué funciones estamos ofreciento para el usuario, más no cómo funciona internamente. Después diseños como tal lo que puede hacer el usuario en el módulo.

Código N.2: Equip your abstract type with operations such as magnitude, complex addi- tion, complex subtraction, and complex multiplication. (b) Suggest an efficient representation for your abstract type.

En este código (puntoDos) nos pedían diseñar un tipo Abstracto llamado Complex, debía representar los números complejos. Definimos el Abstracto como un tipo de dato el cual sabemos qué hace pero no cómo está hecho por dentro. Es similar al anterior ya que estamos viendo lo que hace pero no cómo lo está haciendo.
Primero, creamos el módulo Complex y en exposing (...) estamos definiendo qué es lo que las otras personas pueden usar. Después, en type Complex decimos que un numero complejo tiene dos números décimales (float).
En la función complex se está creando el número imaginario. En la primera línea dice que recibe dos Float y devuelve un Complex. En la segunda línea toma los dos números y crea el número complejo. 
Después de esto, empezamos con las operaciones de magnitud, suma, resta y multiplicación. Para la magnitud, usamos sqrt que es para sacar la raíz cuadrada, y, en la multiplicación, usamos la fórmula oficial para los números imaginarios.

Código N.3: (a) Design a Date abstract type, whose values are calendar dates. Equip your abstract type with operations such as equality test, comparison (‘‘is before’’),

En este tercer código (puntoTres), diseñamos un tipo abstracto Date. Es decir, crear un tipo que represente una fecha en el calendario y que tenga operaciones como: ver si dos fechas son iguales o ver si una fecha es antes que otra.

De igual forma, hicimos un módulo en el que desde afuera solo se puede usar date, isEqual, isBefore. type Date guarda tres números enteros que serían día, mes y año. En Elm no usamos métodos, únicamente funciones. Así que, siguiendo lo anterior, hicimos una función date para crear fechas. Y, por último, las operaciones para ver si una fecha es igual a otra, o por otro lado, si es antes que otra.
