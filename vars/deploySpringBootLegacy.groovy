def call(Map props = [:]) {
def server = props.target
    props = [ APP_NAME: 'springboot-app'] << props



    echo "Deploying artifact for ${props.profile}"
    echo "Deploying to server: ${props.target}"
    echo "The application name is ${target.APP_NAME}"
    }
