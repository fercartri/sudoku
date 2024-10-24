# Solucionador de Sudokus
En este repositorio se va a desarrollar un algoritmo de resolución de Sudokus a través del algortimo de vuelta atrás (backtracking).

## Historia
Los sudokus son unos rompecabezas matemáticos de origen japonés (1986) que se popularizaron en todo el mundo en el 2005.

## Objetivo
EL objetivo es rellenar una cuadrícula de 9x9 celdas (parcialmente rellenada al principio) divididas en subcuadrículas de 3x3 con números del 1 al 9. Las condiciones para rellenarlo y resolverlo es que no se puede repetir cifra en la misma fila, columna y subcuadrícula.

## Ejemplo resuelto
<p>
 --------- --------- --------- 
| 5  3    |    7    |         |
| 6       | 1  9  5 |         |
|    9  8 |         |    6    |
 --------- --------- --------- 
| 8       |    6    |       3 |
| 4       | 8     3 |       1 | 
| 7       |    2    |       6 |
 --------- --------- --------- 
|    6    |         |    8    |
|         | 4  1  9 |       5 |
|         |    8    |    7  9 |
 --------- --------- --------- 



 --------- --------- --------- 
| 5  3  4 | 6  7  8 | 9  1  2 |
| 6  7  2 | 1  9  5 | 3  4  8 |
| 1  9  8 | 3  4  2 | 5  6  7 |
 --------- --------- --------- 
| 8  5  9 | 7  6  1 | 4  2  3 |
| 4  2  6 | 8  5  3 | 7  9  1 | 
| 7  1  3 | 9  2  4 | 8  5  6 |
 --------- --------- --------- 
| 9  6  1 | 5  3  7 | 2  8  4 |
| 2  8  7 | 4  1  9 | 6  3  5 |
| 3  4  5 | 2  8  6 | 1  7  9 |
 --------- --------- --------- 
</p>