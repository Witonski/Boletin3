package Matrices;

import java.util.Scanner;

public class Trea {

    // --- NÚCLEO: Definición de Datos (FASE 1) ---

    private static String descripcionJuego = "No sabes qué ha pasado. Justo cuando terminabas las clases te quedaste el último como siempre recogiendo tus cosas. " +
            "Pero algo pasó. Lo último que recuerdas es que sentiste mucho frío y todo se volvió oscuro. Ahora estás en tu clase, pero es de noche y el instituto está cerrado." +
            "¿Nadie te ha visto? ¿Por qué las limpiadoras no te han despertado?";

    // Mapa de habitaciones (Array de Strings) [cite: 55]
    private static String[] habitaciones = {
            "Estás en tu cubículo. Huele a café rancio. Hay una **puerta de salida** a la IZQUIERDA, y tu escritorio a la DERECHA.",
            "Estás en el Pasillo Central. Oyes gruñidos débiles. Tienes tu **Cubículo** a la DERECHA y la **Sala de Reuniones** a la IZQUIERDA.",
            "Estás en la Sala de Reuniones (La Cocineta). Hay una puerta sellada con cinta a la DERECHA. En la mesa, brilla una **'taza'** y una **'tarjeta_acceso'**.",
    };

    // Objetos que hay en cada habitación (Matriz de Strings) [cite: 60, 63]
    private static String[][] objetosMapa = {
            {"portatil", null},
            {null, null},
            {"taza", "tarjeta_acceso"},
    };

    // Inventario del jugador (Array de tamaño fijo, vacíos son null) [cite: 58, 59]
    private static String[] inventario = new String[5];

    // Posición actual del jugador (Variable int) [cite: 56]
    private static int habitacionActual = 0;

    // Bandera para la condición de victoria
    private static boolean victoria = false;

    // --- FIN DE LA DEFINICIÓN DE DATOS ---


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean jugando = true;

        System.out.println("¡Bienvenido a 'ESCAPE DE LA OFICINA ZOMBIE'!");
        System.out.println("------------------------------------------");
        System.out.println(descripcionJuego); // Mostrar introducción [cite: 49]
        System.out.println("------------------------------------------");
        mirarHabitacion();

        // Bucle principal (debe terminar con "salir" o victoria) [cite: 50, 53]
        while (jugando && !victoria) {

            System.out.print("\n> ");
            String comando = scanner.nextLine().toLowerCase().trim(); // Leer comandos [cite: 51]

            // Parser de comandos (switch/if-else if) [cite: 64]
            if (comando.startsWith("ir ")) {
                procesarComandoIr(comando.substring(3)); // ir derecha/izquierda [cite: 70]
            } else if (comando.startsWith("coger ")) {
                procesarComandoCoger(comando.substring(6)); // coger [objeto] [cite: 73]
            } else if (comando.startsWith("usar ")) {
                procesarComandoUsar(comando.substring(5));
            } else {
                switch (comando) {
                    case "ayuda":
                        mostrarAyuda(); // ayuda [cite: 69]
                        break;
                    case "mirar":
                        mirarHabitacion(); // mirar [cite: 71]
                        break;
                    case "inventario":
                        mostrarInventario(); // inventario [cite: 75]
                        break;
                    case "salir":
                        jugando = false; // salir [cite: 76]
                        break;
                    default:
                        System.out.println("Comando no reconocido. Escribe 'ayuda' para ver los comandos disponibles.");
                        break;
                }
            }
        }

