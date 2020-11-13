package cl.uchile.dcc.cc3002.integrals.hamster;

import java.util.function.DoubleUnaryOperator;

public interface IHamster {
  double hamham(String name,
                DoubleUnaryOperator f,
                double from, double to);
}
