pipeline {
    agent any
  tools {


    maven 'MAVEN_HOME'

  }
  
  
    stages {
      
        stage('Example') {
            steps {
                bat 'mvn clean test'
            }
        }
    }
}
