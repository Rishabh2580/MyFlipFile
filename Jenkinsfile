pipeline {
    agent any
    tools {
        // Replace 'MAVEN_HOME' with the name of the Maven tool configured in Jenkins
        maven 'Maven'
    }

    stages {
        stage('Example') {
            steps {
                // Use 'withMaven' block to automatically set up Maven for the build
                withMaven(maven: 'Maven') {
                    // Run Maven commands within this block
                    sh 'mvn clean test'
                }
            }
        }
    }

    post {
        always {
            // Send email notification regardless of the build result
            emailext body: "Build ${currentBuild.currentResult}: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]'\n\nCheck console output at: ${env.BUILD_URL}\n",
                     subject: "Jenkins Build ${currentBuild.currentResult}: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]'",
                     to: "your-email@example.com"
        }
    }
}
