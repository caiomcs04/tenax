# Gerenciamento de Servidores

> Um gerenciador de servidores. O front-end foi feito com JS e estilizado com Bootstrap.
>  O back-en foi feito em Java Maven e Spring-boot. Database hosteada em H2

## Pré-requisito

> - Uma IDE a sua escolha
> - **Node** with version greater than or equal to 8.1 - [Node Donwload](https://nodejs.org/pt-br/download/)
> - **NPM**  with version greater than or equal to 5.6 - [Npm Donwload](https://www.npmjs.com/package/download)
> - **Java** with version greater than or equal to 8 - [Java Donwload](https://www.java.com)

## Instalação

> - Clone este projeto em sua maquina com o comando:
> ```
> 	git clone https://github.com/caiomcs04/tenax.git
> ```

## Execução do back-end em localhost

> - Open **meeting-room-manager/back-end** folder using an IDE of your choice
>
> - Load marven changes in build.gradle file if your IDE doesn't do it automatically
>
> - Run MeetingroomApplication(~/back-end/src/main/java/com/digital/crud/meetingroom/meetingroom)
>
> - After starting the service go to [H2 memory bank](http://localhost:8085/h2)
>
> - Change **JDBC URL** to **jdbc:h2:~/meetingroom_db**
>
> ![Captura de tela de 2021-07-03 13-24-10](https://user-images.githubusercontent.com/66964367/124360783-082acc80-dc02-11eb-944c-58aabe735d21.png)
>
> - Then press conect to get access to memory bank
>
> - You can execute any crud using an API develoment plataform of your choice
>
> - Or you can use [Swagger](http://localhost:8085/swagger-ui.html#/) as well
> 
> ![Captura de tela de 2021-07-23 10-39-25](https://user-images.githubusercontent.com/66964367/126791647-975169c8-8ddc-4ba4-8607-ad394595d416.png)

## Installation Angular app

>Access your terminal project folder:
> ```
> 	cd [Your Project folder name]
> ```
> Than access the **front-end** folder:
> ```
> 	cd [front-end]
> ```
> Already the application's folder in your terminal, type the following command to install the node-modules:
> ```
> 	npm install
> ```
> 
## Execution

>  When the installation is ready, start the front-end application with the command::
> ```
> 	ng s -o
> ```
>The application will be available for viewing in your browser, if this does not happen automatically open the browser at the following address: _localhost: 4200_


## Functionalities

> - Back-end
> You will be able to test all functionalities in [Swagger](http://localhost:8085/swagger-ui.html#/) 
> And also will be able to check the data base in [H2](http://localhost:8085/h2)

> - Front-end
> You will be able to execute all cruds.
> Check all data, create it, update it and delete it.

## Contribution

> - To contribute to this project, fork this project, make the changes you want and create a pull request.

## Authors

> - **Caio Moreira de Carvalho Sampaio** - [Linkedin](https://www.linkedin.com/in/caio-sampaio-b02a3669/) | [Email](caio6c@yahoo.com.br)

## Special thanks 

> Digital Innovation One and Satander Bank for the fullstack scholarship opportunity
