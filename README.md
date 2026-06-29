# Calidad de Software
# Sesión 31 - 32 - 33: Mejores prácticas en Desarrollo de Software

# Reflexiones

# Darwin López: Enfoque en Organización (SRP)
Desafío: El principio más complejo fue el SRP. Aunque parece simple, decidir dónde termina una responsabilidad y empieza otra requiere mucha práctica para no fragmentar el código en exceso.
Mejora de diseño: SOLID transforma el código de ser un "bloque de cemento" a ser un "set de LEGO". Permite que cada pieza sea independiente, facilitando que el mantenimiento sea quirúrgico y no afecte a todo el sistema.
Aplicabilidad: Aplicaré el SRP en todos mis proyectos actuales, ya que tener clases pequeñas y enfocadas es la mejor forma de evitar errores difíciles de rastrear.
# Dilan Herrera: Enfoque en Escalabilidad (OCP/DIP)
Desafío: La Inversión de Dependencias (DIP) fue el mayor reto. Cambiar el hábito de instanciar clases directamente para pasar a usar interfaces requiere un cambio de paradigma mental importante sobre cómo se conectan los módulos.
Mejora de diseño: Estos principios eliminan la rigidez. Un software diseñado con SOLID puede crecer y adaptarse a nuevos requisitos de negocio casi sin esfuerzo, reduciendo drásticamente el costo de desarrollo a largo plazo.
Aplicabilidad: El principio OCP es el que más usaré. Diseñar sistemas "abiertos a la extensión" es vital para cualquier aplicación que necesite integrar nuevas funciones (como métodos de pago) de forma rápida.
# José Carvajal: Enfoque en Seguridad (LSP)
Desafío: Entender el Principio de Sustitución de Liskov fue lo más desafiante. Me hizo cuestionar cómo usamos la herencia y por qué a veces es mejor usar interfaces que obligar a una subclase a heredar comportamientos que no le corresponden (como el pez caminando).
Mejora de diseño: SOLID mejora la predictibilidad. Al seguir estos principios, el desarrollador puede confiar en que una subclase no romperá el programa al ser usada, eliminando las excepciones por operaciones no soportadas.
Aplicabilidad: Aplicaré el LSP y la segregación de interfaces para crear jerarquías de clases más lógicas y seguras, evitando el "código muerto" o peligroso.
# Daniel Diaz: Enfoque en Mantenibilidad (ISP)
Desafío: El principio ISP me pareció el más retador de identificar en el código base. Fue necesario analizar profundamente qué métodos realmente utilizaba cada cliente para poder dividir las interfaces de forma cohesiva.
Mejora de diseño: Reduce el acoplamiento innecesario. Al no obligar a las clases a depender de métodos que no usan, el código se vuelve más ligero y las actualizaciones de una interfaz no afectan a clientes que no tienen relación con esos cambios.
Aplicabilidad: Usaré el DIP para desacoplar mis capas de datos de la lógica de negocio, permitiendo que mis aplicaciones sean agnósticas a la tecnología de base de datos o servicios externos.