def call(Map props = [:]) {
    props = [ profile: "test", appName:"springBoot-app"] << props
    
    if props.artifact == null{
        props.artifact == "ROOT.jar"
    }
    
    
    echo "${props.profile}"
    echo "Deploying to server: ${props.target}"
    echo "The artifact is named: ${props.artifact}"
    echo "The application name is ${props.appName}"
    }
