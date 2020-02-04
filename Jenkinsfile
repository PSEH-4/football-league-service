pipeline {

	agent { label 'master' }

	stages {
		stage ('Checkout') {
			steps {
				checkout scm
			}
		}

		stage('Build') {
			steps {
				sh 'bash ./gradlew clean build distDocker --refresh-dependencies --stacktrace'
			}
		}
	}

}