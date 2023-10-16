package com.driver;

public class Pizza {

    private final int cheese;
    private final int paperBag;
    private int price;
    private final int topping;
    private final Boolean isVeg;
    private boolean cheeseAdded;
    private boolean isBillGenerated;
    private boolean isTakeAway;
    private boolean toppingAdded;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(this.isVeg){
            this.price = 300;
            this.topping = 70;
        } else {
            this.price = 400;
            this.topping = 120;
        }

        this.bill = "Base Price Of The Pizza: "+this.price+"\n";
        this.cheese = 80;
        this.paperBag = 20;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(this.cheeseAdded) return;
        this.cheeseAdded = true;
        this.price += this.cheese;
    }

    public void addExtraToppings(){
        if(this.toppingAdded) return;
        this.toppingAdded = true;
        this.price += this.topping;
    }

    public void addTakeaway(){
        if(this.isTakeAway) return;
        this.isTakeAway = true;
        this.price += this.paperBag;
    }

    private void generateBill(){
        if(isBillGenerated) return;
        this.isBillGenerated = true;
        if(this.cheeseAdded) this.bill += "Extra Cheese Added: "+this.cheese+"\n";
        if(this.toppingAdded)  this.bill += "Extra Toppings Added: "+this.topping+"\n";
        if(this.isTakeAway) this.bill += "Paperbag Added: "+this.paperBag+"\n";
        this.bill += "Total Price: "+this.price+"\n";
    }
    public String getBill(){
        this.generateBill();
        return this.bill;
    }
}
