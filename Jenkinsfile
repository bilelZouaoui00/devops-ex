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
                sh 'mvn test'  // Assuming this generates Jacoco report

                // Option 2: If report generated elsewhere
                // sh 'cp path/to/your/jacoco.exec ${project.basedir}/../target/jacoco.exec'

                sh '''mvn clean package sonar:sonar \
                            -Dsonar.url=http://<container_ip>:9000/ \
                            -Dsonar.login=squ_f611dd88c6ac1d4a02702ff70200e36b9f3306e6 \
                            -Dsonar.java.binaries=. \
                            -Dsonar.projectKey=devops-ex '''
            }
        }
    }
}
