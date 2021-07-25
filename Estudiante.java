import java.util.ArrayList;
import java.util.List;

public class Estudiante 
{
    private String nombre;
    private String apellido;
    private int telefono;
    private int codigo;
    private ArrayList<Curso> cursos;
    
    public Estudiante() 
    {
        this.nombre = "";
        this.apellido = "";
        this.telefono = 0;
        this.codigo = 0;
        this.cursos = new ArrayList<Curso>();
    }
    
    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){
        return this.apellido;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public int getTelefono(){
        return this.telefono;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }

    public int getCodigo(){
        return this.codigo;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    @Override
    public String toString() {
        return "Estudiante: " + this.nombre + " " + this.apellido;
    }
    
    public void setCursos(ArrayList<Curso> cursos){
        this.cursos = cursos;
    }

    public ArrayList<Curso> getCursos(){
        return this.cursos;
    }

    public void setCurso(Curso curso){
        this.cursos.add(curso);
    }

    public Curso getCurso(int index){
        return this.cursos.get(index);
    }
}