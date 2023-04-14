import groovy.json.JsonSlurperClassic

def call(Map props = [:]) {
    
def raw = libraryResource 'configuration.json'
def json = new JsonSlurperClassic().parseText(raw)
def job = json.get(env.JOB_NAME)
    
def server = props.target
    
    
    
    if (job.appName == null){
       props = [ appName: 'springboot-app'] << props
        }
    else if (job.appName != null){
        props = job.appName.toString()
        }


    echo "Deploying artifact for ${props.profile}"
    echo "Deploying to server: ${props.target}"
    echo "The application name is ${props.appName}"
    }
