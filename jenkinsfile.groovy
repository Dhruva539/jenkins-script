pipeline{
    agent any
        stages{
            stage('prepare'){
                steps{
                    timeout(time:1,unit:'MINUTES'){
                   echo "Prepare step is progressing"
                    }
               }
            }
            stage('build') {
                steps {
                    timeout(time:1,unit:'MINUTES') {
                    echo "Build step is progressing"
                    }
                }
            }
        } 
    
}
