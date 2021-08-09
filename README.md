# Gerenciamento de Servidores

> Um gerenciador de servidores criado com front-end feito com JS e estilizado com Bootstrap,
>  e um back-en feito em Java Maven e Spring-boot. Database hosteada em H2

## Pré-requisito

> - Uma IDE a sua escolha
> - **Java** na versão 8 ou maior- [Java Donwload](https://www.java.com)

## Instalação

> - Clone este projeto em sua maquina com o comando:
> ```
> 	git clone https://github.com/caiomcs04/tenax.git
> ```

## Execução do back-end em localhost

> - A porta utilizada foi 8088.
>
> - Abra a pasta **tenax/back-end** usando a IDE de sua escolha.
>
> - Faça o build do maven em **pom.xml** caso sua IDE não o faça automaticamente.
>
> - Rode o arquivo ServerApplication(~/src/main/java/com/tenax/server)
> 
> - Uma janela em seu navegador irá abrir com a interface [JSF](http://localhost:8088/server.tenax)
> 
> ![Captura de tela de 2021-08-09 00-35-14](https://user-images.githubusercontent.com/66964367/128657947-65c5944f-389d-46eb-bae4-8bf1b32cf774.png)
>
> - Após iniciar o serviço vá para [H2 memory bank](http://localhost:8088/h2)
>
> - Altere a **JDBC URL** para **jdbc:h2:~/tenax-server**
>
> ![Captura de tela de 2021-08-02 01-52-28](https://user-images.githubusercontent.com/66964367/127806082-16079875-9cbc-4348-b658-5a2885d9230f.png)
>
> - Então clique em **conect** para acessar ao banco de memória.
>
> - Você pode executar qualquer crud usando um API Client de sua escolha.
>
> - Ou pode usar o [Swagger](http://localhost:8088/swagger-ui.html#/)
> 
> ![Captura de tela de 2021-08-02 01-58-05](https://user-images.githubusercontent.com/66964367/127806343-0dbf176f-fc3e-4836-89cb-d64fc2e4bd90.png)

## Execução do front-end

>  - Abra a pasta **tenax/frontend** e execute o arquivo **index.html***.
>  
>  - ELe abrirá uma página em seu navegador.
>  
>  ![Captura de tela de 2021-08-02 02-09-42](https://user-images.githubusercontent.com/66964367/127807219-3f5516a9-e7b3-4267-81df-1588c0b6bc8c.png)
>  
>  
>  - Para adicionar um novo servidor clique em **Novo Servidor** e adicione o servidor com os atributos que desejar.
>  
>   ![Captura de tela de 2021-08-02 02-09-57](https://user-images.githubusercontent.com/66964367/127807345-26a71467-c1b5-491f-b101-90d856d4fd82.png)
>   
>   
>  - **ATENÇÃO** Não é possível adicionar servidores com o mesmo nome.
>   Caso queira mudar algo em um servidor ja existente Clique no botão **Editar** na página principal.
>   
>   ![Captura de tela de 2021-08-02 02-10-08](https://user-images.githubusercontent.com/66964367/127807489-90b7ead0-a778-4561-ba50-7e943f74f56a.png)
>   
>   - Para deletar um servidor basta clicar em **Deletar** na página principal.


## Funcionalidades

> - Back-end
> Você será capaz de testar todas as funcionalidades em [Swagger](http://localhost:8085/swagger-ui.html#/) 
> E também poderá checar seu banco de dados em [H2](http://localhost:8085/h2)

> - Front-end
> Você poderá executar os cruds com uma interface mais amigável.
> Checar a lista de servidores, criar servidores, edita-los e deleta-los.

## Contribuição

> - Para contribuir com este projeto, use a ferramenta de fork, faça as alterações que achar necessárias e crie um pull request.

## Futura Atualização

> - Criar auditoria para o back-end.

## Autor

> - **Caio Moreira de Carvalho Sampaio** - [Linkedin](https://www.linkedin.com/in/caio-sampaio-b02a3669/) | [Email](caio6c@yahoo.com.br)

## Agradecimento Especial 

> Tenax pela oportunidade de participar de seu processo seletivo.
