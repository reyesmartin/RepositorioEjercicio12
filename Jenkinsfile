pipeline {
    agent any

    stages {
        stage('Barcelona') {
            steps {
                script {
                    def barcelona = new Barcelona()
                    echo "Población final de Barcelona: ${barcelona.calcularPoblacionFinal()}"
                }
            }
        }
        stage('Córdoba') {
            steps {
                script {
                    def cordoba = new Cordoba()
                    echo "Población final de Córdoba: ${cordoba.calcularPoblacionFinal()}"
                }
            }
        }
        // Resto de stages para las demás ciudades
    }
}

