def call(Map props = [:]) {
    props = [ profile: "test", artifact:"ROOT.jar", appName:"springBoot-app"] << props
    
    
    echo props.profile
    echo "Deploying to server: ${props.target}"
    echo "The artifact is named: ${props.artifact}"
    echo "The application name is ${props.appName}"
    }
