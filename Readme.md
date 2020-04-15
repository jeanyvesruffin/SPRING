# SPRING

Remise � niveau Spring

## Commencer

Cloner le projet dans Eclipse pour executer et voir les diff�rents TP r�alis�s

### Conditions pr�alables

Sous Windows:

L'utilisation de chocolotey comme gestionnaire de package a �t� utilis�.

 [Installer chocolatey](https://chocolatey.org/)

### L'installation

Executer, en mode administrateur, dans votre powerShell, les lignes de commandes suivantes, afin d'installer les packages n�cessaires au lancement de votre environnement de d�veloppement.

**IDE Eclipse 4.15** 

```
choco install eclipse
```
**OpenJDK 14.0.0 14.0.0** 

```
choco install openjdk14
```
**Maven 3.6.3** 

```
choco install maven
```
**Apache Tomcat 9.0.30** 

```
choco install tomcat
```
**MySQL (Community Server) 8.0.19**

```
choco install mysql
```
**MySQL Connector - Java 8.0.15**

```
choco install mysql-connector-java
```
**MySQL Workbench 8.0.19**

```
choco install mysql.workbench
```
**Node JS 13.12.0**

```
choco install nodejs
```
**Git 2.26.0**

```
choco install git
```
**TcpView 3.05**

```
choco install tcpview
```
**telnet (Install) 0.9.0**

```
choco install telnet
```
**Spring Tool Suite 3.9.6**

```
choco install springtoolsuite
```

**Postman for Windows 7.20.1**

```
choco install postman
```

Rencontrant des difficult�s � utiliser postgresql, j'ai install� postgresql en suivant le [tutoriel](https://www.youtube.com/watch?reload=9&v=P-MvoWl5U-o) 

**PLUGINS ECLIPSE**

- EGit
- Eclipse Tomcat Plugin 9.1.4
- Java 14 Support for Eclipse 2020-03
- Maven (Java EE) Integration for Eclipse WTP (Luna/Mars) 1.2.0
- Spring Tools 3 (standalone Edition) 3.9.12.RELEASE
- Spring Tools 3 Add-On for Spring Tools 4 3.9.12.RELEASE
- Spring Tools 4 (aka Spring Tool Suite 4) 4.6.0.RELEASE



*En cours d'�dition End with an example of getting some data out of the system or using it for a little demo*

## Sommaire des concepts �tudi�s

* Presentation de Spring et ces concepts
* Cr�ation projet Maven
* Configuration de Spring
* Configuration de Bean
* Injection de setter
* Injection de constructeur
* Scopes
* Autowired
* Stereotypes
* Configuration utilisant XML
* Cycle de vie d'un Bean
* FactoryBean
* Expression Language
* Bean profil
* Utilisation de SpringBoot pour cr�er l'application + cr�ation et connexion � la base de donn�es postgresql
* Cr�ation de l'api Rest et ces methode CRUD pour l'application Spring Boot + test sur Postman
* Travail sur la configuration et l'environnement (prod, dev ..) Spring Boot

## Cr�ation d'une application de planification de r�union

 1. Creation Project Object Model (POM) � l'aide du site Spring.io:

 G�n�rer votre projet � l'aide de [spring.io]( https://start.spring.io/) - Spring initializr.
 Autres solutions et de g�n�rer le projet � l'aide de son IDE ou bien � l'aide de Spring Boot CLI.
 Decrompresser le projet genere � travers spring.io, faire l'importation dans son IDE run clean/ install Maven du .pom puis update.
 
 Cr�ation de 4 packages:
 * Controllers ==> API controllers
 * Models ==> Java Persistance API et autres info persistance.
 * Repositories ==> JPA repository
 * Services ==> service et code logic
 
 2.Installation de postgres et initilisation des tables et des datas � l'aide du repository [github](https://github.com/dlbunker/ps-first-spring-boot-app/tree/master/database/postgresql)
 3.Cr�er les fichiers de configuration n�cessaire � l'acc�s � la base de donn�es

## Construit avec

* [Maven](https://maven.apache.org/) - Dependency Management


## Remerciements

* [OpenClassRoom](https://openclassrooms.com/fr/courses/6173501-debutez-la-programmation-avec-java ) - D�butez la programmation avec java
* [Chaine YouTube du professeur Mohamed Youssfi](https://www.youtube.com/playlist?list=PLxr551TUsmAprMTVCc20Dy445O4UWxS02) - Programmation Orient�e Objet Java
* [Blog de Jos� Paumard](http://blog.paumard.org/cours/java/) - Java en ligne
* [Blog de JM Doudoux](https://www.jmdoudoux.fr/accueil_java.htm) - Programmation avec Java
* [Blog de MKyong](https://mkyong.com/) - Mkyong.com
* [Cours Pluralsight](https://app.pluralsight.com/library/) - Spring
* [Documentation Spring](https://docs.spring.io/spring/docs/3.0.0.M3/reference/html/ch04s04.html) - Spring.io
