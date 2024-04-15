pipeline {
    agent any

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
                // sh 'mvn test'  // Assuming this generates Jacoco report

                // Option 2: If report generated elsewhere
                // sh 'cp path/to/your/jacoco.exec ${project.basedir}/../target/jacoco.exec'

                sh '''mvn clean package sonar:sonar \
                    -Dsonar.url=http://192.168.10.0:9000/ \
                    -Dsonar.login=squ_4b6e229071836816a71e20f9105c4f042babe050 \
                    -Dsonar.java.binaries=. \
                    -Dsonar.projectKey=devops-ex '''
            }
        }
    }
}
