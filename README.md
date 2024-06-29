# Árboles Binarios de Búsqueda en Java

Este repositorio contiene una implementación de Árboles Binarios de Búsqueda (BST) en Java, con explicaciones conceptuales, diagramas ilustrativos y código funcional.

![Árbol Binario de Búsqueda](https://github.com/FernandoHuilca/Arboles_Binarios_de_Busqueda/assets/134117009/2045c092-6e79-4c00-ad22-709a2bee06f5)

## Tabla de Contenidos

- [Introducción](#introducción)
- [Conceptos de Árboles Binarios de Búsqueda](#conceptos-de-árboles-binarios-de-búsqueda)
- [Diagramas](#diagramas)
- [Implementación en Java](#implementación-en-java)
- [Autores](#autores)

## Introducción

Un Árbol Binario de Búsqueda (BST) es una estructura de datos en forma de árbol, en la que cada nodo tiene como máximo dos hijos. En un BST, para cada nodo, los valores del subárbol izquierdo son menores que el valor del nodo y los valores del subárbol derecho son mayores. Esto permite realizar operaciones eficientes de búsqueda, inserción y eliminación.

## Conceptos de Árboles Binarios de Búsqueda

### Definición

Un Árbol Binario de Búsqueda es una estructura de datos que mantiene sus elementos en un orden específico para permitir búsquedas rápidas. Cada nodo contiene:

- **Valor**: El dato almacenado en el nodo.
- **Nodo Izquierdo**: Un puntero o referencia al subárbol izquierdo, que contiene valores menores que el nodo actual.
- **Nodo Derecho**: Un puntero o referencia al subárbol derecho, que contiene valores mayores que el nodo actual.

### Propiedades Claves

1. **Búsqueda Eficiente**: Permite buscar elementos en tiempo logarítmico promedio.
2. **Inserción y Eliminación**: Operaciones de inserción y eliminación también se pueden realizar en tiempo logarítmico promedio.
3. **Recorridos**: Soporta diferentes tipos de recorridos como inorden, preorden y postorden.

## Diagramas

A continuación se muestran algunos diagramas que ilustran la estructura y las operaciones en un Árbol Binario de Búsqueda:

<table>
  <tr>
    <td><img src="https://github.com/FernandoHuilca/Arboles_Binarios_de_Busqueda/assets/134117009/2045c092-6e79-4c00-ad22-709a2bee06f5"></td>
    <td><img src="https://github.com/FernandoHuilca/Arboles_Binarios_de_Busqueda/assets/134117009/2045c092-6e79-4c00-ad22-709a2bee06f5" alt="Diagrama 2"></td>
  </tr>
</table>

## Implementación en Java

El código fuente se encuentra en la carpeta `src` e incluye las siguientes funcionalidades:

1. **Insertar Nodo**
2. **Eliminar Nodo**
3. **Buscar Nodo**
4. **Recorridos de Árbol**: Inorden, Preorden, Postorden

### Ejemplos de Uso

#### Insertar un Nodo

```java
ArbolBinarioDeBusqueda arbol = new ArbolBinarioDeBusqueda();
arbol.insertar(10);
arbol.insertar(5);
arbol.insertar(15);
```

### Autores
[@FernandoHuilca](https://github.com/FernandoHuilca)
[@JuanMateoQ](https://github.com/JuanMateoQ)
[@SebasLS1](https://github.com/SebasLS1)
