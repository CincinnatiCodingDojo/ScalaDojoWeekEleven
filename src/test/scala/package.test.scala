package scaladojoweekeleven
import org.scalatest._
import Primes
class PrimeTester extends FunSuite {

  test("An empty Set should have size 0") {
    assert(Set.empty.size == 0)
  }

  test("Should return list of primes") {
    Primes primes = new Primes
    assert(primes.getPrimes(2) == List(2))
  }
}