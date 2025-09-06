pipeline {
    agent any

    tools {
        jdk 'JDK17'   // Имя JDK, настроенное в Jenkins (Manage Jenkins → Global Tool Configuration)
    }

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
                    // для Mac/Linux
                    sh 'chmod +x gradlew'
                    sh './gradlew clean test'
                }
            }
        }

        stage('Allure Report') {
            steps {
                allure([
                    results: [[path: 'build/allure-results']],
                    reportBuildPolicy: 'ALWAYS'
                ])
            }
        }
    }

    post {
        always {
            // сохраняем результаты сборки
            archiveArtifacts artifacts: 'build/allure-results/**', allowEmptyArchive: true
        }
    }
}
