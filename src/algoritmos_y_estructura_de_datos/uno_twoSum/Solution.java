package algoritmos_y_estructura_de_datos.uno_twoSum;

import java.util.Arrays;

/**
 * 1. Two Sum
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 * Example 1:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * Example 2:
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * Example 3:
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 * Constraints:
 * 2 <= nums.length <= 104
 * -109 <= nums[i] <= 109
 * -109 <= target <= 109
 * Only one valid answer exists.
 * Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?**/
public class Solution {

    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int firstElement = nums[i];
                int secondElement = nums[j];
                int sum = firstElement + secondElement;
                if (sum == target) {
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        // 1. Creamos la instancia de la clase Solution
        Solution solucion = new Solution();

        // 2. Definimos datos de prueba (inputs)
        int[] misNumeros = {2, 7, 11, 15};
        int objetivo = 9;

        // 3. Llamamos al método usando el objeto y guardamos el resultado
        int[] resultado = solucion.twoSum(misNumeros, objetivo);

        // 4. Imprimimos el resultado formateado como texto
        System.out.println("Índices encontrados: " + Arrays.toString(resultado));

    }
}
