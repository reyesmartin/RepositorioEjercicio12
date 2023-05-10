pipeline {
    agent any
    
    stages {
        stage('Barcelona') {
            steps {
                bat 'javac ProgramaCiudades.java'
                bat 'java ProgramaCiudades Barcelona'
            }
        }
        stage('Cordoba') {
            steps {
                bat 'javac ProgramaCiudades.java'
                bat 'java ProgramaCiudades Cordoba'
            }
        }
        stage('Madrid') {
            steps {
                bat 'javac ProgramaCiudades.java'
                bat 'java ProgramaCiudades Madrid'
            }
        }
        stage('Malaga') {
            steps {
                bat 'javac ProgramaCiudades.java'
                bat 'java ProgramaCiudades Malaga'
            }
        }
        stage('Sevilla') {
            steps {
                bat 'javac ProgramaCiudades.java'
                bat 'java ProgramaCiudades Sevilla'
            }
        }
    }
}