        // Mensaje de fin de juego
        if (victoria) {
            System.out.println("\n*** ¡VICTORIA! ***");
            System.out.println("Lograste activar la puerta con la tarjeta. ¡Has escapado!");
        } else {
            System.out.println("\n¡Gracias por jugar! El juego ha terminado.");
        }
        scanner.close();
    } // <--- 1. CIERRE DEL MÉTODO main

    // --- MÉTODOS AUXILIARES ---

    /** Verifica si un objeto está en el inventario. */
    private static boolean tieneObjeto(String objeto) {
        for (String item : inventario) {
            if (item != null && item.equals(objeto)) {
                return true;
            }
        }
        return false;
    }

    /** Muestra el listado de comandos disponibles. (ayuda) [cite: 69]*/
    private static void mostrarAyuda() {
        System.out.println("\n--- Ayuda: Comandos Disponibles ---");
        System.out.println("**ayuda**\t\t Muestra este listado.");
        System.out.println("**ir derecha/izquierda** Cambia de habitación si es posible.");
        System.out.println("**mirar**\t\t Vuelve a mostrar la descripción de la sala y los objetos.");
        System.out.println("**inventario**\t\t Muestra lo que llevas encima.");
        System.out.println("**coger [objeto]**\t Coge un objeto de la sala y lo añade al inventario.");
        System.out.println("**usar [objeto]**\t Intenta interactuar con el entorno usando un objeto.");
        System.out.println("**salir**\t\t Termina el juego.");
    } // <--- 2. CIERRE DEL MÉTODO mostrarAyuda

    /** Muestra la descripción de la sala actual y los objetos en ella. (mirar) [cite: 71, 72]*/
    private static void mirarHabitacion() {
        System.out.println("\n--- Estás aquí ---");
        System.out.println(habitaciones[habitacionActual]);

        // Mostrar objetos en la sala
        System.out.print("Objetos visibles: ");
        boolean hayObjetos = false;
        for (String objeto : objetosMapa[habitacionActual]) {
            if (objeto != null) {
                System.out.print("**" + objeto + "** ");
                hayObjetos = true;
            }
        }

        if (!hayObjetos) {
            System.out.print("Ninguno.");
        }
        System.out.println();
    } // <--- 3. CIERRE DEL MÉTODO mirarHabitacion

    /** Procesa el comando 'ir' (derecha o izquierda) y cambia de sala si es posible. [cite: 70]*/
    private static void procesarComandoIr(String direccion) {
        int nuevaHabitacion;

        if (direccion.equals("derecha")) {
            nuevaHabitacion = habitacionActual + 1;
        } else if (direccion.equals("izquierda")) {
            nuevaHabitacion = habitacionActual - 1;
        } else {
            System.out.println("Dirección no válida. Intenta 'ir derecha' o 'ir izquierda'.");
            return;
        }

        // Comprobamos los límites del array
        if (nuevaHabitacion >= 0 && nuevaHabitacion < habitaciones.length) {
            habitacionActual = nuevaHabitacion;
            mirarHabitacion();
        } else {
            System.out.println("¡No puedes ir en esa dirección! Es el límite del mapa o una pared.");
        }
    } // <--- 4. CIERRE DEL MÉTODO procesarComandoIr

    /** Muestra el contenido del inventario. (inventario) [cite: 75]*/
    private static void mostrarInventario() {
        System.out.println("\n--- Inventario ---");
        boolean vacio = true;
        for (String objeto : inventario) {
            if (objeto != null) { // Solo mostramos los que no son null [cite: 75]
                System.out.print("**" + objeto + "** ");
                vacio = false;
            }
        }
        if (vacio) {
            System.out.println("Tu inventario está vacío.");
        }
        System.out.println();
    } // <--- 5. CIERRE DEL MÉTODO mostrarInventario

    /** Intenta coger un objeto de la sala y meterlo en el inventario. (coger [objeto]) [cite: 73, 74]*/
    private static void procesarComandoCoger(String objetoACoger) {

        // 1. Buscar el objeto en la sala actual
        int indiceObjetoEnSala = -1;
        String[] objetosEnSala = objetosMapa[habitacionActual];
        for (int i = 0; i < objetosEnSala.length; i++) {
            if (objetosEnSala[i] != null && objetosEnSala[i].equals(objetoACoger)) {
                indiceObjetoEnSala = i;
                break;
            }
        }

        if (indiceObjetoEnSala == -1) {
            System.out.println("No hay ningún objeto llamado **" + objetoACoger + "** en esta sala.");
            return;
        }

        // 2. Buscar el primer hueco null en el inventario [cite: 74]
        int indiceVacioInventario = -1;
        for (int i = 0; i < inventario.length; i++) {
            if (inventario[i] == null) {
                indiceVacioInventario = i;
                break;
            }
        }

        if (indiceVacioInventario == -1) {
            System.out.println("¡Tu inventario está lleno!");
            return;
        }

        // 3. Mover el objeto
        inventario[indiceVacioInventario] = objetoACoger; // Añadir al inventario
        objetosEnSala[indiceObjetoEnSala] = null; // Quitar de la sala

        System.out.println("Has cogido **" + objetoACoger + "** y lo has guardado en tu inventario.");
    } // <--- 6. CIERRE DEL MÉTODO procesarComandoCoger

    /** Procesa el comando 'usar' y verifica si hay una acción asociada. */
    private static void procesarComandoUsar(String objeto) {
        if (!tieneObjeto(objeto)) {
            System.out.println("No tienes el objeto **" + objeto + "** en tu inventario.");
            return;
        }

        // Lógica de USAR TAREJTA_ACCESO en HABITACIÓN 2 (Condición de Victoria)
        if (objeto.equals("tarjeta_acceso") && habitacionActual == 2) {
            System.out.println("Introduces la **tarjeta_acceso** en el lector de la puerta sellada.");
            victoria = true;
        } else if (objeto.equals("tarjeta_acceso") && habitacionActual != 2) {
            System.out.println("Usas la **tarjeta_acceso** pero no hay ningún lector o puerta compatible aquí.");
        }
        else {
            System.out.println("El objeto **" + objeto + "** no parece tener ninguna utilidad en esta sala.");
        }
    } // <--- 7. CIERRE DEL MÉTODO procesarComandoUsar

} // <--- 8. CIERRE DE LA CLASE Trea. ¡Esta es la llave que suele faltar!