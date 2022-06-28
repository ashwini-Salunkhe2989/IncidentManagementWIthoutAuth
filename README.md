# IncidentManagementWithoutAuth
Initailly I thought to design this project with in memory database. But Later I decided to make it microservices architecture having different services
and Eureka server and Spring cloud gateway. Tried to Implement Oauth security with keyclok.(Security changes were not working to kept them seperate) 

Set up PostGres Database in your local by following documentaion.
 1)https://www.postgresql.org/download/
 2)Create User in database with name
  spring.datasource.username=demo_user
  spring.datasource.password=demo@user
 3) You need to create 2 tables for this project. SQL script is added with IncidentCreation Project
 
 This Proejct contains Docker Compose file. You can run this project with Docker as well. I was facing some issues conencting to postgres via docker image. So i completed docker file but with database dependency with was not working on my system due to some firewall rules. I have ubuntu os. So its optional to see/use docker compose. 
 
 4)Majorly CRUD operations are managed by INCIDENT creation,updation.deletion,list projects. It also has UserManagement End points wich are bundled with Incident updation proejct. 
 
 5)Since my spring security with keycloak was not working I have tried to use simple authentication logic. you need to pass username from Header. 
 x-username it will be validated against user table in database. 
 6)If createdby field or Assigned field is not matching with x-username Application will throw exception.
