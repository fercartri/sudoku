# Solucionador de Sudokus
En este repositorio se va a desarrollar un algoritmo de resolución de Sudokus a través del algortimo de vuelta atrás (backtracking).

## Historia
Los sudokus son unos rompecabezas matemáticos de origen japonés (1986) que se popularizaron en todo el mundo en el 2005.

## Objetivo
EL objetivo es rellenar una cuadrícula de 9x9 celdas (parcialmente rellenada al principio) divididas en subcuadrículas de 3x3 con números del 1 al 9. Las condiciones para rellenarlo y resolverlo es que no se puede repetir cifra en la misma fila, columna y subcuadrícula.

## Ejemplo resuelto
<p>
 --- --- --- <br>
|53_|_7_|___|<br>
|6__|195|___|<br>
|_98|___|_6_|<br>
 --- --- --- <br>
|8__|_6_|__3|<br>
|4__|8_3|__1|<br>
|7__|_2_|__6|<br>
 --- --- --- <br>
|_6_|___|_8_|<br>
|___|419|__5|<br>
|___|_8_|_79|<br>
 --- --- --- <br>
<br>
<br>
<br>
 --- --- --- <br>
|534|678|912|<br>
|672|195|348|<br>
|198|342|567|<br>
 --- --- --- <br>
|859|761|423|<br>
|426|853|791|<br>
|713|924|856|<br>
 --- --- --- <br>
|961|537|284|<br>
|287|419|635|<br>
|345|286|179|<br>
 --- --- --- <br>
</p>