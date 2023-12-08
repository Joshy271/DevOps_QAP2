# DevOps_QAP2

Docker Explanation

-everytime I wanted to update my image and run my container, this was the following sequence I did to achieve that

- mvn clean install ( tidy up my workspace, it cleans away old pieces, then puts together the bricks to create the final model, making it ready for use.)
- docker build -t joshy271/devops_qap2 . (creates a labeled, ready-to-use container by assembling and packaging all the needed tools and files.)
- docker push joshy271/devops_qap2 (uploads the container to a remote registry(Docker), making it available for others to pull and use on their own systems.)
- docker-compose up (essentially the start button that reads the docker-compose.yml file. launches the container for use)
