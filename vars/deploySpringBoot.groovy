def call(Map props = [:]) {
   props = [ artifact: 'ROOT', appName: 'springboot-app' ] << props    
       
       
    echo "Profile: ${props.profile}"
    echo "Target: ${props.target}"
    echo "Artifact: ${props.artifact}.jar"
    echo "AppName: ${props.appName}"
    }
