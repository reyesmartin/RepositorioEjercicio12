pipeline {
    agent any
    
    stages {
        stage('Barcelona') {
            steps {
                sh 'javac ProgramaCiudades.java'
                sh 'java ProgramaCiudades Barcelona'
            }
        }
        stage('Cordoba') {
            steps {
                sh 'javac ProgramaCiudades.java'
                sh 'java ProgramaCiudades Cordoba'
            }
        }
        stage('Madrid') {
            steps {
                sh 'javac ProgramaCiudades.java'
                sh 'java ProgramaCiudades Madrid'
            }
        }
        stage('Malaga') {
            steps {
                sh 'javac ProgramaCiudades.java'
                sh 'java ProgramaCiudades Malaga'
            }
        }
        stage('Sevilla') {
            steps {
                sh 'javac ProgramaCiudades.java'
                sh 'java ProgramaCiudades Sevilla'
            }
        }
    }
}
