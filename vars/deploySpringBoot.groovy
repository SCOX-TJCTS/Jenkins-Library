def call(Map props = [:]) {
       
    echo "Profile: ${props.profile}"
    echo "Target: ${props.target}"
    echo "Artifact: ${props.artifact}.jar"
    echo "AppName: ${props.appName}"
    }
