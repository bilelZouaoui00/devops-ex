pipeline {
    agent any
    tools {
    maven 'maven'
    }

    stages {
        stage('Getting Project') {
            steps {
                git 'https://github.com/bilelZouaoui00/devops-ex'
            }
        }
        stage('Compile') {
            steps {
                sh 'mvn compile'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean install | tee mvn_output.txt'
            }
        }

        // stage ('Build docker image'){ ... } (uncomment if needed)

        stage('Test(JUNIT)') {
                     steps{
                          sh 'mvn test'
                          }
         }

       stage('Sonar Analysis'){
           steps{
               // Option 1: Run tests & generate Jacoco report
               sh 'mvn clean package'  // Assuming this generates Jacoco report

               // Option 2: If report generated elsewhere
               // sh 'cp path/to/your/jacoco.exec ${project.basedir}/../target/jacoco.exec'

               sh '''mvn clean package sonar:sonar \
                   -Dsonar.url=http://192.168.1.15:9000/ \
                   -Dsonar.login=squ_45fef69b3887d4511b74274e2e4b8d959c7b0f2f \
                   -Dsonar.java.binaries=. \
                   -Dsonar.projectKey=devopsex '''
           }
       }

    }
}
