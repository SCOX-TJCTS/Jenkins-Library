def call(Map props = [:]) {
	
	if (props.recovery != null) {
			build job: props.recovery, wait: true
		}
}
