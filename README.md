# Ejemplos de herencia, polimorfismo e interfaces en Java

Un vehículo es algo abstracto. Tiene peso, capacidad y velocidad máxima. Puede moverse un número determinado de metros y detenerse.

Existen tres subtipos de vehículos, también abstractos: terrestres (con un número de ruedas), acuáticos (que pueden ser sumergibles o no) y aéreos (con una altitud máxima alcanzable y la capacidad de despegar y aterrizar). Incluiremos dos tipos de vehículo para cada uno de estos subtipos (bicicleta, coche, moto de agua, yate, avión y helicóptero, respectivamente).

Independientemente del tipo de vehículo, todos los vehículos pueden ser de combustión (lo que permite que el vehículo pueda repostar), ser eléctricos (lo que hace que el vehículo pueda ser recargado) o ser impulsados por fuerza humana (por ejemplo: debe ser posible girar los pedales de una bicicleta).

Así, una bicicleta es un vehículo terrestre sin motor (aunque habrá bicicletas eléctricas); un coche, un vehículo terrestre que puede ser de combustión, eléctrico o híbrido (habrá 3 tipos de coches); las motos de agua y los yates son acuáticos y de combustión; y los aviones y helicópteros son aéreos y de combustión.

## Errores

La clase Errores.java contiene atributos estáticos con códigos de error.
