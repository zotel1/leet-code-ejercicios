package algoritmos_y_estructura_de_datos.dos_listNode;
/**
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order,
 * and each of their nodes contains a single digit.
 * Add the two numbers and return the sum as a linked list.
 * You may assume the two numbers do not contain any leading zero,
 * except the number 0 itself.
 * Example 1:
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 * Output: [7,0,8]
 * Explanation: 342 + 465 = 807.
 * Example 2:
 * Input: l1 = [0], l2 = [0]
 * Output: [0]
 * Example 3:
 * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * Output: [8,9,9,9,0,0,0,1]
 * Constraints:
 *
 * The number of nodes in each linked list is in the range [1, 100].
 * 0 <= Node.val <= 9
 * It is guaranteed that the list represents a number that does not have leading zeros.**/
public class Solution {
    // =========================================================================
    // 1. ESTRUCTURA DEL NODO (ListNode)
    // =========================================================================
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    // =========================================================================
    // 2. MÉTODO PRINCIPAL (MAIN)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("=== PRUEBA SIMPLIFICADA: ADD TWO NUMBERS ===");

        // Construcción de Lista 1: [2, 4, 3] (342)
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        // Construcción de Lista 2: [5, 6, 4] (465)
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        System.out.print("Lista 1: ");
        imprimirLista(l1);
        System.out.print("Lista 2: ");
        imprimirLista(l2);
        System.out.println("------------------------------------------");

        // Ejecución
        ListNode resultado = addTwoNumbers(l1, l2);

        System.out.print("Resultado: ");
        imprimirLista(resultado); // Muestra: 7 -> 0 -> 8
        System.out.println("==========================================");
    }

    // =========================================================================
    // 3. EL ALGORITMO DE LA SUMA (Versión Explicada y Desglosada)
    // =========================================================================
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Creamos nuestro nodo base "ficticio" y el puntero que va a ir avanzando
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;

        int carry = 0; // El acarreo (lo que "me llevo")

        // El bucle se ejecuta mientras quede algo por procesar en l1, en l2, o haya un carry pendiente
        while (l1 != null || l2 != null || carry != 0) {

            int x = 0; // Aquí guardaremos el dígito del nodo actual de l1
            int y = 0; // Aquí guardaremos el dígito del nodo actual de l2

            // --- REEMPLAZO DEL PRIMER OPERADOR TERNARIO ---
            // Si l1 todavía tiene nodos, extraemos su valor.
            // Si l1 ya llegó al final (es null), x se queda en 0.
            if (l1 != null) {
                x = l1.val;
            } else {
                x = 0;
            }

            // --- REEMPLAZO DEL SEGUNDO OPERADOR TERNARIO ---
            // Hacemos exactamente lo mismo para l2.
            if (l2 != null) {
                y = l2.val;
            } else {
                y = 0;
            }

            // Sumamos los dos dígitos más lo que nos llevábamos de la vuelta anterior
            int sum = x + y + carry;

            // Calculamos el nuevo acarreo para la próxima vuelta.
            // Si sum es 10 o más, la división entera dará 1. Si es menor, dará 0.
            carry = sum / 10;

            // Creamos el nuevo nodo con el dígito de la unidad (ej: si sum es 12, guarda el 2)
            curr.next = new ListNode(sum % 10);

            // Movemos nuestro puntero "curr" al nodo que acabamos de crear
            curr = curr.next;

            // --- AVANZAR EN LAS LISTAS ORIGINALES ---
            // Solo podemos pasar al siguiente nodo si el actual existe
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        // Devolvemos el nodo siguiente al ficticio, que es donde arranca nuestro resultado real
        return dummyHead.next;
    }

    // =========================================================================
    // 4. MÉTODO AUXILIAR
    // =========================================================================
    public static void imprimirLista(ListNode nodo) {
        while (nodo != null) {
            System.out.print(nodo.val);
            if (nodo.next != null) {
                System.out.print(" -> ");
            }
            nodo = nodo.next;
        }
        System.out.println();
    }
}
