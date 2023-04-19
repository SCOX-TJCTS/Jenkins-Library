def call(Map props = [:]) {
    props = [ profile: "test", appName:"springBoot-app"] << props
    
    if (props.artifact) is null{
        artifact = "ROOT.jar"
    }
    
    
    echo "${props.profile}"
    echo "${props.target}"
    echo "${props.artifact}"
    echo "$artifact"
    echo "${props.appName}"
    }
