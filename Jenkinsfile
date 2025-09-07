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
            post {
                always {
                    allure([
                        results: [[path: 'build/allure-results']],
                        reportBuildPolicy: 'ALWAYS'
                    ])
                }
            }
        }
    }
}
