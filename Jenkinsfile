node{
      stage('SOM Checkout'){
        git 'https://github.com/Saatvik-Batman/Maven-RetailProject'
        }
        stage('Compile-Package'){
          def mvnHome = tool name: 'MAVEN_HOME', type: 'maven'
              sh "${mvnHome}/bin/mvn package"
          }
          
      }    
