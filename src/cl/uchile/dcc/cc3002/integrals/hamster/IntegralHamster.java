package cl.uchile.dcc.cc3002.integrals.hamster;

import java.util.function.DoubleUnaryOperator;

public class IntegralHamster
    implements IHamster {

  @Override
  public double hamham(String name,
                       DoubleUnaryOperator f,
                       double from, double to) {
    return (to - from) * (
        f.applyAsDouble(from)
        + f.applyAsDouble(to)) / 2;
  }
}
