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
        // stage ('Build docker image'){
        //     steps{
        //         script {
        //             sh 'docker build -t bilelZouaoui00/DevopsIntegration .'
        //         }
        //     }
        // }


            stage('Test(JUNIT)') {
                //steps {
                //    sh 'mvn test'
                //}
            }

            stage('Sonar Analysis'){
                steps{
                    sh "mvn clean package"
                    sh ''' mvn sonar:sonar -Dsonar.url-http://http://192.168.1.15:9000/ -Dsonar.login=squ_4b6e229071836816a71e20f9105c4f042babe050
                    -Dsonar.java.binaries=. \
                    -Dsonar.projectKey=devops-ex '''
                }
            }
    }
}