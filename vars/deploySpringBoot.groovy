def call(Map props = [:]) {
    props = [ profile: "test"] << props
    
    if (props.artifact == null){
        props.artifact = "ROOT"
    }
    
    if (props.appName == null){
        props.appName = "springboot-app"
    }
    
  
    
    echo "Profile: ${props.profile}"
    echo "Target: ${props.target}"
    echo "Artifact: ${props.artifact}.jar"
    echo "AppName: ${props.appName}"
    }
