package cl.uchile.dcc.cc3002.integrals;

import cl.uchile.dcc.cc3002.integrals.hamster.HamsterProxy;
import cl.uchile.dcc.cc3002.integrals.hamster.IHamster;

import java.util.function.DoubleUnaryOperator;

public class IntegralAdapter {
  private final IHamster hamster =
      new HamsterProxy();

  public double integrate(
      String name,
      DoubleUnaryOperator f, int from,
      int to) {
    return hamster.hamham(name, f, from, to);
  }
}
