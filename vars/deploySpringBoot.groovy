def call(Map props = [:]) {
    props = [ profile: "test", appName:"springBoot-app"] << props
    
    if (props.artifact) == 'null'{
        props.artifact = "ROOT.jar"
    }
    
    
    echo "${props.profile}"
    echo "${props.target}"
    echo "${props.artifact}"
    echo "${props.appName}"
    }
