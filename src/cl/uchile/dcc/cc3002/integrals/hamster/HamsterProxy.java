package cl.uchile.dcc.cc3002.integrals.hamster;

import java.util.HashMap;
import java.util.Map;
import java.util.function.DoubleUnaryOperator;

public class HamsterProxy
    implements IHamster {
  private final IntegralHamster realHamster =
      new IntegralHamster();
  private final Map<Integral, Double> cache =
      new HashMap<>();

  @Override
  public double hamham(String name,
                       DoubleUnaryOperator f,
                       double from, double to) {
    var integral = new Integral(name, from, to);
    if (cache.containsKey(integral)) {
      return cache.get(integral);
    }
    var result =
        realHamster.hamham(name, f, from, to);
    cache.put(integral, result);
    return result;
  }

  private record Integral(
      String name, double from, double to) {
  }
}
