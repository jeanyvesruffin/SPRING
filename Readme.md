# SPRING

<!-- TOC -->

- [SPRING](#spring)
    - [Commencer](#commencer)
        - [Conditions prealables](#conditions-prealables)
        - [L'installation](#linstallation)
        - [Maven Dependency](#maven-dependency)
    - [Sommaire des concepts etudies](#sommaire-des-concepts-etudies)
    - [Creation d'une application de planification de reunion](#creation-dune-application-de-planification-de-reunion)
    - [Construit avec](#construit-avec)
    - [Remerciements](#remerciements)

<!-- /TOC -->

## Commencer

Cloner le projet dans Eclipse pour executer et voir les differents TP realises

### Conditions prealables

Sous Windows:

L'utilisation de chocolotey comme gestionnaire de package a ete utilise.

 [Installer chocolatey](https://chocolatey.org/)
 
Deployement cloud sur Heroku.

### L'installation

Executer, en mode administrateur, dans votre powerShell, les lignes de commandes suivantes, afin d'installer les packages necessaires au lancement de votre environnement de developpement.

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
**Heroku Command Line Interface (CLI) (Install) 7.39.3.0**

```
choco install heroku-cli
```


Rencontrant des difficultes a utiliser postgresql, j'ai installe postgresql en suivant le [tutoriel](https://www.youtube.com/watch?reload=9&v=P-MvoWl5U-o) 

**PLUGINS ECLIPSE**

- EGit
- Eclipse Tomcat Plugin 9.1.4
- Java 14 Support for Eclipse 2020-03
- Maven (Java EE) Integration for Eclipse WTP (Luna/Mars) 1.2.0
- Spring Tools 3 (standalone Edition) 3.9.12.RELEASE
- Spring Tools 3 Add-On for Spring Tools 4 3.9.12.RELEASE
- Spring Tools 4 (aka Spring Tool Suite 4) 4.6.0.RELEASE
- ResourceBundle Editor



*En cours d'edition End with an example of getting some data out of the system or using it for a little demo*

### Maven Dependency

* spring-boot-starter-web
* spring-boot-starter-jetty
* spring-boot-starter-data-jpa
* postgresql
* spring-boot-starter-test
* spring-boot-maven-plugin


## Sommaire des concepts etudies

* Presentation de Spring et ces concepts
* Creation projet Maven
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
* Creation application avec connexion a la base de donnees postgresql
* Creation de l'api Rest et de ces methodes CRUD et test API sur Postman
* Travail sur la configuration et l'environnement (prod, dev ..) Spring Boot
* Deployement de l'application sur Jelly vs Tomcat
* Deployement en mode standalone
* Deployement cloud Heroku
* Creation du fichier WAR pour le deployement sping boot

## Creation d'une application de planification de reunion
 (https://github.com/jeanyvesruffin/Heroku.git)

**Creation Project Object Model (POM) a l'aide du site Spring.io:**

 Generer votre projet a l'aide de [spring.io]( https://start.spring.io/) - Spring initializr.
 Autres solutions et de generer le projet a l'aide de son IDE ou bien a l'aide de Spring Boot CLI.
 Decrompresser le projet genere a travers spring.io, faire l'importation dans son IDE run clean/ install Maven du .pom puis update.
 
1. Creation de 4 packages:
 * Controllers ==> API controllers
 * Models ==> Java Persistance API et autres info persistance.
 * Repositories ==> JPA repository
 * Services ==> service et code logic
 
 
2. Installation de postgres et initilisation des tables et des datas a l'aide du repository [github](https://github.com/dlbunker/ps-first-spring-boot-app/tree/master/database/postgresql)
 
3. Creer les fichiers de configuration necessaire a l'acces a la base de donnees
 
4. Deployement application sur environnement Jelly vs Tomcat
 
5. Deployement application en mode standalone
	
Generer le .jar avec Maven et avec son parametre goal renseigne a package (vs clean install ..etc)
Retrouve le fichier de deployement dans le dossier Target (first-Spring-Boot-Application-0.0.1-SNAPSHOT.jar)
Executer le fichier jar a l'aide d'un terminal (pointant sur le dossier target) $ java -jar first-Spring-Boot-Application-0.0.1-SNAPSHOT.jar

La seconde methode consiste a creer notre executable a travers le fichier .pom. Pour cela ajouter au build le tag configuration

	<plugin>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-maven-plugin</artifactId>
		<configuration>
			<executable>true</executable>
		</configuration>
	</plugin>
  
**BUG FIX:** attention de fermer l'execution du .jar precedent et quitter le terminal sinon genere une erreur.

On execute ensuite la commande Maven package puis dans un terminal pointant sur le dossier target executer la commande: $ ./first-Spring-Boot-Application-0.0.1-SNAPSHOT.jar

6. Deployement sur cloud Heroku
 
 Autres alternatives: Cloud Foundry,  Heroku, Google Cloud, Amazon Web Services, Microsoft Azure
 
 Pour plus de flexibilite, nous devrons dockeriser notre application (Dockers, Kubernate)
 
 Si nous utilisons une offre cloud, il faut garder a l'esprit que pour chaque cloud une configuration sera necessaire pour gerer:
 
- Logging
- Integration de service
- Firewall annd securite
 
Apres avoir cree un compte heroku, puis avoir fait "new projet".

Nous connectons notre projet git au projet Heroku.

Bug fix Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.1:compile (default-compile) on project:

	<plugin>
		<groupId>org.apache.maven.plugins</groupId>
		<artifactId>maven-compiler-plugin</artifactId>
		<configuration>
			<source>1.8</source>
			<target>1.8</target>
		</configuration>
	</plugin>

Une fois l'app deploye sur Heroku celle-ci nous retourne la version de l'app.

Si l'on interroge https://conference-demo-ruffin.herokuapp.com/api/v1/sessions cela nous retourne la page Spring Whitelabel Error Page. Car en effet, la base de donnees n'est pas configure dans Heroku.

Ajout des ressources pour acces base de donnees dans Heroku. 

Premierement commenter la configuration de connection a la base de donnees qui se trouve dans le fichier de configuration PersistenceConfiguration.

Secondement, dans Heroku, cliquer sur setting puis sur Reveal Config Vars et indiquer sur key ==>  DB_URL rappellez-vous: c'est celle indiquee dans le fichier de configuration application.properties:
	
	spring.datasource.url = ${DB_URL}
	
et sur value copier/coller celle du dessus.


Dans Heroku cliquer sur Heroku PostGres> selectionner votre projet > Settings > Database Credentials.

Gardez cette page ouverte dans votre navigateur.

Dans PostGres, creer un nouvelles connexions serveur avec les donnees de Herokus.

Rechercher sur le serveur Heroku votre base de donnees (la list est longue ...).

Executer les scripts pour creer et remplir votre base de donnee.

Enfin, il est necessaire de configurer Dyno (c'est le nom donne par Heroku pour Container') ici on initialise 1 container web=1 . Pour cela executer la commande suivante (adapter le nom de votre projet: ici conference-demo-ruffin)

	heroku ps:scale web=1 -a conference-demo-ruffin

7. Deployement sur tomcat a l'aide d'un fichier war

bugfix si l'on veux que la page d'accueil Tomcat fonctionne, ouvrir en mode admin une fenetre de cmd aller dans le repertoire bin et faire startup.

Pour avoir acces a l'api a travers le war genere copie/coller le dans le dossier webapps de tomcat. Demarrer le serveur et appeler notre api.


## Construit avec

* [Maven](https://maven.apache.org/) - Dependency Management


## Remerciements

* [OpenClassRoom](https://openclassrooms.com/fr/courses/6173501-debutez-la-programmation-avec-java ) - Debutez la programmation avec java
* [Chaine YouTube du professeur Mohamed Youssfi](https://www.youtube.com/playlist?list=PLxr551TUsmAprMTVCc20Dy445O4UWxS02) - Programmation Orientee Objet Java
* [Blog de Jose Paumard](http://blog.paumard.org/cours/java/) - Java en ligne
* [Blog de JM Doudoux](https://www.jmdoudoux.fr/accueil_java.htm) - Programmation avec Java
* [Blog de MKyong](https://mkyong.com/) - Mkyong.com
* [Cours Pluralsight](https://app.pluralsight.com/library/) - Spring
* [Documentation Spring](https://docs.spring.io/spring/docs/3.0.0.M3/reference/html/ch04s04.html) - Spring.io
