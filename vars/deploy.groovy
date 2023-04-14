import groovy.json.JsonSlurperClassic

def call(Map props = [:]) {
	def raw = libraryResource 'configuration.json'
	def json = new JsonSlurperClassic().parseText(raw)
	def job = json.get(env.JOB_NAME)


	job.targets.each { target ->

		if (target.f5 != null) {
			f5Down(target: target.f5)
		}

		if (job.type == 'SPRING_BOOT_LEGACY') {
			deploySpringBootLegacy(target: target.ssh, profile: job.profile, APP_NAME: target.APP_NAME)
		}
		else if (job.type == 'SPRING_BOOT') {
			deploySpringBoot(target: target.ssh, profile: job.profile, APP_NAME: target.APP_NAME)
		}
		else if (job.type == 'TOMCAT') {
			deployTomcat(target: target.ssh, profile: job.profile, APP_NAME: target.APP_NAME)
		}

		if (target.f5 != null) {
			f5Up(target: target.f5)
		}
	}
}
