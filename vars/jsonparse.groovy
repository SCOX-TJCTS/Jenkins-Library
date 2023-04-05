import groovy.json.JsonSlurperClassic

def call() {

    def raw = libraryResource 'configuration.json'
    def json = new JsonSlurperClassic().parseText(raw)
    def job = json.get(env.JOB_NAME)

  println job.profile
