pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/OCHIR08/exampleTestAllureJenkins.git'
            }
        }

        stage('Build & Test') {
            steps {
                script {
                    sh 'chmod +x gradlew'
                    sh './gradlew clean test'
                }
            }
        }

        stage('Allure Report') {
            steps {
                allure([
                    includeProperties: false,
                    jdk: '',
                    results: [[path: 'build/allure-results']]
                ])
            }
        }
    }
}
