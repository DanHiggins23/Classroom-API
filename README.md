# Classroom-API
A classroom API which allows CRUD commands to be run on a simple h2 database

I setup my branches a bit weird, so that the commits might seem unclear. This is what I did:

- Branches
  - Master
  - persistence/domain
  - persistence/repo
  - Util
  - business/service

I basically created a branch based on the previous branch. So for example within the persistence/repo, it had the domain files setup as well as the repo files. These branches were used while I was writing the classes for those sections within the package. They were then merged and deleted.

I then created a new branch called “feature/crud” where I ensured all crud commands worked and a branch called “feature/relationships” where I added the relationships between entities. I then pushed this to the master branch.

What's working:
Classroom:
  - Create classroom
  - Get all classrooms
  - Update Classroom
  - Delete Classroom
  
Trainee/Classroom:
  - Create trainee in class room
  - Very close to having the others completed
 
