package cl.uchile.dcc.cc3002.integrals;

import java.util.function.DoubleUnaryOperator;

public class IntegralClient {

  private final IntegralAdapter
      adapter = new IntegralAdapter();

  public static void main(
      String[] args) {
    var client = new IntegralClient();
    String result =
        client.integrate(
            "(-4x + 80)",
            x -> -4 * x + 80, 0,
            20);
    System.out.println(result);
  }

  public String integrate(String name,
                          DoubleUnaryOperator f,
                          int from,
                          int to) {
    double result =
        adapter.integrate(name, f, from, to);
    return "\\int_{" + from + "}^{" + to
           + "}" + name + " = "
           + result;
  }
}
