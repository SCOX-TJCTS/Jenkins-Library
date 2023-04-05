import groovy.json.JsonSlurperClassic

def call(Map props = [:]) {

    def raw = libraryResource 'job-configuration.json'
    def json = new JsonSlurperClassic().parseText(raw)
    def job = json.get(env.JOB_NAME)

    return
    echo "Deploying artifact for ${props.profile}"
    echo "Deploying to server: ${props.targets}"
    
    }