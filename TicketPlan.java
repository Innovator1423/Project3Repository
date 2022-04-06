/*
Richard Castillo 
3/1/22
CSC 251-N801
Jean Schoenheit
ProgrammingExam1
*/
//the class that holds all my values for the constructors as well as the methods it will use in the demo
public class TicketPlan
{
  //all the values that will be used for each method or determine other variables values in some way
  private String familyLastName;
  private int ticketPlanType;
  private int numAdults;
  private int numChildren;
  private int numDays;
  private double planPrice;
  private double costPerChild =0;
  private double costPerAdult =0;
  
  //calculates the cost of an adult ticket
  public double getCostPerDayAdult()
  {
    //final variables that will pass on their value to the appropriate variable
    final double BASE_ADULT_AMUSEMENT_PARK = 104.99;
    final double BASE_ADULT_WATER_PARK = 84.99;
    final double BASE_ADULT_BOTH_PARK = 169.99;
    final double DISCOUNT_ADULT_AMUSEMENT_PARK = 94.99;
    final double DISCOUNT_ADULT_WATER_PARK = 79.99;
    final double DISCOUNT_ADULT_BOTH_PARK = 149.99;
    //decistion structures that change the value of each ticket based on days spent and park chosen
    if (numDays <= 4)
    {
      switch (ticketPlanType)
      {
        case 1:
        costPerAdult = BASE_ADULT_AMUSEMENT_PARK;
        break;
        case 2:
        costPerAdult = BASE_ADULT_WATER_PARK;
        break;
        case 3:
        costPerAdult = BASE_ADULT_BOTH_PARK;
        break;
      }
    }

    if (numDays > 4)
    {
      switch (ticketPlanType)
      {
        case 1:
        costPerAdult = DISCOUNT_ADULT_AMUSEMENT_PARK;
        break;
        case 2:
        costPerAdult = DISCOUNT_ADULT_WATER_PARK;
        break;
        case 3:
        costPerAdult = DISCOUNT_ADULT_BOTH_PARK;
        break;
      }
    }

    return costPerAdult;
  }
//calculate the cost of a childs ticket
  public double getCostPerDayChild()
  {
    //final variables that will pass on their value to the appropriate variable
    final double BASE_CHILD_AMUSEMENT_PARK = 52.49;
    final double BASE_CHILD_WATER_PARK = 42.49;
    final double BASE_CHILD_BOTH_PARK = 84.99;
    final double DISCOUNT_CHILD_AMUSEMENT_PARK = 47.49;
    final double DISCOUNT_CHILD_WATER_PARK = 39.99;
    final double DISCOUNT_CHILD_BOTH_PARK = 74.99;
    //decistion structures that change the value of each ticket based on children present spent and park chosen
    if (numChildren <= 2)
    {
      switch (ticketPlanType)
      {
        case 1:
        costPerChild = BASE_CHILD_AMUSEMENT_PARK;
        break;
        case 2:
        costPerChild = BASE_CHILD_WATER_PARK;
        break;
        case 3:
        costPerChild = BASE_CHILD_BOTH_PARK;
        break;
      }
    }

    if (numChildren > 2)
    {
      switch (ticketPlanType)
      {
        case 1:
        costPerChild = DISCOUNT_CHILD_AMUSEMENT_PARK;
        break;
        case 2:
        costPerChild = DISCOUNT_CHILD_WATER_PARK;
        break;
        case 3:
        costPerChild = DISCOUNT_CHILD_BOTH_PARK;
        break;
      }
    }

    return costPerChild;
  }
  
//calculates the cost of a plan given the amount of people, their age and stay duration
  public double getPlanPrice()
  {

   planPrice = ((costPerChild * numChildren) + (costPerAdult * numAdults)) * numDays;

    return planPrice;
  }
  
//setter methods to set the values for the demo for the user
  public void setFamilyLastName(String fLastName)
  {
    familyLastName = fLastName;
  }

  public void setTicketPlanType(int tPlanType)
  {
    ticketPlanType = tPlanType;
  }

  public void setNumAdults(int nAdults)
  {
    numAdults = nAdults;
  }

  public void setNumChildren(int nChildren)
  {
    numChildren = nChildren;
  }

  public void setNumDays(int nDays)
  {
    numDays = nDays;
  }

//getter methods so the user can request data from the main
  public String getFamilyLastName()
  {
    return familyLastName;
  }

  public int getTicketPlanType()
  {
    return ticketPlanType;
  }

  public int getNumAdults()
  {
    return numAdults;
  }

  public int getNumChildren()
  {
    return numChildren;
  }

  public int getNumDays()
  {
    return numDays;
  }


//Constructors that accept a no-arg option and one with arg
  public TicketPlan()
  {
    familyLastName = "";
    ticketPlanType = 0;
    numAdults = 0;
    numChildren = 0;
    numDays = 0;
  }

  public TicketPlan(String fLastName, int tPlanType, int nAdults, int nChildren, int nDays)
  {
    familyLastName = fLastName;
    ticketPlanType = tPlanType;
    numAdults = nAdults;
    numChildren = nChildren;
    numDays = nDays;
    getCostPerDayChild();
    getCostPerDayAdult();
  }  
}
