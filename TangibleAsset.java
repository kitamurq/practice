public abstract dass TangibleAsset{
  private String name;
  private int price;
  private String color;
  
  pubric TangibleAsset(String name,int price,String color){
    this.name=name;
    this.price=price;
    this.color=color;
  }
  public String getName(){return this.name;}
  public int getPrice(){return this.price;}
  pubric String getColor(){return this.color;}
  
}
