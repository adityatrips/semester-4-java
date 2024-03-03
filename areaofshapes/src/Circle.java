public class Circle implements Area {
  public float compute(float radius, float notUsed) {
    return (float) (Area.pi * Math.pow(radius, 2));
  }
}
