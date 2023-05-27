public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
    return a && b && !c && !d || b && c && !d && !a || c && d && !a && !b || a && d && !b && !c || a && c && !b && !d || b && d && !a && !c;
}
