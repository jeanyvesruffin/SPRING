# SPRING

Remise � niveau Spring

## Commencer

Cloner le projet dans Eclipse pour executer et voir les diff�rents TP r�alis�s

### Conditions pr�alables

Sous Windows:

L'utilisation de chocolotey comme gestionnaire de package a �t� utilis�.

 [Installer chocolatey](https://chocolatey.org/)
 
Deployement cloud sur Heroku.

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
**Heroku Command Line Interface (CLI) (Install) 7.39.3.0**

```
choco install heroku-cli
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
- ResourceBundle Editor



*En cours d'�dition End with an example of getting some data out of the system or using it for a little demo*

### Maven Dependency

* spring-boot-starter-web
* spring-boot-starter-jetty
* spring-boot-starter-data-jpa
* postgresql
* spring-boot-starter-test
* spring-boot-maven-plugin


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
* Cr�ation application avec connexion � la base de donn�es postgresql
* Cr�ation de l'api Rest et de ces methodes CRUD et test API sur Postman
* Travail sur la configuration et l'environnement (prod, dev ..) Spring Boot
* Deployement de l'application sur Jelly vs Tomcat
* D�ployement en mode standalone
* D�ployement cloud Heroku
* Cr�ation du fichier WAR pour le deployement sping boot

## Cr�ation d'une application de planification de r�union
 (https://github.com/jeanyvesruffin/Heroku.git)

**Creation Project Object Model (POM) � l'aide du site Spring.io:**

 G�n�rer votre projet � l'aide de [spring.io]( https://start.spring.io/) - Spring initializr.
 Autres solutions et de g�n�rer le projet � l'aide de son IDE ou bien � l'aide de Spring Boot CLI.
 Decrompresser le projet genere � travers spring.io, faire l'importation dans son IDE run clean/ install Maven du .pom puis update.
 
1. Cr�ation de 4 packages:
 * Controllers ==> API controllers
 * Models ==> Java Persistance API et autres info persistance.
 * Repositories ==> JPA repository
 * Services ==> service et code logic
 
 
2. Installation de postgres et initilisation des tables et des datas � l'aide du repository [github](https://github.com/dlbunker/ps-first-spring-boot-app/tree/master/database/postgresql)
 
3. Cr�er les fichiers de configuration n�cessaire � l'acc�s � la base de donn�es
 
4. D�ployement application sur environnement Jelly vs Tomcat
 
5. D�ployement application en mode standalone
	
G�n�rer le .jar avec Maven et avec son param�tre goal renseign� � package (vs clean install ..etc)
Retrouv� le fichier de d�ployement dans le dossier Target (first-Spring-Boot-Application-0.0.1-SNAPSHOT.jar)
Executer le fichier jar a l'aide d'un terminal (pointant sur le dossier target) $ java -jar first-Spring-Boot-Application-0.0.1-SNAPSHOT.jar

La seconde m�thode consiste � creer notre executable � travers le fichier .pom. Pour cela ajouter au build le tag configuration

	<plugin>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-maven-plugin</artifactId>
		<configuration>
			<executable>true</executable>
		</configuration>
	</plugin>
  
**BUG FIX:** attention de fermer l'execution du .jar precedent et quitter le terminal sinon genere une erreur.

On execute ensuite la commande Maven package puis dans un terminal pointant sur le dossier target executer la commande: $ ./first-Spring-Boot-Application-0.0.1-SNAPSHOT.jar

6. D�ployement sur cloud Heroku
 
 Autres alternatives: Cloud Foundry,  Heroku, Google Cloud, Amazon Web Services, Microsoft Azure
 
 Pour plus de flexibilit�, nous devrons dockeriser notre application (Dockers, Kubernate)
 
 Si nous utilisons une offre cloud, il faut garder � l'esprit que pour chaque cloud une configuration sera n�cessaire pour g�rer:
 
- Logging
- Integration de service
- Firewall annd s�curit�
 
Apres avoir cr�� un compte heroku, puis avoir fait "new projet".

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

Une fois l'app deploy� sur Heroku celle-ci nous retourne la version de l'app.

Si l'on interroge https://conference-demo-ruffin.herokuapp.com/api/v1/sessions cela nous retourne la page Spring Whitelabel Error Page. Car en effet, la base de donn�es n'est pas configur� dans Heroku.

Ajout des ressources pour acces base de donn�es dans Heroku. 

Premi�rement commenter la configuration de connection � la base de donn�es qui se trouve dans le fichier de configuration PersistenceConfiguration.

Secondement, dans Heroku, cliquer sur setting puis sur Reveal Config Vars et indiquer sur key ==>  DB_URL rappellez-vous: c'est celle indiqu�e dans le fichier de configuration application.properties:
	
	spring.datasource.url = ${DB_URL}
	
et sur value copier/coller celle du dessus.


Dans Heroku cliquer sur Heroku PostGres> selectionner votre projet > Settings > Database Credentials.

Gardez cette page ouverte dans votre navigateur.

Dans PostGres, creer un nouvelles connexions serveur avec les donn�es de Herokus.

Rechercher sur le serveur Heroku votre base de donn�es (la list est longue ...).

Executer les scripts pour creer et remplir votre base de donn�e.

Enfin, il est n�cessaire de configurer Dyno (c'est le nom donn� par Heroku pour Container') ici on initialise 1 container web=1 . Pour cela executer la commande suivante (adapter le nom de votre projet: ici conference-demo-ruffin)

	heroku ps:scale web=1 -a conference-demo-ruffin

7. Deployement sur tomcat a l'aide d'un fichier war

bugfix si l'on veux que la page d'accueil Tomcat fonctionne, ouvrir en mode admin une fenetre de cmd aller dans le repertoire bin et faire startup.

Pour avoir acces a l'api a travers le war genere copie/coller le dans le dossier webapps de tomcat. Demarrer le serveur et appeler notre api.


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
