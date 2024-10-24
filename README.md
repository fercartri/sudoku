# Solucionador de Sudokus
En este repositorio se va a desarrollar un algoritmo de resolución de Sudokus a través del algoritmo de vuelta atrás (backtracking).

## Historia
Los sudokus son unos rompecabezas matemáticos de origen japonés (1986) que se popularizaron en todo el mundo en el 2005.

## Objetivo
El objetivo es rellenar una cuadrícula de 9x9 celdas (parcialmente rellenada al principio) divididas en subcuadrículas de 3x3 con números del 1 al 9. Las condiciones para rellenarlo y resolverlo es que no se puede repetir cifra en la misma fila, columna y subcuadrícula.

## Ejemplo resuelto

```plaintext
 --- --- ---
|53_|_7_|___|
|6__|195|___|
|_98|___|_6_|
 --- --- ---
|8__|_6_|__3|
|4__|8_3|__1|
|7__|_2_|__6|
 --- --- ---
|_6_|___|_8_|
|___|419|__5|
|___|_8_|_79|
 --- --- ---

 --- --- ---
|534|678|912|
|672|195|348|
|198|342|567|
 --- --- ---
|859|761|423|
|426|853|791|
|713|924|856|
 --- --- ---
|961|537|284|
|287|419|635|
|345|286|179|
 --- --- ---
