## **LDAP = Lightweight Directory Access Protocol**

is a software protocol for enabling anyone to locate data about organizations, individuals and
other resources such as files and devices in a network -- whether on the public internet or on a corporate intranet.
LDAP is a "lightweight" (smaller amount of code) version of Directory Access Protocol (DAP), which is part of X.500,
a standard for directory services in a network. ****


## **LDAP and Active Directory**
Lightweight Directory Access Protocol is the protocol, Exchange Server uses to communicate with Active Directory. 
To really understand what LDAP is and what it does, it is important to understand the basic concept behind Active 
Directory as it relates to Exchange.


**Active Directory** is a directory service for managing domains, users and distributed resources such as objects .

**Active Directory** contains information regarding every user account on an entire network.
It treats each user account as an object. Each user object also has multiple attributes. An example of an attribute is 
the user's first name, last name or e-mail address. All this information exists within a huge, cryptic database on a 
domain controller -- Active Directory. The challenge is to extract information in a usable format. 
This is LDAP's main job.


**LDAP** uses a relatively simple, string-based query to extract information from Active Directory. 

**LDAP** can store and extract objects such as usernames and passwords in Active Directory, and share that object data 
throughout a network.


**In this project:**
We will have multiple users with role based(ADMIN, USER) entries in a ldif file and REST APIs exposed with the help of 
a controller class. 

**Technologies Used**

1. Maven
2. Java 8
3. Spring Boot 2
4. Lombok
5. spring-security-ldap
6. spring-jpa
7. MYSQL


**LDAP terms**:

1. LDAP = 

**APACHE Directory Server**
https://directory.apache.org/
> Here download the studio and the server


**Git**

Set your username:
git config --global user.name "FIRST_NAME LAST_NAME"

Set your email address:
git config --global user.email "MY_NAME@example.com"


#References:
1. https://searchmobilecomputing.techtarget.com/definition/LDAP
2. https://ultimate.systems/web/blog/generic-controllers-and-services-in-spring-boot-java
3. http://www.masterspringboot.com/security/authentication/securing-spring-boot-applications-with-ldap
4. https://www.devglan.com/spring-security/spring-security-ldap-authentication
5. https://dzone.com/articles/spring-ldap
6. https://www.varonis.com/blog/the-difference-between-active-directory-and-ldap/
7. https://medium.com/codeops/spring-boot-security-ldap-example-1ce1bdfc5816
8. https://directory.apache.org/
