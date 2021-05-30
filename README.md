# Clases Abstractas vs Interfaces


## Objetivos
- Comprender las diferencias, ventajas y desventajas del uso de _clases abstractas_ e _interfaces_ en el paradigma de la **Programación Orientada a Objetos** en **Java**; tanto en diseño como de implementación.



## Tips
- Validar implementación con **tests de unidad**.



### Conceptos

- **Clase Abstracta**: Clase que no permite ser instanciada. Su utilidad consiste en proveer  _estructura_ (atributos) y  _comportamiento_ (métodos) común a todas las subclases que heredan de ella.

- **Interfaz**: Medio que define un  _protocolo_ (conjunto de mensajes) en común entre clases. Permite especificar un contrato a seguir entre las clases que la implementen, mediante la declaración de  _constantes_  y  _métodos_ .

- **Polimorfismo**: Propiedad que permite enviar  _mensajes_  sintácticamente iguales a  _objetos_  de distintos tipos. 2 o más  _objetos_  pueden ser  **polimórficos**  para un tercero.


### Preguntas

1. **¿**Qué ventajas, en cuanto a polimorfismo, brindan las interfaces en Java**?**
La principal ventaja es que nos permite establecer un  _polimorfismo_  entre clases de diferentes tipos, sin la necesidad de que estén relacionadas entre ellas.
2. **¿**Por qué no siempre puedo utilizar clases abstractas para agrupar clases polimórficas**?**
Esto es así debido a que una clase abstracta reúne tanto una  _estructura_ ,  _comportamiento_  y un  _protocolo_  a heredar de cada una de sus  _subclases_ . Y esto nos genera muchas restricciones en un contexto determinado, donde únicamente buscamos un polimorfismo en cuanto al   _protocolo_ .
3. **¿**Qué ventajas tienen las clases abstractas sobre las interfaces**?**
La principal ventaja es que las clases abstractas aportan funcionalidades en común y no sólo un contrato a seguir. De este modo, cada subclase heredará su estructura y comportamiento, y especificará los correspondientes.
4. **¿**Se puede instanciar una interface**?**
No. Sólo pueden ser implementadas por clases, o extendidas por otras interfaces.
5. **¿**Por qué no es recomendable incrementar o modificar las firmas definidas en una interface**?**
Porque esto puede generar una ambiguedad si el código se extiende y llegamos a implementar más interfaces.
6. **¿**Por qué, en lenguajes como **Smalltalk**, no es necesaria la implementación de interfaces**?**
Esto es así, al igual que en el lenguaje **Wollok**, ya que los mismos no son  _estáticamente tipados_ , y no será necesaria una interfaz que permita tipar clases diferentes para que actúen polimórficamente ante un tercero.
















