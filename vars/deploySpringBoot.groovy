import groovy.json.JsonSlurperClassic

def call(Map props = [:]) {

    def raw = libraryResource 'configuration.json'
    def json = new JsonSlurperClassic().parseText(raw)
    def job = json.get(env.JOB_NAME)

    echo "Deploying artifact for ${job.profile}"
    echo "Deploying to server: ${prop.targets}"
    
    }
