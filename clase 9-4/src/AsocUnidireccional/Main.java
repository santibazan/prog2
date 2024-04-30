package AsocUnidireccional;

public class Main {
    public static void main(String[] args) {

        Universidad u1 = new Universidad("Univirsidad Nacional de Cuyo");
        Universidad u2 = new Universidad("Universidad de Mendoza");
        Universidad u3 = new Universidad("Universidad Tecnologica Nacional");

        Estudiantes e1 = new Estudiantes("Santiago", u1);
        Estudiantes e2 = new Estudiantes("Jorge", u2);
        Estudiantes e3 = new Estudiantes("Matias", u3);

        System.out.println("El alumno "+e1.getNombre()+" pertenece a la "+ u1.getNombreU());
        System.out.println("El alumno "+e2.getNombre()+" pertenece a la "+ u2.getNombreU());
        System.out.println("El alumno "+e3.getNombre()+" pertenece a la "+ u3.getNombreU());

        e1.cambiarUniversidad(u3);
        System.out.println("El estudiante "+e1.getNombre()+ " se cambio a la "+e1.getUniv().getNombreU());
    }
}
