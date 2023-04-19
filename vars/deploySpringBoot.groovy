def call(Map props = [:]) {
    props = [ profile: "test", appName:"springBoot-app"] << props
    
    if (props.artifact == null){
        props.artifact = "ROOT"
    }
    
    
    echo "${props.profile}"
    echo "${props.target}"
    echo "${props.artifact}.jar"
    echo "${props.appName}"
    }
