def call(Map props = [:]) {
    props = [ profile: "test"] << props
    
    
    echo "Deploying artifact for ${props.profile}"
    echo "Deploying to server: ${props.target}"
    
    }
