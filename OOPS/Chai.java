package OOPS;

public class Chai {
  private String type = "";
  private double temperature = 0;
  private boolean isEmpty = true;

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public double getTemperature() {
    return temperature;
  }

  public void setTemperature(double temperature) {
    this.temperature = temperature;
  }

  public boolean isEmpty() {
    return isEmpty;
  }

  public void setEmpty(boolean isEmpty) {
    this.isEmpty = isEmpty;
  }

  public Chai(String type, double temperature, boolean isEmpty) {
    this.type = type;
    this.temperature = temperature;
    this.isEmpty = isEmpty;
  }

  public Chai(Chai Other) {
    this.type = Other.type;
    this.temperature = Other.temperature;
    this.isEmpty = Other.isEmpty;
  }

  @Override
  public String toString() {
    return String.format("{\n\ttype : \"%s\",\n\ttemperature : \"%.2f\",\n\tisEmpty : \"%b\"\n},", type, temperature,
        isEmpty);
  }

}
