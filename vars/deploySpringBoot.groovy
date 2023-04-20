def call(Map props = [:]) {
    props = [ profile: "test", appName: "springBoot-app", artifact: 'ROOT'] << props
    
  
    
    echo "Profile: ${props.profile}"
    echo "Target: ${props.target}"
    echo "Artifact: ${props.artifact}.jar"
    echo "AppName: ${props.appName}"
    }
