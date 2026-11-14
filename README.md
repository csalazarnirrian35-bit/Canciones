# Sistema web de Catálogo Musical Relacional (Spring Boot MVC) 🎵
¡Bienvenida/o! Este proyecto consiste en una aplicación web Backend, desarrollada bajo el patrón arquitectónico MVC (Modelo - Vista- Controlador) utilizando el ecosistema de **Spring Boot**.

## Arquitectura y Capas del Proyecto
El código fuente implementa una separación de responsabilidades limpia, estructurada en las siguientes capas de desarrollo:

* **Modelos (`com.cynthiasalazar.modelos`):** Clases de dominio(artistas, cancion) que mapean las entidades relacionales de la base de datos mediante anotaciones de JPA/Hibernate.
* **Servicios (`com.cynthiasalazar.servicios`):** Capa encargada de encapsular la lógica de negocio y realiza las llamadas operacionales hacia los repositorios.
* **Controladores (`com.cynthiasalazar.controladores`):** Orquestadores del flujo web. Gestionan las peticiones HTTP y exponen los modelos hacia las vistas `.jsp`.

## Stack Tecnológico

* **Lenguaje:** Java 17
* **Framework Principal:** Spring Boot
* **Inyección de Dependencias:** Basada en Constructor(`ControladorCanciones`) y anotación `@Autowired`
* **Mapeo del Modelo Relacional:** Spring Data JPA/ Hibernate
* **Motor de Vistas:** JSP (JavaServer Pages) & JSTL
* **Gestor de Dependencias:** Apache Maven
* **Base de Datos:** MYSQL
 

## Características Técnicas Destacadas

### 1. *Gestión Relacional de Datos(Modelamiento de Entidades)*
* **Enlace de Claves Foráneas:** Implementación de flujos lógicos que capturan el identificador único del "artista" (`artistaId`) para asociarlo directamente al objeto "Cancion" antes de su persistencia en el sistema.
* **Consistencia en Formularios Dinámicos:** Los Controladores aseguran el reabastecimiento continuo de colecciones de datos relacionales hacia la vista, evitando la pérdida de información ante eventos de error de validación.

### 2. *Ciclo CRUD Completo y limpio*
* **Manejo de Variables de Ruta:** Uso eficiente de `@PathVariable` para operaciones quirúrgicas de consultas por ID(`/canciones/detalle/{id}`) y eliminación de registros(`@DeleteMapping`).
* **Arquitectura REST Interna:** Uso de anotaciones semánticas modernas (`@GetMapping`, `@PostMapping`, `@PutMapping`, `@DeleteMapping`) para mapear con precisión las interacciones del usuario sobre el gestor musical.
* **Validación Activa:** Uso de `@Valid` y `BindingResult` para interceptar datos corruptos o incompletos directamente en la frontera del BackEnd, garantizando que ninguna canción se guarde sin cumplir las reglas del negocio. 

## Requisitos y Ejecución Local
Para clonar y ejecutar este servicio de forma local, necesitas tener instalado Java JDK 17, Apache Maven y un servidor MYSQL activo.

```bash
# 1. Clonar este repositorio
 git clone https://github.com/csalazarnirrian35-bit/Canciones
# 2. Ingresar al directorio del proyecto
 cd Canciones
# 3. Compilar y empaquetar el proyecto
 mvn clean install
# 4. Iniciar la aplicación
 mvn spring-boot:run
```
Navega e interactúa con el catálogo musical a través de la dirección local: `https://localhost:8080`
---

## Información de Contacto

* **Nombre:** Cynthia Salazar Nirrian
* **LinkedIn Profesional:** [www.linkedin.com/in/cynthia-salazar-nirrian-1b43a7435]
* **Certificación:** Egresada del Bootcamp Full Stack Java - Mujeres en Tecnología (Skillnest / Banco de Chile).



