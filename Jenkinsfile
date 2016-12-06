node {
	def gradledir = tool name: 'gradle', type: 'hudson.plugins.gradle.GradleInstallation'
	
    checkout scm // <1>
    /* .. snip .. */
	
	
	stage ("Build"){
		sh "ls -l"
		
		sh "${gradledir}/bin/gradle clean build"
	}
	
	
}