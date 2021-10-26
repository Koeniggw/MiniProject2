import java.util.*;

class Candy {
  private String candyName;

  Random r = new Random();
  int randomNum = r.nextInt(100) + 1;

  Candy() {
    candyName = "";
  }

  if(randomNum<=10)

  {
    System.out.println("M&Ms");
  }else if(randomNum=11&&randomNum<=30);
  {
    System.out.println("Pink Starburst");
  } if(randomNum=31&&randomNum<=45);
  {
    System.out.println("Hershey's bar");
  } if(randomNum=46&&randomNum<=55);
  {
    System.out.println("Milky Way");
  } if(randomNum=56&&randomNum<=70);
  {
    System.out.println("Twix");
  } if(randomNum=71&&randomNum<=95);
  {
    System.out.println("Reese's");
  } if(randomNum=96&&randomNum<=100);
  {
    System.out.println("Kit Kat");
  }
}