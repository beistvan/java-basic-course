/**
 * Calculates factorial of given <code>value</code>.
 *
 * @param value positive number
 * @return factorial of <code>value</code>
 */
public static BigInteger factorial(int value) {
    BigInteger tempFactorial = BigInteger.ONE;
    for (int counter = value; counter > 0; counter--) {
        tempFactorial = tempFactorial.multiply(BigInteger.valueOf(counter));
    }
    return tempFactorial;
}
