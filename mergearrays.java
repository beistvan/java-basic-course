/**
 * Merges two given sorted arrays into one
 *
 * @param a1 first sorted array
 * @param a2 second sorted array
 * @return new array containing all elements from a1 and a2, sorted
 */
public static int[] mergeArrays(int[] a1, int[] a2) {
    int i = 0, j = 0, k = 0, n1 = a1.length, n2 = a2.length;
    int[] a3 = new int[n1 + n2];
    while (i < n1 && j < n2)
        {
            if (a1[i] < a2[j])
                a3[k++] = a1[i++];
            else
                a3[k++] = a2[j++];
        }

        while (i < n1)
            a3[k++] = a1[i++];

        while (j < n2)
            a3[k++] = a2[j++];
    return a3;
}