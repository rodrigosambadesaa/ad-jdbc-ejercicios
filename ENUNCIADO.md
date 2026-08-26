# Enunciado original — Ejercicios JDBC

Fuente: `010_EJERCICIOS JDBC.pdf` del módulo **Acceso a Datos**.

## Ejercicios 1–4 — base de datos `tienda`

Antes de comenzar, crea la base de datos `tienda`, importa `tienda.sql` y analiza las tablas `articulos`, `marcas` y `familias`.

1. Crea un programa que permita insertar artículos con código fijo de marca `2` y familia `PORT` hasta que el usuario teclee `*` como valor del campo `modelo`. Deben controlarse las excepciones, cerrarse la conexión y utilizar tipos Java/JDBC adecuados (`PreparedStatement`, `BigDecimal`, etc.).
2. Crea un programa que permita al usuario insertar una **familia**, una **marca** y, a continuación, un artículo para dicha familia y marca. Repetir hasta que se introduzca `*` como nombre de la familia.
3. Crea un programa que aumente, en un porcentaje indicado por el usuario, el precio de los artículos **sin descuento** e indique cuántos artículos se han actualizado.
4. Crea un programa que borre los artículos de la familia **portátiles** cuyo precio sea superior al indicado por el usuario e indique cuántos artículos se han borrado.

## Ejercicios 5–9 — base de datos `empresa`

Crea la base de datos `empresa`, importa `empresa.sql` y analiza las tablas `departamentos` y `empleados`.

5. Preparación para las consultas `SELECT` sobre la base de datos `empresa`.
6. Muestra un listado de los departamentos ordenados por nombre.
7. Muestra todos los empleados —número, nombre, puesto y salario— cuyo salario esté entre **1000 y 2500 euros**, ambos inclusive.
8. Muestra el número total de departamentos, el número total de empleados, el salario máximo y el salario medio de todos los empleados.
9. Muestra los empleados —número, nombre y nombre de departamento— cuyo nombre de departamento sea igual al introducido por teclado.

## Bases de datos originales

- [`database/tienda.sql`](database/tienda.sql)
- [`database/empresa.sql`](database/empresa.sql)
