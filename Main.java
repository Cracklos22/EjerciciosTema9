public class Main {
            public static void main(String[] args) {
                EjerciciosT9.Cliente cliente = new EjerciciosT9().new Cliente(25, "Juan", "123456789", 1000.0);
                cliente.mostrarinformacion();

                EjerciciosT9.Trabajador trabajador = new EjerciciosT9().new Trabajador(30, "Pedro", "987654321", 2000.0);
                trabajador.mostrarinformacion();
            }

            static class EjerciciosT9 {
                class Persona {
                    protected int edad;
                    protected String nombre;
                    protected String telefono;

                    public Persona(int edad, String nombre, String telefono) {
                        this.edad = edad;
                        this.nombre = nombre;
                        this.telefono = telefono;
                    }
                }

                class Cliente extends Persona {
                    private double credito;

                    public Cliente(int edad, String nombre, String telefono, double credito) {
                        super(edad, nombre, telefono);
                        this.credito = credito;
                    }

                    public void mostrarinformacion() {
                        System.out.println("Nombre: " + nombre);
                        System.out.println("Edad: " + edad);
                        System.out.println("Telefono: " + telefono);
                        System.out.println("Credito: " + credito);
                    }
                }

                class Trabajador extends Persona {
                    private double salario;

                    public Trabajador(int edad, String nombre, String telefono, double salario) {
                        super(edad, nombre, telefono);
                        this.salario = salario;
                    }

                    public void mostrarinformacion() {
                        System.out.println("Nombre: " + nombre);
                        System.out.println("Edad: " + edad);
                        System.out.println("Telefono: " + telefono);
                        System.out.println("Salario: " + salario);
                    }
                }
            }
        }