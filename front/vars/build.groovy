def buildProject(){
    sh 'npm install'
    sh 'npm run build'
}