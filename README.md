Paula Natalia Paez Vega

Manuel Felipe Barrera Barrera

Andres Felipe Chaparro

LA HERRAMIENTA DE MAVEN

El objetivo principal de Maven es permitir que un desarrollador comprenda el estado completo de un esfuerzo de desarrollo en el menor tiempo posible

1- Cuál es su mayor utilidad

Maven se utiliza principalmente para proyectos basados ​​en Java, ayudando a descargar dependencias

-Facilita el proceso de construcción.
-Proporcionar un sistema de construcción uniforme.
-Proporcionar información de calidad de un proyecto.
-Fomentar mejores prácticas de desarrollo.

2-Fases de Maven

calidate: valida que el proyecto esta correcto y tienen toda la información necesaria para su construcción
compile:compila el código fuente del proyecto.
test: lanza los test de la aplicación. Estos test no
necesitan que la aplicación este empaquetada ni
desplegada.
package: toma las clases compiladas y recursos y
crea un paquete con el proyecto (jar, war, ear)
integration-test: procesa y despliega el paquete antes
si es necesario para que corran las pruebas de
integración.
verify: realiza algún tipo de chequeo para comprobar si
el paquete cumple unas normas de calidad.
install: instala el paquete en el repositorio local para
ser usado como dependencia por otros proyectos
localmente.
deploy: copia el paquete a un repositorio remoto para
ser compartido con otros usuarios y proyectos.

3-Ciclo de vida de la construcción.

default: Este ciclo de vida es el principal y cubre todo el proceso de construcción de un proyecto, desde la validación del código fuente hasta su empaquetado y distribución.

clean: Este ciclo de vida se encarga de limpiar el proyecto antes de comenzar una nueva construcción, eliminando los archivos generados previamente.

site: Este ciclo de vida se utiliza para generar documentación y reportes sobre el proyecto.

4-Para qué sirven los plugins:

Son complementos que añaden funcionalidades extra o mejoras a los programas. Es decir, son miniprogramas que suman alguna característica que no venía por defecto en el programa original

5-Qué es y para qué sirve el repositorio central de Maven

Es un repositorio remoto donde se encuentran la mayoría de librerías que se utilizan en los desarrollos de software, y que la propia herramienta se descarga cuando sea necesario.

Este permite que los archivos como, por ejemplo, archivos JAR tengan versiones distintas que se descubren después fácilmente con un mecanismo de denominación bien conocido

HACER EL ESQUELETO DE LA APLICACIÓN

¿Cuál fábrica hiciste? y ¿Cuál es mejor?

Hicimos la Simple Factory
La Simple Factory, porque es un patrón de diseño que encapsula la creación de objetos en un solo lugar. Tienes una única clase que crea instancias de diferentes tipos de objetos basados en parámetros de entrada.

Ejecute múltiples veces la clase ShapeMain, usando el plugin exec de maven con los siguientes parámetros y verifique la salida en consola para cada una:

Sin parámetros 
Parámetro: qwerty
Parámetro: pentagon
Parámetro: Hexagon
¿Cuál(es) de las anteriores instrucciones se ejecutan y funcionan correctamente y por qué?

la salida sin parametros nos arroja lo siguiente : Parameter of type RegularShapeType is required. que es el mensaje que sugiere el shape main , para una ejecucion sin paramatros 

la salida con parametro qwerty nos arroja lo siguiente :  "Parameter qwerty is not a valid RegularShapeType", acorde a la excepcion creada

Las siguintes dos salidas sugiere que tanto el pentago como el hexagono se crearon de manera satisfactoria 


