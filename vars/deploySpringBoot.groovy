def call(Map props = [:]) {
    props = [ profile: "test", appName: "springBoot-app", artifact: 'ROOT'] << props
    
  
    
    echo "${props.profile}"
    echo "${props.target}"
    echo "${props.artifact}.jar"
    echo "${props.appName}"
    }
