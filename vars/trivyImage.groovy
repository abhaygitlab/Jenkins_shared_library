def call() {
    sh 'trivy image adockerimage/youtube:latest > trivyimage.txt'
}
