import groovy.json.JsonSlurperClassic

def call(Map props = [:]) {
	def raw = libraryResource 'configuration.json'
	def json = new JsonSlurperClassic().parseText(raw)
	def job = json.get(env.JOB_NAME)


	if (job.recovery != null) {
			build job: job.recovery, wait: true
		}
