pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                //
                echo "Building"
                try {
                      sh './gradlew build --no-daemon'
                } catch (e) {
                      error("Gradle build failed: ${e.getMessage()}")
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