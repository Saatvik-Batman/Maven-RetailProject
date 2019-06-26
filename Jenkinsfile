pipeline {
         agent any
         stages {
                 stage('One') {
                 steps {
                     echo '1 TestCase building completed'
                 }
                 }
                 stage('Two') {
                 steps {
                    input('Do you want to proceed?')
                 }
                 }
                 stage('Three') {
                 when {
                       not {
                            branch "master"
                       }
                 }
                 steps {
                       echo "Testcase Building in progress"
                 }
                 }
    
              }
}
