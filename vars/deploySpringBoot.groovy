def call(Map props = [:]) {
   props = [ artifact: 'ROOT', appName: 'springboot-app', profile:'test' ] << props    
       
       
    echo "Profile: ${props.profile}"
    echo "Target: ${props.target}"
    echo "Artifact: ${props.artifact}.jar"
    echo "AppName: ${props.appName}"
    }
