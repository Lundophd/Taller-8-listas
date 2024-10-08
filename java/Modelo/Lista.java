package Modelo;

public class Lista {
    private Nodo cabeza = null;
    private Nodo cola = null;
    private static Lista unico = null;

    public static Lista getIntance() {
        if (unico == null)
            unico = new Lista();
        return unico;
    }

    public void adicionarNodo(String nombre) {
        Nodo nuevo = new Nodo(nombre);

        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo; // Asegura que cabeza y cola apunten al mismo nodo
        } else {
            cola.setSiguiente(nuevo);
            nuevo.setAnterior(cola);
            cola = nuevo;
        }
    }

    public String recorrer_cabeza_cola() throws Exception {
        Nodo recorrido = cabeza;
        StringBuilder rta = new StringBuilder();

        if (recorrido != null) {
            while (recorrido != null) {
                rta.append(recorrido.getNombre()).append("\n");
                recorrido = recorrido.getSiguiente();
            }
        } else {
            throw new Exception("No existe elementos en la lista");
        }
        return rta.toString();
    }

    public String recorrer_cola_cabeza() throws Exception {
        Nodo recorrido = cola;
        StringBuilder rta = new StringBuilder();

        if (recorrido != null) {
            while (recorrido != null) {
                rta.append(recorrido.getNombre()).append("\n");
                recorrido = recorrido.getAnterior();
            }
        } else {
            throw new Exception("No existe elementos en la lista");
        }
        return rta.toString();
    }
}
