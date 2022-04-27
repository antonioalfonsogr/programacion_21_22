# U8 - Entregable 1 - Recorrido XML, SAX y DOM

Siguiendo el vídeo y los materiales debéis hacer lo siguiente:

- Construir un `XML` que tenga  al menos 3 niveles, es decir, un nodo raíz, etiquetas hijas y etiquetas nietas. Debe haber al menos 5 etiquetas hijas y 3 etiquetas nietas para cada una de esas etiqueta hijas (todas ellas con contenido). Todas las etiquetas hijas deben tener algún atributo. Algo similar al ejemplo de `personasXML.xml`.

- Crear una clase `RecorridoSax` en cuyo método main se recorra ese fichero utilizando **Sax** y lo muestre por pantalla.

- Crear una clase `RecorridoDOM` que desde su main invoque a los siguiente métodos (que debéis también crear):

  - `numNodosHijos()` que mostrará por pantalla el número de nodos hijos (descendientes directos del nodo raíz) y el tipo de cada uno de esos nodos (etiqueta, texto, comentario).
  
  - `mostrarXMLDom()` que mostrará por pantalla el contenido del fichero XML llegando únicamente al primer nivel. A partir de ahí puedo mostrar el contenido completo de los nodos.
  
  - `mostrarContenidoEtiqueta(String s)` que recibe como parámetro una nombre de (etiqueta) y recorrerá las ocurrencias de esas etiquetas mostrando el contenido de los mismos. Si no hay ninguna ocurrencia de esa etiqueta  deberá mostrar un mensaje de aviso.

## <ins>Instrucciones para la Entrega</ins>

- Entregar ÚNICA Y EXCLUSIVAMENTE los ficheros necesarios. Serán ficheros sueltos, correspondientes a los ejercicios (
  Ej1.java, Ej2.java, Ej3.java, Ej4.java). Incluid también el fichero `XML`.

- EL fichero comprimido se llamará **Apellido1_Apellido2_U8_T1_SAX_DOM_Recorrido.zip** (o .rar)

- Evita ñ y acentos en los nombres.

- **Deberán subirse a GitHub** los ficheros sin comprimir en la carpeta correspondiente (U8_T1_SAX_DOM) que se encontrará dentro de
  la carpeta U8.

