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

        // stage ('Build docker image'){
        //     steps{
        //         script {
        //             sh 'docker build -t bilelZouaoui00/DevopsIntegration .'
        //         }
        //     }
        // }


            stage('Test(JUNIT)') {
            steps {
                sh 'mvn test'
            }
        }
    }
}