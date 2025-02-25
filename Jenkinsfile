pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                //
                echo "Building"
                script {
                sh './gradlew build --no-daemon'
                }
            }
        }
        stage('Test') {
            steps {
                //
                echo "Testing"
            }
        }
        stage('Deploy') {
            steps {
                //
                 echo "Deploying"
            }
        }
    }
}