# criar projeto 
mvn archetype:generate -DgroupId=rafael -DartifactId=triangulo -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false

# cd triangulo

# mvn package

# test:  
mvn org.pitest:pitest-maven:mutationCoverage



