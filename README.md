# 🧩 Solucionador de Sudokus - Algoritmo Backtracking

Este proyecto implementa un algoritmo de resolución de Sudokus utilizando la técnica de **vuelta atrás (backtracking)**, un enfoque eficiente y elegante para resolver este tipo de rompecabezas matemáticos.

---

## 📜 Historia del Sudoku

El **Sudoku** es un juego de lógica de origen japonés cuya popularidad explotó en 2005 a nivel global. Aunque su nombre significa "número único" en japonés, sus raíces provienen de un juego llamado *"Latin Square"*, desarrollado por el matemático suizo Leonhard Euler en el siglo XVIII. El formato moderno fue introducido en 1986 por el japonés **Maki Kaji**, conocido como el "padre del Sudoku".

---

## 🎯 Objetivo del Sudoku

El Sudoku consiste en completar una cuadrícula de **9x9**, dividida en subcuadrículas de **3x3**, siguiendo estas reglas:

1. Cada fila debe contener los números del **1 al 9**, sin repetir.
2. Cada columna debe contener los números del **1 al 9**, sin repetir.
3. Cada subcuadrícula de **3x3** debe contener los números del **1 al 9**, sin repetir.

El juego comienza con algunas celdas ya rellenadas, y el objetivo es completar las restantes respetando estas restricciones.

---

## 🧠 Método de Resolución

El algoritmo de **backtracking** utilizado en este proyecto sigue estos pasos:

1. **Exploración Secuencial**: Se recorre la cuadrícula para encontrar una celda vacía.
2. **Asignación Tentativa**: Se prueba un número en la celda respetando las reglas del Sudoku.
3. **Verificación**: Si el número es válido, se avanza a la siguiente celda. Si no, se intenta con el siguiente número.
4. **Retroceso (Backtrack)**: Si no se puede avanzar desde una celda, se retrocede y se cambia la asignación anterior.
5. **Repetición**: El proceso continúa hasta que la cuadrícula esté completa o se confirme que no tiene solución.

Este enfoque garantiza una solución eficiente y asegura que se respete la integridad del Sudoku.

---

## 📋 Ejemplo de Resolución

**Sudoku Sin Resolver**
```plaintext
 ------- ------- ------- 
| 5 3 · | · 7 · | · · · |
| 6 · · | 1 9 5 | · · · |
| · 9 8 | · · · | · 6 · |
 ------- ------- ------- 
| 8 · · | · 6 · | · · 3 |
| 4 · · | 8 · 3 | · · 1 |
| 7 · · | · 2 · | · · 6 |
 ------- ------- ------- 
| · 6 · | · · · | 2 8 · |
| · · · | 4 1 9 | · · 5 |
| · · · | · 8 · | · 7 9 |
 ------- ------- ------- 
```
**Sudoku Resuelto**
```plaintext
 ------- ------- ------- 
| 5 3 4 | 6 7 8 | 9 1 2 |
| 6 7 2 | 1 9 5 | 3 4 8 |
| 1 9 8 | 3 4 2 | 5 6 7 |
 ------- ------- ------- 
| 8 5 9 | 7 6 1 | 4 2 3 |
| 4 2 6 | 8 5 3 | 7 9 1 |
| 7 1 3 | 9 2 4 | 8 5 6 |
 ------- ------- ------- 
| 9 6 1 | 5 3 7 | 2 8 4 |
| 2 8 7 | 4 1 9 | 6 3 5 |
| 3 4 5 | 2 8 6 | 1 7 9 |
 ------- ------- ------- 
```
---

## 💡 Cómo Ejecutar

1. **Clona este repositorio**:  
   ```bash
   git clone https://github.com/tu_usuario/solucionador-sudoku.git
Compila y ejecuta el programa.
Asegúrate de que tu entorno soporta Java (si usas Java) o el lenguaje en el que implementaste el programa.

## 🛠️ Herramientas Utilizadas

- **Lenguaje:** Java (JDK 17).
- **Algoritmo:** Backtracking para la resolución del Sudoku.
- **Entorno de Desarrollo:** VSCode.


¡Espero que te sea útil!
