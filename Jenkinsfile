pipeline {

	agent { label 'deploy' }

	stages {
		stage ('Checkout') {
			steps {
				checkout scm
			}
		}

		stage('Build') {
			steps {
				sh './gradlew clean build distRpm --refresh-dependencies --stacktrace'
			}
		}
	}

}