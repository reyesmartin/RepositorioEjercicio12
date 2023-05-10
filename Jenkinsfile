pipeline {
    agent any
    
    stages {
        stage('Barcelona') {
            steps {
                bat 'javac src/ProgramaCiudades.java'
                bat 'java src/ProgramaCiudades Barcelona'
            }
        }
        stage('Cordoba') {
            steps {
                bat 'javac src/ProgramaCiudades.java'
                bat 'java src/ProgramaCiudades Cordoba'
            }
        }
        stage('Madrid') {
            steps {
                bat 'javac src/ProgramaCiudades.java'
                bat 'java src/ProgramaCiudades Madrid'
            }
        }
        stage('Malaga') {
            steps {
                bat 'javac src/ProgramaCiudades.java'
                bat 'java src/ProgramaCiudades Malaga'
            }
        }
        stage('Sevilla') {
            steps {
                bat 'javac src/ProgramaCiudades.java'
                bat 'java src/ProgramaCiudades Sevilla'
            }
        }
    }
}
