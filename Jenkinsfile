pipeline {
    agent any
    
    stages {
        stage('Barcelona') {
            steps {
                sh 'javac ProgramaCiudades.java'
                sh 'java ProgramaCiudades Barcelona'
            }
        }
        stage('Córdoba') {
            steps {
                sh 'javac ProgramaCiudades.java'
                sh 'java ProgramaCiudades Córdoba'
            }
        }
        stage('Madrid') {
            steps {
                sh 'javac ProgramaCiudades.java'
                sh 'java ProgramaCiudades Madrid'
            }
        }
        stage('Málaga') {
            steps {
                sh 'javac ProgramaCiudades.java'
                sh 'java ProgramaCiudades Málaga'
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
