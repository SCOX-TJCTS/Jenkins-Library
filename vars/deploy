import groovy.json.JsonSlurperClassic

def call(Map props = [:]) {
	def raw = libraryResource 'configuration.json'
	def json = new JsonSlurperClassic().parseText(raw)
	def job = json.get(env.JOB_NAME)


	job.targets.each { target ->

		if (target.f5 != null) {
			f5Down(target: targets.f5)
		}

		if (job.type == 'SPRING_BOOT_LEGACY') {
			deploySpringBootLegacy(target: target.ssh)
		}
		else if (job.type == 'SPRING_BOOT') {
			deploySpringBoot(target: target.ssh)
		}
		else if (job.type == 'TOMCAT') {
			deployTomcat(target: target.ssh)
		}

		if (target.f5 != null) {
			f5Up(target: target.f5)
		}
	}
}
