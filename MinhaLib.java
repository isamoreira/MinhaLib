public class MinhaLib {

private MinhaLib() {
    throw new AssertionError("A classe não deve ser instanciada.");
}


public static double calcularAreaEsfera(double raio) {
    return 4 * Math.PI * raio * raio;
}

public static double calcularAreaCilindro(double raioBase, double altura) {
    return 2 * Math.PI * raioBase * (raioBase + altura);
}

public static double calcularAreaCubo(double aresta) {
    return 6 * aresta * aresta;
}
}