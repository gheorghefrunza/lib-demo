def call() {
  properties([
      parameters([
          string(name: 'submodule', defaultValue: ''),
          string(name: 'submodule_branch', defaultValue: ''),
          string(name: 'commit_sha', defaultValue: ''),
      ])
  ])



}







