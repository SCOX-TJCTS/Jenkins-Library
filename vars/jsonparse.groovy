def call() {

    def raw = libraryResource 'configuration.json'
    def json = readJSON file: (raw)
    def job = json.get(env.JOB_NAME)

  println job.profile
}
