<h1>Literalura 📚📖🔖</h1>

![Static Badge](https://img.shields.io/badge/ESTADO%20-EN%20DESARROLLO%20-%20GREEN)
![Static Badge](https://img.shields.io/badge/JAVA%20-%20JDK%2017-%20blue)
![Static Badge](https://img.shields.io/badge/GSON%20-%202.10.1%20-%20gray)
![Static Badge](https://img.shields.io/badge/Maven%20-%204.0.0%20-%20purple)
![Static Badge](https://img.shields.io/badge/Spring%20Boot%20-%203.4.1%20-%20red)
![Static Badge](https://img.shields.io/badge/Postgresql%20-%2016%20-%20orange)



### Descripción 📝
<h3>Challenge de Literalura - ONE </h3>
<p>Este proyecto plantea la utilización de los recursos de java con el frame de Spring Boot, para consultar y almacenar información de la API Gutendex en una base de datos local, permitiendo 
  la persistencia de los datos consultados.. 
  "Literalura" permite realizar solicitudes a la API, analizar la respuesta JSON, filtrar la información bibliografica de los libros o autores consultados, y realizar persistencia y guardado de la
  información obtenida en una base de datos local. 

  El menú de funciones ofrecidas por Literalura permite:
  - Buscar libros por titulo
  - Buscar autor por nombre
  - Mostrar libros registrados
  - Mostrar autores registrados
  - Mostrar autores vivos en un año especifico
  - Mostrar libros registrados por idioma
  - Mostrar autores nacidos en determinado año
  - Mostrar autores nacidos en determinado año
  - Top 10 libros descargados en el portal Gutendex
  - Estadisticas generales (cantidades de descarga, entre otros)
 
  </p>

## Tecnologías Utilizadas🖥️
- **`Lenguaje de Programación:`** Java - JDK 17
- **`Entorno de Desarrollo Integrado (IDE)`**: IntelliJ IDEA 
- **`API Bibliográfico Proyecto Gutenberg - Gutendex`**: Gutendex API: permite obtener información bibliografica de libros digitales (ebook).
- **`Librería GSON`**: Gson JAR 2.10.1, permite analizar las respuestas JSON de la API, y convertirla en objetos en JAVA para manipularlos.
- **`Proyecto Maven`**: Maven 4.0.0, Estructura de librerias del proyecto.
- **`Spring Framework`**: Spring Boot 3.4.1. Estructura del proyecto
- **`Postgresql`**: Postgresql 16.0. Gestor local de base de datos
-  **`Control de Versiones`**: Git / GitHub

## Funcionalidad del Proyecto 🛠️
- **`Interfaz`**: El proyecto incialmente presenta una interfaz por la consola del IDE, en la que se presenta un menú de operaciones y se puede introducir la información para la solicitud de las consultas de Libros y autores.
- **`Operación`**: Se pueden realizar las operaciones predefinidas en el menú, para verificar la información bibliografica. 


## Alcances Futuros ⏱️
- **`Desarrollo de interfaz`**: generar una interfaz gráfica ejecutable en el navegador, que permita la interacción del usuario con el programa y haga más dinamica la experiencia con él y que permitan la gestión de las consultas de una forma mejor.
- **`Cuentas de Usuario`**: permitir que los usuarios puedan crear su perfil en el que puedan guardar la información de las consultas bibliograficas realizadas
- **`Integrar otras API`**: aumentar la confianza y veracidad de los resultados integrando en el funcionamiento otras APIs, que suministren información que el API actual no posea y complemente la experiencia de busqueda de los usuarios.pueda seleccionar a que api realizar las consultas bibliograficas.
