# Calculadora: Taller de Integración Continua y Despliegue

Este proyecto es una aplicación de consola en Java que realiza operaciones de cálculo básicas.  
El objetivo principal es demostrar un flujo de trabajo de **Integración Continua (CI)** utilizando **GitHub Actions** y **Maven**, siguiendo las mejores prácticas de la industria.

---

## Objetivos del Proyecto

El desarrollo de esta aplicación tuvo los siguientes objetivos principales:

- **Creación de un proyecto Java con Maven**: 
  - Configurar un proyecto estándar para gestionar dependencias y el ciclo de vida del build.
- **Desarrollo de una aplicación funcional**: 
  - Implementar una lógica simple de calculadora para validar el proceso de compilación.
- **Configuración de pruebas unitarias**: 
  - Implementar pruebas automáticas para garantizar el correcto funcionamiento del código.
- **Configuración de un pipeline de CI en GitHub Actions**: 
  - Automatizar la compilación y ejecución de pruebas con cada cambio en el repositorio.
- **Documentación clara y concisa**: 
  - Explicar cada componente del proyecto y el flujo de trabajo de CI en el archivo `README.md`.

---

## 📊 Reportes de Pruebas con Allure

Para complementar las pruebas unitarias, este proyecto utiliza **Allure Reports**, una herramienta que genera reportes en HTML con métricas, colores y navegación amigable.

### 🔹 Ejecución local

1. Ejecuta las pruebas y genera los resultados para Allure:

```bash
./mvnw clean test
```

## Comandos Usados

A continuación se listan los comandos principales utilizados en el desarrollo y en el pipeline de CI:

```bash
mvn package     # Compila el código fuente y empaqueta el proyecto
mvn test        # Ejecuta las pruebas unitarias del proyecto
java -jar target/calculadora.jar   # Ejecuta la aplicación Java empaquetada

## ⚙️ Explicación del Pipeline de CI

El pipeline de Integración Continua se configura en el archivo `.github/workflows/ci.yml`.  
Se ejecuta automáticamente con cada **push** o **pull request** al repositorio.

El pipeline consta de los siguientes pasos:

- **actions/checkout@v2** → Clona el repositorio en el entorno de GitHub Actions.  
- **actions/setup-java@v2** → Instala el JDK de Java 17 necesario para compilar el proyecto.  
- **Build with Maven** → Compila la aplicación usando Maven.  
- **Run tests** → Ejecuta todas las pruebas unitarias para asegurar la calidad del código.  

> ⚠️ Si alguno de estos pasos falla (por ejemplo, si una prueba no pasa), el pipeline se detiene y notifica al desarrollador, evitando que se fusione código defectuoso.

## ⚙️ Explicación del Pipeline de CI

El pipeline de Integración Continua se configura en el archivo `.github/workflows/ci.yml`.  
Se ejecuta automáticamente con cada **push** o **pull request** al repositorio.

El pipeline consta de los siguientes pasos:

- **actions/checkout@v2** → Clona el repositorio en el entorno de GitHub Actions.  
- **actions/setup-java@v2** → Instala el JDK de Java 17 necesario para compilar el proyecto.  
- **Build with Maven** → Compila la aplicación usando Maven.  
- **Run tests** → Ejecuta todas las pruebas unitarias para asegurar la calidad del código.  

> ⚠️ Si alguno de estos pasos falla (por ejemplo, si una prueba no pasa), el pipeline se detiene y notifica al desarrollador, evitando que se fusione código defectuoso.

