def call(Map props = [:]) {
    props = [ profile: "test", artifact:"ROOT.jar"] << props
    
    
    echo "Deploying artifact for ${props.profile}"
    echo "Deploying to server: ${props.target}"
    echo "The artifact is named: ${props.artifact}"
    }
