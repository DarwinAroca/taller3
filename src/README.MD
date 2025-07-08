# 🐾 Sistema de Gestión Veterinaria - Proyecto en Java

**Autor:** Darwin Aroca  
**Correo:** darwin-aroca@hotmail.com

Este sistema permite gestionar la información relacionada con mascotas, sus dueños, el historial médico y las consultas veterinarias. El código aplica principios sólidos de programación orientada a objetos (POO), organizando el dominio veterinario de forma estructurada y reutilizable.

---

## 🧩 ¿Cómo Funciona el Proyecto?

1. **Registro de Mascotas y Propietarios:**  
   Cada `Mascota` se relaciona con un `Propietario` y posee atributos como nombre, especie y raza. Se asigna un ID único usando `IDGenerator`.

2. **Historial Médico:**  
   A través de la clase `Historial`, se pueden registrar múltiples `Consulta`, cada una con su código, fecha y diagnóstico.

3. **Consultas Veterinarias:**  
   Las consultas son realizadas por un `Veterinario` y almacenadas en el historial de la mascota. Incluyen fecha y diagnóstico.

4. **Identificadores Únicos:**  
   La clase `IDGenerator` asegura que cada entidad tenga un ID único y no repetido, fundamental para la trazabilidad.

5. **Ejecución del Programa:**  
   La clase `Main` muestra un ejemplo funcional: se crean instancias, se vinculan objetos y se imprime el historial clínico de una mascota.

---

## 🧪 Ejemplo de Uso

```java
Mascota m = new Mascota("Luna", "Gato", "Persa");
Propietario p = new Propietario("Carlos", "carlos@email.com");
Veterinario v = new Veterinario("Dra. Ana", "ana@vet.com");

Consulta c1 = new Consulta("001", "2025-07-08", "Revisión general");
Historial h = new Historial(m);
h.agregarConsulta(c1);

System.out.println(h.toString());

📁 Estructura de Archivos

/Veterinaria
│
├── IDGenerator.java      # Generador automático de IDs
├── Mascota.java          # Clase base para mascotas
├── Propietario.java      # Información del dueño
├── Veterinario.java      # Datos del médico veterinario
├── Consulta.java         # Registra una atención veterinaria
├── Historial.java        # Almacena el historial clínico
└── Main.java             # Clase de prueba y demostración

▶️ ¿Cómo Ejecutarlo?
Asegúrate de tener Java 17 o superior instalado.

Coloca todos los archivos .java en la misma carpeta.

Desde terminal:

javac *.java
java Main

También puedes usar un IDE como IntelliJ IDEA o Eclipse para compilar y ejecutar.

🧠 Conceptos Aplicados
Encapsulamiento y modularidad

Relaciones entre clases (composición y agregación)

Uso de colecciones (ArrayList)

Separación de responsabilidades

Generación automática de IDs

📌 Notas Finales
Este proyecto es un ejercicio académico diseñado para fortalecer la lógica de programación orientada a objetos. Puede ser fácilmente escalado para incluir persistencia de datos, interfaz gráfica o servicios web.

“Programar sistemas que ayudan a cuidar vidas —incluso las de nuestras mascotas— es una gran forma de aprender.” 🐶🐱