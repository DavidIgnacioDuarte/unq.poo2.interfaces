# Clases Abstractas vs Interfaces


## Objetivos
- Comprender las diferencias, ventajas y desventajas del uso de _clases abstractas_ e _interfaces_ en el paradigma de la **Programaci�n Orientada a Objetos** en **Java**; tanto en dise�o como de implementaci�n.



## Tips
- Validar implementaci�n con **tests de unidad**.



### Conceptos

- **Clase Abstracta**: Clase que no permite ser instanciada. Su utilidad consiste en proveer  _estructura_ (atributos) y  _comportamiento_ (m�todos) com�n a todas las subclases que heredan de ella.

- **Interfaz**: Medio que define un  _protocolo_ (conjunto de mensajes) en com�n entre clases. Permite especificar un contrato a seguir entre las clases que la implementen, mediante la declaraci�n de  _constantes_  y  _m�todos_ .

- **Polimorfismo**: Propiedad que permite enviar  _mensajes_  sint�cticamente iguales a  _objetos_  de distintos tipos. 2 o m�s  _objetos_  pueden ser  **polim�rficos**  para un tercero.


### Preguntas

1. **�**Qu� ventajas, en cuanto a polimorfismo, brindan las interfaces en Java**?**
La principal ventaja es que nos permite establecer un  _polimorfismo_  entre clases de diferentes tipos, sin la necesidad de que est�n relacionadas entre ellas.
2. **�**Por qu� no siempre puedo utilizar clases abstractas para agrupar clases polim�rficas**?**
Esto es as� debido a que una clase abstracta re�ne tanto una  _estructura_ ,  _comportamiento_  y un  _protocolo_  a heredar de cada una de sus  _subclases_ . Y esto nos genera muchas restricciones en un contexto determinado, donde �nicamente buscamos un polimorfismo en cuanto al   _protocolo_ .
3. **�**Qu� ventajas tienen las clases abstractas sobre las interfaces**?**
La principal ventaja es que las clases abstractas aportan funcionalidades en com�n y no s�lo un contrato a seguir. De este modo, cada subclase heredar� su estructura y comportamiento, y especificar� los correspondientes.
4. **�**Se puede instanciar una interface**?**
No. S�lo pueden ser implementadas por clases, o extendidas por otras interfaces.
5. **�**Por qu� no es recomendable incrementar o modificar las firmas definidas en una interface**?**
Porque esto puede generar una ambiguedad si el c�digo se extiende y llegamos a implementar m�s interfaces.
6. **�**Por qu�, en lenguajes como **Smalltalk**, no es necesaria la implementaci�n de interfaces**?**
Esto es as�, al igual que en el lenguaje **Wollok**, ya que los mismos no son  _est�ticamente tipados_ , y no ser� necesaria una interfaz que permita tipar clases diferentes para que act�en polim�rficamente ante un tercero.
















