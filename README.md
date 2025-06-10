# Nombre del Proyecto

## Descripción
Este es un proyecto Java EE que utiliza JBoss/Wildfly como servidor de aplicaciones. La aplicación está configurada para trabajar con Java 8.

## Tecnologías Utilizadas
- Java 8
- JBoss/Wildfly
- JavaServer Faces (JSF)
- JPA (Java Persistence API)
- Bean Validation

## Requisitos Previos
- JDK 8
- JBoss/Wildfly Server
- Maven (para gestión de dependencias)

## Configuración
El proyecto incluye una configuración específica de JBoss (jboss-deployment-structure.xml) que:
- Excluye el módulo de Hibernate por defecto
- Incluye las siguientes dependencias:
  - javax.persistence.api
  - javax.validation.api
  - javax.faces.api

## Instalación
1. Clonar el repositorio
2. Compilar el proyecto
3. Desplegar en JBoss/Wildfly
- Copiar el archivo WAR/EAR generado en la carpeta `target` al directorio de despliegue de JBoss

## Uso
[Añadir instrucciones específicas sobre cómo usar la aplicación]

## Contacto
[Añadir información de contacto]

## Licencia
[Especificar la licencia del proyecto]