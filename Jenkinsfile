pipeline {
    environment {
        registry = "sthilagan98/hw3"
        registryCredential = 'dockerhub'
        dockerImage = ''
        deploymentName = "hw3-cluster-deployment"
    }
    agent any
    
    stages {
        stage("Creating war file"){
            steps{
                script{
                    checkout scm
                    // sh 'rm -rf *.war'
                    // sh 'jar -cvf survey.war -C swe645/ .'
                    sh 'echo ${BUILD_TIMESTAMP}'
                }
            }
        }
        // stage('Build Docker Image') {
        //     steps {
        //         echo 'Building...'
        //         script {
        //             dockerImage = docker.build("${registry}:${BUILD_NUMBER}")
        //         }
        //     }
        // }
        // stage('Deploy Image') {
        //     steps {
        //         script {
        //             docker.withRegistry('', registryCredential) {
        //                 dockerImage.push()
        //             }
        //         }
        //     }
        // }
        // stage('Redeploy') {
        //     steps {
        //         sh 'kubectl set image deployment/${deploymentName} container-0=${registry}:${BUILD_NUMBER}'
        //     }
        // }
    }
}