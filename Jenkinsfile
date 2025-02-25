pipeline {
    agent any
     stages {
         stage('Build') {
             steps {
                 echo "Building"
                 script {
                     try {
                       if (isUnix()) {
                                                   sh './gradlew build --no-daemon'
                                               } else {
                                                   bat 'gradlew.bat build --no-daemon'
                                               }
                     } catch (e) {
                         error("Gradle build failed: ${e.getMessage()}")
                     }
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
}}