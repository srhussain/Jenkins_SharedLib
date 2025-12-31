def call(String gitUrl, String gitBranch, String credentialsId = '') {

    if (credentialsId?.trim()) {
        git url: gitUrl, branch: gitBranch, credentialsId: credentialsId
    } else {
        git url: gitUrl, branch: gitBranch
    }
}
