# Actividad 6: Gestión de Datos de Archivos

Este repositorio contiene la solución para la Actividad 6 de la asignatura Programación Orientada a Objetos, enfocada en la gestión de datos a través de archivos.

## Contenido del Proyecto

El proyecto incluye las siguientes funcionalidades/archivos:

* **`Usuario.java`**: Clase que representa la estructura de un usuario.
* **`Serializador.java`**: Clase encargada de la serialización y deserialización de objetos `Usuario`.
* **`ManipuladorArchivos.java`**: Clase para la lectura y escritura de datos desde/hacia archivos de texto.
* **`entrada.txt`**: Archivo de texto de ejemplo para entrada de datos.
* **`salida.txt`**: Archivo de texto donde se almacenan los resultados o datos procesados.
* Archivos `.class` compilados.

## Cómo Clonar y Ejecutar el Proyecto

Para obtener una copia local de este proyecto y ejecutarlo en tu entorno, sigue los siguientes pasos:

1.  **Asegúrate de tener Git y un JDK (Java Development Kit) instalados en tu sistema.**
2.  **Clonar el Repositorio:**
    Abre tu terminal (o Git Bash/PowerShell) y ejecuta el siguiente comando:
    ```bash
    git clone [https://github.com/stevenortizv/Actividad6-GestionDatos.git](https://github.com/stevenortizv/Actividad6-GestionDatos.git)
    ```
3.  **Acceder al Directorio del Proyecto:**
    Navega a la carpeta del proyecto clonado:
    ```bash
    cd Actividad6-GestionDatos
    ```
4.  **Compilar y Ejecutar (Ejemplo para Java):**
    Una vez dentro de la carpeta, puedes compilar (si es necesario) y ejecutar el programa principal (ajusta el nombre del archivo principal si no es `Main.java` o similar):
    ```bash
    javac *.java
    java ManipuladorArchivos
    ```
    (Reemplaza `ManipuladorArchivos` por el nombre de tu clase que contiene el método `main` si es diferente).
