package design.factory.case3.pizza;

public class PizzahutCheesePizza extends Pizza {

  @Override
  public void prepare() {
    setName("Pizzahut cheese pizza");
    System.out.println("Pizzahut is preparing for cheese pizza");
  }
}