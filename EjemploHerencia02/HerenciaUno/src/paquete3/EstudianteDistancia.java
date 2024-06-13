
package paquete3;

public class EstudianteDistancia extends Estudiante{
    
    private int numeroAsignaturas;
    private double costoAsignatura;
    private double matriculaDistancia;
    
    public EstudianteDistancia(String n, String ap, String iden, int e){
        // lo que hago en la siguiente linea es llamar al contructor de la superclase
        super(n, ap, iden, e);
    }
    
    // 2.  Método establecerNumeroAsginaturas(numero: Real)
    public void establecerNumeroAsginaturas(int numero){
        numeroAsignaturas = numero;
    }
    
    // 3.  Método establecerCostoAsignatura(valor: Real)
    public void establecerCostoAsignatura(double valor){
        costoAsignatura = valor;
    }

    // 4.  Método calcularMatriculaDistancia()
    public void calcularMatriculaDistancia(){
        matriculaDistancia = numeroAsignaturas * costoAsignatura;
    }

    //  Métodos obtener para los datos o atributos de la clase
    // 5. Método obtenerNumeroAsignaturas() : Entero
    public int obtenerNumeroAsignaturas(){
        return numeroAsignaturas; 
    }

    // 6. Método obtenerCostoAsignatura() : Real
    public double obtenerCostoAsignatura(){
        return costoAsignatura;
    }

    // 7. Método obtenerMatriculaDistancia() : Real
    public double obtenerMatriculaDistancia(){
        return matriculaDistancia;
    }
    /*
    @Override
    public String toString(){
        String cadena = String.format("Nombre Estudiante:%s\n "
                + "Numero de asignaturas: %d\n"
                + "Valor de aignatura: %.2f\n"
                + "Valor matricula: %.2f\n",
                obtenerNombresEstudiante(),
                numeroAsignaturas,
                costoAsignatura, 
                obtenerMatriculaDistancia());
        
        return cadena;
    }
    */
    // Es esta toString estmos llamndo al superToString ya que aqui ya esta 
    // formada una cadena 
    @Override
    public String toString(){
        String cadena = String.format("%s\n"
                + "Numero de asignaturas: %d\n"
                + "Valor de aignatura: %.2f\n"
                + "Valor matricula: %.2f\n",
                super.toString(),
                numeroAsignaturas,
                costoAsignatura, 
                obtenerMatriculaDistancia());
        
        return cadena;
    }
}


